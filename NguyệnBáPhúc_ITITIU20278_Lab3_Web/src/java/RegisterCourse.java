

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest; 
import jakarta.servlet.http.HttpServletResponse;



@WebServlet(urlPatterns = {"/RegisterCourse"})
public class RegisterCourse extends HttpServlet {

    @Override
protected void doGet(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {
    // Include the logic you want to execute for GET requests here
    doPost(request, response);
}

  
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String ID = request.getParameter("id");
        String Name = request.getParameter("fullName");
        String email = request.getParameter("email");
        String maleCheck = request.getParameter("male");
        String femaleCheck = request.getParameter("female");
        String gender = null;
        String Major = request.getParameter("major");
        String comment = request.getParameter("Comment");
        
        response.setContentType("text/html;charset=UTF-8");
        
        
        if (maleCheck != null) {
            gender = "Male";
        }
        if (femaleCheck != null) {
            gender = "Female";
        }
           try (PrintWriter out = response.getWriter()) {
    /* TODO output your page here. You may use the following sample code. */
    out.println("<!DOCTYPE html>");
    out.println("<html>");
    out.println("<head>");
    out.println("<title class=\"tittle\">Servlet GetInfor</title>");
    out.println("<link href=\"css/style.css\" rel=\"stylesheet\" type=\"text/css\">");
    out.println("</head>");
    out.println("<body>");
    out.println("<h1>Result of Register</h1>");
    out.println("<table class=\"center\" >");
    out.println("<tr><td>ID:</td><td> " + ID + " </td></tr>");
    out.println("<tr><td>Name:</td><td> " + Name + " </td></tr>");
    out.println("<tr><td>Email:</td><td>" + email + "</td></tr>");
    out.println("<tr><td>Gender:</td><td>" + gender +"</td></tr>");
    out.println("<tr><td>Major:</td><td>" + Major + "</td></tr>");
    out.println("<tr><td>You have selected:</td><td>");
String[] subjects = request.getParameterValues("subjects[]");
if (subjects != null) {
    out.println("<ul class=\"selected-subjects\">");
    for (String subject : subjects) {
        out.println("<li>" + subject + "</li>");
    }
    out.println("</ul>");
} else {
    out.println("No subjects selected");
}
out.println("</td></tr>");
    
    out.println("<tr><td>Comment:</td><td>" + comment + "</td></tr>");
    out.println("</table>");
    out.println("<input type=\"button\" value=\"Back\" onclick=\"history.back()\" />");
    

    out.println("</body>");
    out.println("</html>");
}
    }


    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}