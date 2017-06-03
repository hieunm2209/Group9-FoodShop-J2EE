<%@ page language="java" contentType="text/html; charset=UTF-8"
 pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
  	<jsp:include page="include/_header.jsp"></jsp:include>
    <jsp:include page="include/_menuCustomer.jsp"></jsp:include>
    <br>
    <a href = "${pageContext.request.contextPath}/Catalog"> GO BACK YOUR CART</a><br><br>
    
    <table border="1" cellpadding="5" cellspacing="1" >
       <tr>
          <th>ID PRODUCT</th>
          <th>NAME PRODUCT</th>
          <th>PRICE</th>
       </tr>
       <c:forEach items="${cart}" var="product" >
          <tr>
             <td>${product.m_idC}</td>
             <td>${product.m_tensanphamC}</td>
             <td>${product.m_giaC}</td>
             <td>
                <a href="deleteProductCart?m_idC=${product.m_idC}"> DELETE</a>
             </td>
          </tr>
       </c:forEach>
    </table>.
        <br>
    <!-- <a href = "${pageContext.request.contextPath}"> GO BACK YOUR CART</a> -->
    <!-- cart -->
    <jsp:include page="include/_footer.jsp"></jsp:include>
</body>
</html>