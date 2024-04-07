<%-- 
    Document   : RegisterForm
    Created on : Apr 7, 2024, 4:05:00 PM
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link href="css/style.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        <h1>School of Computer Science & Engineering</h1>
        
        <h2>Register Form</h2>
         <form method="get" action="./RegisterCourse"  ">
            <div >
                <label class="ID-label" for="id">ID</label>
        <input class="ID" type="text" id="id" name="id" required>
            </div>
            <div  >
                <label class="fullname-label" for="fullName">Full Name</label>
        <input class="fullname" type="text" id="fullName" name="fullName" required>
            </div>
            <div class="form-group">
        <label for="email">Email</label>
        <input type="email" id="email" name="email" required>
            </div>
            <div class="form-group">
        <label for="gender">Gender</label>
        <div class="selection">
            Male  <input type="checkbox" name="male" value="ON" />
            Female<input type="checkbox" name="female" value="ON" />
        </div>
        
            </div >
            <div >
        <label for="Major">Field of study</label>        
        <select class="field" name="major" id="major">
                    <option value="IT">IT</option>
                    <option value="CS">CS</option>
                    <option value="DS">DS</option>
                    <option value="AI">AI</option>
                </select>
            </div>
            <div class="list">
        <label for="subjects">List of Subjects:</label>
        <div class="checkbox-group" >
          <input type="checkbox" id="math" name="subjects[]" value="Principle of EE1">
          <label for="math">Principle of EE1</label>
          <br>
          <input type="checkbox" id="physics" name="subjects[]" value="Computer Network">
          <label for="physics">Computer Network</label>
          <br>
          <input type="checkbox" id="chemistry" name="subjects[]" value="Web Application Development">
          <label for="chemistry">Web Application Development</label>
          <br>
          <input type="checkbox" id="biology" name="subjects[]" value="Object Oriented Programming">
          <label for="biology">Object Oriented Programming</label>
          <br>
          <input type="checkbox" id="biology" name="subjects[]" value="Computer Graphics">
          <label for="biology">Computer Graphics</label>
        </div>
      </div>  
            
         <div>
                <label class="IntertingField" for="comment">Comment</label>  
         <textarea class="comment" name="Comment" rows="4" cols="20">
         </textarea>
            </div> 
         <div class="button">
             <input type="submit" value="Submit"  />
         <input type="reset" value="Reset" />
         <button onclick="history.back()">Go Back</button>

            </div>   
            </form>   
    </body>
</html>
