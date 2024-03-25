<%-- 
    Document   : outcome
    Created on : 21 Feb 2024, 10:31:14 PM
    Author     : Sandiso
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Outcome Page</title>
    </head>
    <body>
        <h1>Game Outcome</h1>
        <%
            String playerName = pageContext.getServletContext().getInitParameter("player_Name");
            String computerName = pageContext.getServletContext().getInitParameter("computer_Name");
            Character playerOption= (Character)request.getAttribute("userChoice");
            Character computerOption= (Character)request.getAttribute("computerChoice");
        %>
        
        <p>
            Below is the game outcome:
        </p>
        
        <table>
            <tr>
                <td><b><%=playerName%></b></td>
                <td><b><%=playerOption%></b></td>
            </tr>
            <tr>
                <td><b><%=computerName%></b></td>
                <td><b><%=computerOption%></b></td>
            </tr>
        </table>
            <p>
                Please click <a href="index.html">here</a> to go back to the main page or <a href="start.jsp">here</a> to continue playing.
            </p>
        
        
    </body>
</html>
