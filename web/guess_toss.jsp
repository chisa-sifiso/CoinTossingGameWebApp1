<%-- 
    Document   : guess_toss
    Created on : 28 Feb 2024, 8:55:35 AM
    Author     : MemaniV
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Toss Guessing Page</title>
    </head>
    <body>
        <h1>Toss guess</h1>
        <%
            String computerName = pageContext.getServletContext().getInitParameter("computer_name");
            String userName = (String)session.getAttribute("name");
        %>
        <p>
            Hi <b><%=userName%></b>. <b><%=computerName%></b> has tossed the coin. Please guess the toss.
        </p>
        <form action="GuessServlet.do" method="POST">
            <table>
                <tr>
                    <td>Your guess</td>
                    <td>
                        <select name="guess" required="">
                            <option value="Heads">Heads</option>
                            <option value="Tails">Tails</option>
                        </select>
                    </td>
                </tr>
                <tr>
                    <td></td>
                    <td><input type="submit" value="GUESS"/></td>
                </tr>
            </table>
        </form>
    </body>
</html>

