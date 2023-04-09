\<%@page import="com.example.jspcrud.studentDatabase"%>
<%@page import="com.example.jspcrud.student"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.List"%>

<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>JSP Page</title>
</head>
<body style="background-color:whitesmoke;"><center>
    <h1>Student's Data:</h1>
    <table  border="5" width="100%" cellspacing="0" cellpadding="5px">
        <tr>
            <th>SN</th>
            <th>Name</th>
            <th>Address</th>
            <th>Phone Number</th>
            <th>Edit</th>
            <th>Delete</th>
        </tr>
        <%
            List<student> list = studentDatabase.getAllStudent();

            int sn = 0;
            for (student s : list) {
                sn++;
        %>
        <tr>
            <td align="center"><%= sn%></td>
            <td align="center"><%= s.getName()%></td>
            <td align="center"><%= s.getAddress()%></td>
            <td align="center"><%= s.getPhone()%></td>
            <td align="center"><a href="edit.jsp?id=<%= s.getId()%>">Edit</a></td>
            <td align="center"><a href="delete.jsp?id=<%= s.getId()%>">Delete</a></td>
        </tr>
        <%
            }
        %>
    </table>
    <br>
    <form action="index.jsp" method="get">
        <input type="submit" value="Add Data" style="padding: 8px 20px;box-shadow: 2px 2px 5px #999;">
    </form>
</center></body>
</html>
