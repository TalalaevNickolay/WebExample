<%@ page language="java" contentType="text/html; charset=ISO-8859-1" import="by.htp.first.start.User"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
     <H1>Hello, my world!!!!</H1>
     
     <%
     	User user = (User)request.getAttribute("myuser");
        out.print(user.getName() + " - " + user.getSurname());
     %>
     <b>
     <table>
     	<tr>
     		<td><%=user.getName()%></td>
     		<td><%=user.getSurname()%></td>
     	</tr>
     </table>
     
     </b>
</body>
</html>