<%-- 
    Document   : outcome
    Created on : 28 Feb 2024, 9:11:44 AM
    Author     : MemaniV
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Outcome Page</title>
    </head>
    <body>
        <h1>Outcome</h1>
        <%
            String computerName = pageContext.getServletContext().getInitParameter("computer_name");
            String userName = (String)session.getAttribute("name");
            String outcome = (String)request.getAttribute("outcome");
            String toss = (String)session.getAttribute("toss");
            String guess = (String)request.getAttribute("guess");
        %>
        <p>
            Hi <b><%=userName%></b>. Below is the outcome.
        </p>
        <table>
            <tr>
                <td>Toss by <b><%=computerName%>: </b></td>
                <td><%=toss%></td>
            </tr>
            <tr>
                <td>Your guess: </td>
                <td><%=guess%></td>
            </tr>
            <tr>
                <td>Outcome: </td>
                <td><%=outcome%></td>
            </tr>
        </table>
        <p>
            Click <a href="CoinTossingServlet.do">here</a> to continue with the game or 
            <a href="summary.jsp">here</a> to end it.
        </p>
    </body>
</html>

