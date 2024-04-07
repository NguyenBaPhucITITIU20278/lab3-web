<%-- 
    Document   : PersonalInfor
    Created on : Apr 6, 2024, 11:55:34 PM
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
       
        <h1> Personal Information</h1>
        <form method="get" action="./GetInfor"  ">
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
            <div class="form-group">
        <label for="Major">Major</label>        
                <select name="major" id="major">
                    <option value="BA">Business Administration</option>
                    <option value="IT">Information Technology</option>
                    <option value="DS">Data Science</option>
                </select>
            </div>
            <div>
                <label class="IntertingField" for="comment">Interesting Field</label>  
         <textarea class="comment" name="Comment" rows="4" cols="20">
         </textarea>
            </div>
            <div class="button">
         <input type="submit" value="Insert" />
         <input type="reset" value="Cancel" />
         <button onclick="history.back()">Go Back</button>
            </div>
            
        </form>
    </body>
</html>
