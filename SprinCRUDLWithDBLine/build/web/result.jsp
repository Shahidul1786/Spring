<%-- 
    Document   : result
    Created on : Feb 10, 2019, 10:41:13 AM
    Author     : HP
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form>
            <table border="0" cellspacing="5">
             
                <tbody>
                    <tr>
                        <td>ID</td>
                        <td>Name</td>
                        <td>Email</td>
                        <td>Password</td>

                    </tr>
                    <c:forEach var="d" items="${ai}">
                        <tr>
                            <td>${d.id}</td>
                            <td>${d.name}</td>
                            <td>${d.email}</td>
                            <td>${d.password}</td>
                            <td><a href="delete.htm?id=${d.id}">Delete</a></td>
                            <td><a href="show.htm?id=${d.id}&name=${d.name}&email=${d.email}&password=${d.password}">Update</a></td>
                            <td></td>
                        </tr>
                    </c:forEach>
                </tbody>
            </table>

        </form>
        <form action="loginPage.jsp">
            <input type="submit" value="Logout"/>

        </form>
    </body>
</html>
