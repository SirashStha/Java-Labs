<%@page import="com.example.jspcrud.studentDatabase"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>JSP Page</title>
</head>
<body>
<h1>Hello World!</h1>
<%
    int id = Integer.parseInt(request.getParameter("id"));
    studentDatabase.delete(id);
    response.sendRedirect("view.jsp");
%>
</body>
</html>
