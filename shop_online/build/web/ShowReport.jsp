<%-- 
    Document   : ShowReport
    Created on : Apr 19, 2019, 8:48:24 PM
    Author     : Shahidul
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>


        <form action="report.jsp" method="post">

           <h2>search by category id</h2>   <input type="text" name="m1"/><br>


            <input type="submit" value="Show"/>
        </form>
        <form action="report2.jsp" method="post">

            <h2>search by zone name</h2>  <input type="text" name="m2"/><br>


            <input type="submit" value="Show"/>
        </form>

    </body>
</html>
