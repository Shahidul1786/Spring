<%-- 
    Document   : update
    Created on : Feb 10, 2019, 10:56:24 AM
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
        <form action="update.htm" >
            <table border="0" cellspacing="5">

                <tbody>

                    <tr>
                        <td>ID</td>
                        <td>:</td>
                        <td><input type="text" name="id" value="${login.id}"/></td>
                    </tr>
                    <tr>
                        <td>Name</td>
                        <td>:</td>
                        <td><input type="text" name="name" value="${login.name}"/></td>
                        <td><form:errors path="login.name"/></td>
                </tr>
                <tr>
                    <td>Email</td>
                    <td>:</td>
                    <td><input type="text" name="email" value="${login.email}"/></td>
                    <td><form:errors path="login.email"/></td>
                </tr>

                <tr>
                    <td>password</td>
                    <td>:</td>
                    <td><input type="password" name="password" value="${login.password}"/></td>

                </tr>

                <tr>
                    <td></td>
                    <td><input type="submit" value="Update"/></td>
                    <td></td>

                </tr>
                </tbody>
            </table>


        </form>
    </body>
</html>
