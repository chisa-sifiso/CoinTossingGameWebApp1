<%-- 
    Document   : session_started
    Created on : 28 Feb 2024, 8:10:58 AM
    Author     : MemaniV
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Session Started Page</title>
    </head>
    <body>
        <h1>Session started</h1>
        <%
            String computerName = pageContext.getServletContext().getInitParameter("computer_name");
            String userName = (String)session.getAttribute("name");
        %>
        <p>
            Hi <b><%=userName%></b>. I'm <b><%=computerName%></b>. Your session has started. 
            Please click <a href="CoinTossingServlet.do">here</a> to start the coin tossing game.
        </p>
    </body>
</html>

