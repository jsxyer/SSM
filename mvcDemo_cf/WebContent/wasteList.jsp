<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	${wastes.size() }
	<table border="1">
		<tr>
			<th>类型编号</th>
			<th>类型名称</th>
			<th>类型代码</th>
		</tr>
		<c:forEach items="${wastes }" var="w">
			<tr>
				<td>${w.id }</td>
				<td>${w.name }</td>
				<td>${w.code }</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>