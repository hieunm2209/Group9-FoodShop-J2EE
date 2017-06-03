<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

 <jsp:include page="include/_header.jsp"></jsp:include>
    <jsp:include page="include/_menu.jsp"></jsp:include>
    
    
    <form method="POST" action="DoeditUser">
       <table border="0">
       <input type="hidden" name="m_usernameC" value="${user.m_usernameC}" />
          <tr>
             <td>UserName</td>
             <td style="color:red;">${user.m_usernameC}</td>
          </tr>
          <tr>
             <td>Password</td>
             <td><input type="password" name="m_passwordC" value="${user.m_passwordC}" /></td>
          </tr>
          <tr>
             <td>Phone</td>
             <td><input type="text" name="m_sodtC" value="${user.m_sodtC}" /></td>
          </tr>
          <tr>
             <td>Sex</td>
             <td><input type="text" name="m_gioitinhC" value="${user.m_gioitinhC}" /></td>
          </tr>
          <tr>
             <td>Address</td>
             <td><input type="text" name="m_diachiC" value="${user.m_diachiC}" /></td>
          </tr>
			<tr>
             <td>Permission</td>
             <td><input type="text" name="m_phanquyenC" value="${user.m_phanquyenC}" /></td>
          </tr>
          <tr>
             <td colspan="2">                  
                 <input type="submit" value="Submit" />
                 <a href="manageUser">Cancel</a>
             </td>
          </tr>
       </table>
    </form>
    
    <jsp:include page="include/_footer.jsp"></jsp:include>
</body>
</html>