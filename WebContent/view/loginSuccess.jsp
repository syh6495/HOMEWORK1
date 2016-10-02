<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<%-- JSP Expression Language --%>
	
	<h1>You logged in successfully </h1>
	<h1>

${customer.id}
${customer.password}
${customer.name }
${ customer.gender}
${customer.email }

</h1>
		
	<p><a href="/helloMVC/home?action=login"> go to login page</a></p>
</body>
</html>