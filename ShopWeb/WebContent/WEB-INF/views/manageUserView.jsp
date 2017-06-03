<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<jsp:include page="include/_header.jsp"></jsp:include>
	<jsp:include page="include/_menu.jsp"></jsp:include>
	
	
	    <table border="1" cellpadding="5" cellspacing="1" >
       <tr>
          <th>UserName</th>
          <th>Phone</th>
          <th>Sex</th>
          <th>Address</th>
          <th>Permission</th>
       </tr>
       <c:forEach items="${userList}" var="user" >
          <tr>
             <td>${user.m_usernameC}</td>
             <td>${user.m_sodtC}</td>
             <td>${user.m_gioitinhC}</td>
             <td>${user.m_diachiC}</td>
             <td>${user.m_phanquyenC}</td>
             <td>
                <a href="editUser?m_usernameC=${user.m_usernameC}">Edit</a>
             </td>
             <td>
                <a href="deleteUser?m_usernameC=${user.m_usernameC}">Delete</a>
             </td>
          </tr>
       </c:forEach>
    </table>
	<a href="Resigter" >Create User</a>
 
    <jsp:include page="include/_footer.jsp"></jsp:include>
	
</body>
</html>