/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@WebServlet(urlPatterns = {"/GetInfor"})
public class GetInfor extends HttpServlet {

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
    out.println("<h1>Reading Personal Information</h1>");
    out.println("<table class=\"center\" >");
    out.println("<tr><td>ID:</td><td> " + ID + " </td></tr>");
    out.println("<tr><td>Name:</td><td> " + Name + " </td></tr>");
    out.println("<tr><td>Email:</td><td>" + email + "</td></tr>");
    out.println("<tr><td>Gender:</td><td>" + gender +"</td></tr>");
    out.println("<tr><td>Major:</td><td>" + Major + "</td></tr>");
    out.println("<tr><td>Interests:</td><td>" + comment + "</td></tr>");
    out.println("</table>");
    out.println("<input type=\"button\" value=\"Back\" onclick=\"history.back()\" />");
    out.println("<input class=\"button\" type=\"button\" value=\"Ex3\" onclick=\"location.href='RegisterForm.jsp'\" />");

    out.println("</body>");
    out.println("</html>");
}
    }


    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
