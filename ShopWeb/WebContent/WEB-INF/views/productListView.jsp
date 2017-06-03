<%@ page language="java" contentType="text/html; charset=UTF-8"
 pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<!DOCTYPE html>
<html>
 <head>
    <meta charset="UTF-8">
    <title>Product List</title>
 </head>
 <body>
 
    <jsp:include page="include/_header.jsp"></jsp:include>
    <jsp:include page="include/_menu.jsp"></jsp:include>
 
    <h3>Product List</h3>
 
    <p style="color: red;">${errorString}</p>
 
    <table border="1" cellpadding="5" cellspacing="1" >
       <tr>
          <th>Code</th>
          <th>Name</th>
          <th>Price</th>
          <th>Edit</th>
          <th>Delete</th>
       </tr>
       <c:forEach items="${productList}" var="product" >
          <tr>
             <td>${product.m_idC}</td>
             <td>${product.m_tensanphamC}</td>
             <td>${product.m_giaC}</td>
             <td>
                <a href="editProduct?m_idC=${product.m_idC}">Edit</a>
             </td>
             <td>
                <a href="deleteProduct?m_idC=${product.m_idC}">Delete</a>
             </td>
          </tr>
       </c:forEach>
    </table>
 
    <a href="createProduct" >Create Product</a>
 
    <jsp:include page="include/_footer.jsp"></jsp:include>
 
 </body>
</html>