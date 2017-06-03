<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta charset="UTF-8">
<title>Register</title>
</head>
<body>

    <jsp:include page="include/_header.jsp"></jsp:include>
    <jsp:include page="include/_menuUnlogin.jsp"></jsp:include>
    
    <h3>Register</h3>
    
    <p style="color: red;">${errorString}</p>
    
    <form method="POST" action="doRegister">
       <table border="0">
          <tr>
             <td>UserName</td>
             <td><input type="text" name="username" value="${Taikhoan.m_usernameC}" /></td>
          </tr>
          <tr>
             <td>Gioi Tinh</td>
             <td><input type="text" name="gioitinh" value="${Taikhoan.m_gioitinhC}" /></td>
          </tr>
          <tr>
             <td>Password</td>
             <td><input type="password" name="password" value="${Taikhoan.m_passwordC}" /></td>
          </tr>
          <tr>
             <td>SoDT</td>
             <td><input type="tel" name="Sodt" value="${Taikhoan.m_SodtC}" /></td>
          </tr>
          <tr>
             <td>Dia Chi</td>
             <td><input type="text" name="diachi" value="${Taikhoan.m_diachiC}" /></td>
          </tr>
          <tr>
             <td colspan="2">                  
                 <input type="submit" value="Submit" />
                 <a href="homeUnlogin">Cancel</a>
             </td>
          </tr>
       </table>
    </form>
    
    <jsp:include page="include/_footer.jsp"></jsp:include>
    
</body>
</html>