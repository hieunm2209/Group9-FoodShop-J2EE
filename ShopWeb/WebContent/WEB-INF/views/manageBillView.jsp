<%@ page language="java" contentType="text/html; charset=UTF-8"
 pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>List Bill</title>
</head>
<body>
	<jsp:include page="include/_header.jsp"></jsp:include>
    <jsp:include page="include/_menu.jsp"></jsp:include>
    <h3>List Bill</h3>
    <p style="color: red;">${errorString}</p>
    <table border="1" cellpadding="5" cellspacing="1" >
       <tr>
          <th>ID Bill</th>
          <th>Customer Name</th>
          <th>Date</th>
          <th>Active</th>
          <th>View</th>
          <th>Delete</th>
       </tr>
       <c:forEach items="${billList}" var="bill" >
          <tr>
             <td>${bill.m_idGiohangC}</td>
             <td>${bill.m_usernameC}</td>
             <td>${bill.m_ngaylapC}</td>
             <td>${bill.m_isActiveC}</td>
             <td>
                <a href="viewBill?m_idGiohangC=${bill.m_idGiohangC}">View</a>
             </td>
             <td>
                <a href="deleteBill?m_idGiohangC=${bill.m_idGiohangC}">Delete</a>
             </td>
          </tr>
       </c:forEach>
    </table>
    <jsp:include page="include/_footer.jsp"></jsp:include>
</body>
</html>