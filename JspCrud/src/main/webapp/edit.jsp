<%@page import="com.example.jspcrud.studentDatabase"%>
<%@page import="com.example.jspcrud.student"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>JSP Page</title>
</head>
<body style='background-color:whitesmoke;'><center>
    <h1><center>Update Student's data:</center></h1>
    <%
        int id = Integer.parseInt(request.getParameter("id"));
        student s = studentDatabase.getStudentById(id);

        String error = request.getParameter("error");
        if (error != null && !error.isEmpty()) {
            out.println("<p style='color: red;'>" + error + "</p>");
        }
    %>
    <form action="update.jsp" method="post">
        <table  style="border-collapse: separate; border-spacing: 25px; background-color: lightblue;border-radius: 20px;box-shadow: 10px 10px 5px #999;" >
            <tr><td></td><td><input type="hidden" name="id" value="<%=s.getId()%>"/></td></tr>
            <tr><td>Name:</td><td><input type="text" name="name" value="<%=s.getName()%>"/></td></tr>
            <tr><td>Address:</td><td><input type="text" name="address" value="<%=s.getAddress()%>"/></td></tr>
            <tr><td>Phone No:</td><td><input type="text" name="phone"  value="<%=s.getPhone()%>"/></td></tr><br>
            <tr><td colspan="2" style="text-align: center;"> <input type="submit" value=" Update "  style="padding: 8px 20px;box-shadow: 2px 2px 5px #999;"></td></tr>
        </table>
    </form>
</center></body>
</html>