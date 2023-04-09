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
<%
    String name = request.getParameter("name");
    String address = request.getParameter("address");
    String phone = request.getParameter("phone");
    if (name == null || name.trim().isEmpty() || address == null || address.trim().isEmpty() || phone == null || phone.trim().isEmpty()) {

%>
<p style='color:red;text-align:center;'>Please enter all  fields!</p>
<%            request.getRequestDispatcher("index.jsp").include(request, response);

} else {
    student s = new student();
    s.setName(name);
    s.setAddress(address);
    s.setPhone(phone);

    int res = studentDatabase.save(s);
    if (res > 0) {

%>
<p style='color:green;text-align:center;'>Record saved successfully!</p>
<%            request.getRequestDispatcher("index.jsp").include(request, response);
} else {

%>
<p style='color:red;text-align:center;'>Sorry! unable to save record</p>
<%    request.getRequestDispatcher("index.jsp").include(request, response);
}
}
%>
</body>
</html>
