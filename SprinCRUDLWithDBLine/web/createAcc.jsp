<%-- 
    Document   : createAcc
    Created on : Feb 10, 2019, 10:23:10 AM
    Author     : HP
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="save.htm" method="post">
            <table border="0" cellspacing="5">
                
                <tbody>
                    
                    <tr>
                        <td>ID</td>
                        <td>:</td>
                        <td><input type="text" name="id"/></td>
                    </tr>
                   <tr>
                        <td>Name</td>
                        <td>:</td>
                        <td><input type="text" name="name"/></td>
                        <td><form:errors path="login.name"/></td>
                    </tr>
                   <tr>
                        <td>Email</td>
                        <td>:</td>
                        <td><input type="text" name="email"/></td>
                        <td><form:errors path="login.email"/></td>
                    </tr>
                    
                    <tr>
                        <td>password</td>
                        <td>:</td>
                        <td><input type="password" name="password"/></td>
                        
                    </tr>
                    
                    <tr>
                        <td></td>
                        <td><input type="submit" value="SignUp"/></td>
                        <td></td>
                        
                    </tr>
                </tbody>
            </table>

            
        </form>
    </body>
</html>
