<%@ page language="java" contentType="text/html; charset=UTF-8"
 pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
 <head>
    <meta charset="UTF-8">
    <title>Send Contact</title>
 </head>
 <body>
 
    <jsp:include page="include/_header.jsp"></jsp:include>
    <jsp:include page="include/_menu.jsp"></jsp:include>
 
    <h3>Send Contact</h3>
    
 
    <p style="color: red;">${errorString}</p>
 
       <form method="POST" action="doSendContact">
          <table border="0">
             <tr>
                <td>Full Name</td>
                <td><input type="text" name="fullname"/></td>
             </tr>
             <tr>
                <td>Address</td>
                <td><input type="text" name="address"/></td>
             </tr>
             <tr>
                <td>Email</td>
                <td><input type="text" name="email"/></td>
             </tr>
             <tr>
                <td>Phone</td>
                <td><input type="text" name="phone"/></td>
             </tr>
             <tr>
                <td>Title</td>
                <td><input type="text" name="title"/></td>
             </tr>
             <tr>
                <td>Description</td>
                <td><input type="text" name="description"/></td>
             </tr>
             <tr>
                <td colspan = "2">
                    <input type="submit" value="Submit" />
                    <a href="${pageContext.request.contextPath}/">Cancel</a>
                </td>
             </tr>
          </table>
       </form>
    
 
    <jsp:include page="include/_footer.jsp"></jsp:include>
 
 </body>
</html>