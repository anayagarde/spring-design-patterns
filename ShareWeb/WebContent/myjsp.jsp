<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
WELCOME to JSP

<%  int x = 10;
	int y = 20;
	int add = x + y;
	out.println("addition="+add);
	out.println("<br>Today's date = "+new Date());

%>

<% 
String value = request.getParameter("name");
%>

<br> You entered <%=value %>

</body>
</html>