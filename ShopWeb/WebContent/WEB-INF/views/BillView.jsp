<%@ page language="java" contentType="text/html; charset=UTF-8"
 pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<title>Bill</title>
</head>
<body>
	<jsp:include page="include/_header.jsp"></jsp:include>
    <jsp:include page="include/_menu.jsp"></jsp:include>
    <h3>Bill</h3>
      <d>Số hóa đơn :${bill.m_idGiohangC}<br>
      Tên khách hàng :${bill.m_usernameC}<br>
      Ngày yêu cầu :${bill.m_ngaylapC}<br>
      Tình trạng đơn hàng:${bill.m_isActiveC}<br>
      Danh sách sản phẩm mua<br></d>
      <table border="1" cellpadding="5" cellspacing="1" >
      <tr>
    	<th>Tên sản phẩm</th>
    	<th>Đơn giá</th>
    	<th>Số lượng</th>
    </tr>
    <c:forEach items="${list}" var="ctbill">
    	<tr>
    		<td>${ctbill.m_teansanphamC}</td>
    		<td>${ctbill.m_giaC}</td>
    		<td>${ctbill.m_soluongC}</td>
    	</tr>
    </c:forEach>
      
</body>
</html>