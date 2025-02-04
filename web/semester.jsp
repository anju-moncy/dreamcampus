<%-- 
    Document   : semester
    Created on : Apr 22, 2016, 12:34:34 PM
    Author     : Anjana
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.0//EN" "http://www.w3.org/TR/REC-html40/strict.dtd">
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
     <body bgcolor="lightblue" text="blue">
        <center>
        <font face="Comic Sans MS">
        <h1><b>Add Semester</b></h1>
        <br>
        <br>
        
        <form method="POST" action="semester">
            <table>
               
                <tr>
                    <th>Semester</th>
                    <td> <input type="text" name="semester"></td>
                </tr>
                <tr>
                    <td> </td>
                    <td> <input type="submit" value="Add"></td>
                    <td> </td>
                    <td><a href="principalhome.jsp">Back</a></td>
                </tr>
            </table>
        </form>
        </font> 
    </center>   
    </body>
</html>
