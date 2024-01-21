
<%@page import="com.pojo.Share"%>
<%@page import="java.util.List"%>
<%@page import="com.dao.ShareDAOImpl"%>
<%@page import="com.dao.ShareDAO"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%
		ShareDAO dao = new ShareDAOImpl();
		List<Share> shares = dao.findAllShares();
	%>

	<%=shares%>

</body>
</html>