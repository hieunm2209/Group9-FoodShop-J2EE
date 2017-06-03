<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>ARTICLE</title>
</head>
<body>
	<jsp:include page="include/_header.jsp"></jsp:include>
	<jsp:include page="include/_menuUnlogin.jsp"></jsp:include>
	
	
	   <table border="1" cellpadding="5" cellspacing="1" >
       <tr>
          <th>ID NEW</th>
          <th>AUTHOR</th>
          <th>TITLE</th>
          <th>SHORT DETAIL</th>
          <th>LONG DETAIL</th>
          <th>DATE CREATE</th>
       </tr>
       <c:forEach items="${articleList}" var="article" >
          <tr>
             <td>${article.m_idNewC}</td>
             <td>${article.m_id_userC}</td>
             <td>${article.m_titleC}</td>
             <td>${article.m_short_detailC}</td>
             <td>${article.m_long_detailC}</td>
             <td>${article.m_date_createC}</td>
             <td>
                <a href="viewDetailArticle?m_idNewC=${article.m_idNewC}"> View Detail</a>
             </td>
          </tr>
       </c:forEach>
    </table>
 
    <jsp:include page="include/_footer.jsp"></jsp:include>
</body>
</html>