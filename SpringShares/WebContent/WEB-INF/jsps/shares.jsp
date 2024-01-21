<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="jstl" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
 
<title>Customer List</title>
</head>
<body>

		<table align="center" border="1">
			<tr>
				<th>ShareName</th>
				<th>Market Rate</th>
			</tr>
			<jstl:forEach var="share" items="${shares}" varStatus="st">
				<tr>
					<td><jstl:out value="${ share.instrumentName }"></jstl:out></td>
					<td><jstl:out value="${ share.marketRate }"></jstl:out></td>
				</tr>
			</jstl:forEach>
		</table>
	
</body>
</html>
