<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

	<jsp:include page="include/_header.jsp"></jsp:include>
    <jsp:include page="include/_menuCustomer.jsp"></jsp:include>
    
    	 <form method="POST" action="enterQuantity">
       <table border="0">
          <tr>
             <td>Code</td>
             <td><input type="text" name="m_idC" readonly value="${product.m_idC}" /></td>
          </tr>
          <tr>
             <td>Name</td>
             <td><input type="text" name="m_tensanphamC" readonly value="${product.m_tensanphamC}" /></td>
          </tr>
          <tr>
             <td>Price</td>
             <td><input type="text" name="m_giaC" readonly value="${product.m_giaC}" /></td>
          </tr>
          <tr>
             <td>Quantity</td>
             <td><input type="text" name="quantity" /></td>
          </tr>
          <tr>
             <td colspan="2">                  
                 <input type="submit" value="Submit" />
                 <a href="productList">Cancel</a>
             </td>
          </tr>
       </table>
    </form>
    
    <jsp:include page="include/_footer.jsp"></jsp:include>
</body>
</html>