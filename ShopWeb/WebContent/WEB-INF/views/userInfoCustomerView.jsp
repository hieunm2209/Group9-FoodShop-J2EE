<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Customer Info</title>
</head>
<body>
    <jsp:include page="include/_header.jsp"></jsp:include>
    <jsp:include page="include/_menuCustomer.jsp"></jsp:include>
 
    <h3>Hello: ${user.m_usernameC}</h3>
 
    User Name: <b>${user.m_usernameC}</b>
    <br />
    Gender: ${user.m_gioitinhC } <br />
 
    <jsp:include page="include/_footer.jsp"></jsp:include>
</body>
</html>