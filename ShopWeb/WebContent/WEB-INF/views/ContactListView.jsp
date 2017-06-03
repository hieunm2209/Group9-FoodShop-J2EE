<%@ page language="java" contentType="text/html; charset=UTF-8"
 pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<!DOCTYPE html>
<html>
 <head>
    <meta charset="UTF-8">
    <title>Contact List</title>
 </head>
 <body>
 
    <jsp:include page="include/_header.jsp"></jsp:include>
    <jsp:include page="include/_menu.jsp"></jsp:include>
 
    <h3>Contact List</h3>
 
    <p style="color: red;">${errorString}</p>
 
    <table border="1" cellpadding="5" cellspacing="1" >
       <tr>
          <th>Full Name</th>
          <th>Address</th>
          <th>Email</th>
          <th>Phone</th>
          <th>Title</th>
          <th>Description</th>
       </tr>
       <c:forEach items="${contactList}" var="contact" >
          <tr>
             <td>${contact.m_usernameC}</td>
             <td>${contact.m_addressC}</td>
             <td>${contact.m_emailC}</td>
             <td>${contact.m_phoneC}</td>
             <td>${contact.m_titleC}</td>
             <td>${contact.m_descripstionC}</td>
          </tr>
       </c:forEach>
    </table>
 
    <a href="${pageContext.request.contextPath}/createNewContact" >Send New Contact</a>
 
    <jsp:include page="include/_footer.jsp"></jsp:include>
 
 </body>
</html>