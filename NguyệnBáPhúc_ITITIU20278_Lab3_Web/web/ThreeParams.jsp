<!DOCTYPE html>
<!--
Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Html.html to edit this template
-->
<html>
    <head>
        <title>Collect Three Parameters</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
    </head>
    <body>
        
        <h1> Collect Three Students </h1><hr>
        <form method="get" action="./NewServlet"> 
        Student 1: <input type ="text" name="studentName1"><br>
        Student 2: <input type ="text" name="studentName2"><br>
        Student 3: <input type ="text" name="studentName3"><br>
            <input type="reset" value="Reset" name="Reset" />
        
            <input type="submit" value="Submit">
        </form>
    </body>
</html>