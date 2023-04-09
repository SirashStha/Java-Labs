<%@page import="com.example.jspcrud.studentDatabase"%>
<%@page import="com.example.jspcrud.student"%>
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
  String name = request.getParameter("name");
  String address = request.getParameter("address");
  String phone = request.getParameter("phone");

  if (name == null || name.trim().isEmpty() || address == null || address.trim().isEmpty() || phone == null || phone.trim().isEmpty()) {
    response.sendRedirect("edit.jsp?id=" + id + "&error=Please%20enter%20all%20fields!");
  } else {
    student s = new student();
    s.setId(id);
    s.setName(name);
    s.setAddress(address);
    s.setPhone(phone);

    int res = studentDatabase.update(s);
    if (res > 0) {
      response.sendRedirect("view.jsp");
    } else {
%>
<p style='color:red;text-align:center;'>Sorry! unable to update record</p>
<%
    }

  }

%>
</body>
</html>
