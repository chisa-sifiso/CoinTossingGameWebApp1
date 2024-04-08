<%-- 
    Document   : summary
    Created on : 28 Feb 2024, 9:21:42 AM
    Author     : MemaniV
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Summary Page</title>
    </head>
    <body>
        <h1>Summary</h1>
        <%
            int cnt = (Integer)session.getAttribute("cnt");
            int numCorrectGuesses = (Integer)session.getAttribute("numCorrectGuesses");
            String computerName = pageContext.getServletContext().getInitParameter("computer_name");
            String userName = (String)session.getAttribute("name");
        %>
        <p>
            Hi <b><%=userName%></b>. Below is the game summary.
        </p>
        <table>
            <tr>
                <td>Number of tosses made by <b><%=computerName%>: </b></td>
                <td><%=cnt%></td>
            </tr>
            <tr>
                <td>Number of correct guesses by you: </td>
                <td><%=numCorrectGuesses%></td>
            </tr>
        </table>
        <p>
            Please click <a href="EndSessionServlet.do">here</a> to end the session.
        </p>
    </body>
</html>
