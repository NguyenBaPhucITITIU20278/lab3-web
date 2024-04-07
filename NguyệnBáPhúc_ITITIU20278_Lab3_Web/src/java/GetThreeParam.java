



import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@WebServlet(urlPatterns = {"/NewServlet"})
public class GetThreeParam extends HttpServlet {

    

   
    @Override
protected void doGet(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {
    // Include the logic you want to execute for GET requests here
    doPost(request, response);
}

@Override
protected void doPost(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {
    // Include the logic you want to execute for POST requests here
    String student1 = request.getParameter("studentName1");
    String student2 = request.getParameter("studentName2");
    String student3 = request.getParameter("studentName3");
    response.setContentType("text/html;charset=UTF-8");
    try (PrintWriter out = response.getWriter()) {
        /* TODO output your page here. You may use following sample code. */
        
        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<title>NewServlet</title>");            
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>Reading Three Request Parameters  </h1>");
        out.println("<h1>Student 1: " + student1 + "</h1>");
        out.println("<h1>Student 2: " + student2 + "</h1>");
        out.println("<h1>Student 3: " + student3 + "</h1>");
        out.println("<form>");
        out.println("<input type=\"button\" value=\"Back\" onclick=\"history.back()\" />");
        out.println("<input type=\"button\" value=\"Ex2\" onclick=\"location.href='PersonalInfor.jsp'\" />");
        out.println("</form>");
        out.println("</body>");
        out.println("</html>");
    }
}


    
    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
