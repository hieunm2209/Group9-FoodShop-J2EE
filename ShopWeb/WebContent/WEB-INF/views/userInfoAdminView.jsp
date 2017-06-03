<%@ page language="java" contentType="text/html; charset=UTF-8"
 pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
 <head>
    <meta charset="UTF-8">
    <title>User Info</title>
 </head>
 <body>
 
    <jsp:include page="include/_header.jsp"></jsp:include>
    <jsp:include page="include/_menu.jsp"></jsp:include>
 
    <h3>Hello: ${user.m_usernameC}</h3>
 
    User Name: <b>${user.m_usernameC}</b>
    <br />
    Gender: ${user.m_gioitinhC } <br />
 
    <jsp:include page="include/_footer.jsp"></jsp:include>
 
 </body>
</html>