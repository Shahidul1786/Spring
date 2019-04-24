<%-- 
    Document   : report2
    Created on : Apr 20, 2019, 7:41:22 AM
    Author     : Shahidul
--%>

<%@page import="net.sf.jasperreports.engine.JasperExportManager"%>
<%@page import="net.sf.jasperreports.engine.JasperFillManager"%>
<%@page import="net.sf.jasperreports.engine.JasperPrint"%>
<%@page import="net.sf.jasperreports.engine.JasperCompileManager"%>
<%@page import="net.sf.jasperreports.engine.JasperReport"%>
<%@page import="java.io.FileInputStream"%>
<%@page import="java.io.InputStream"%>
<%@page import="java.util.HashMap"%>
<%@page import="java.util.Map"%>
<%@page import="java.io.File"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>


        <%
            try {
                Connection conn = null;
                try {
                    Class.forName("com.mysql.jdbc.Driver");
                    conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/shop_online", "root", "st@#1786");
                    String s = session.getServletContext().getRealPath("/report2.jrxml");
                    InputStream inputStream = new FileInputStream(new File(s));
                    JasperReport jr = JasperCompileManager.compileReport(inputStream);
                    Map param = new HashMap();

                    
                    String s1= request.getParameter("m2");
                    param.put("zone_name", s1);
                    JasperPrint jp = JasperFillManager.fillReport(jr, param, conn);
                    response.setContentType("application/pdf");
                    JasperExportManager.exportReportToPdfStream(jp, response.getOutputStream());
                    response.getOutputStream().flush();
                    response.getOutputStream().close();
                } catch (Exception ex) {
                    ex.printStackTrace();
                }

            } catch (Exception e) {
            }

        %>


    </body>
</html>
