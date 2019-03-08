<%-- 
    Document   : loginPage
    Created on : Feb 10, 2019, 10:29:50 AM
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
        <form action="check.htm" >
            <table border="0" cellspacing="5">

                <tbody>

                    <tr>
                        <td>ID</td>
                        <td>:</td>
                        <td><input type="text" name="id"/></td>
                    </tr>


                    <tr>
                        <td>password</td>
                        <td>:</td>
                        <td><input type="password" name="password"/></td>

                    </tr>

                    <tr>
                        <td></td>
                        <td><input type="submit" value="Login"/></td>
                        <td></td>

                    </tr>

                    <tr>
                        <td></td>
                        <td>New user? <a href="createAcc.jsp">Register</a></td>
                        <td></td>

                    </tr>
                </tbody>
            </table>


        </form>
    </body>
</html>
