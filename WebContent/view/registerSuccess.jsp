<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<h1>You registered successfully </h1>
	<table style="border: 1px solid red; padding: 10px;">
	
			<tr>
				<td>* Id :${customer.id }</td>
				</tr>
				<tr>
				<td>* Password : ${customer.password }</td>
					</tr>
				<tr>
				<td>* Gender : ${customer.gender }</td>
					</tr>
				<tr>
				<td>* Name : ${customer.name }</td>
				<tr>
				</tr>
				<tr>
				<td>* Email : ${customer.email }</td>
				</tr>
	

	</table>
		<p><a href="/helloMVC/index.jsp"> go to home page</a>
		</p>
</body>
</html>