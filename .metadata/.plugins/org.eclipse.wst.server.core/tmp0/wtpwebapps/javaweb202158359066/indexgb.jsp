<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title></title>
</head>
<body>

	<c:out value="${result }"></c:out>

	<form action="/javaweb202158359066/selectServletgb">
		课程名：<input type="text" name="coursename"> <input type="submit"
			value="查询">

	</form>

	<c:if test="${resultList.size()==0 }">
		<h1>没有该课程成绩</h1>
	</c:if>
	<c:if test="${resultList.size()!=0 }">
		<table border="1">
			<tr>
				<th>编号</th>
				<th>学号</th>
				<th>姓名</th>
				<th>学期</th>
				<th>课程名</th>
				<th>学分</th>
				<th>成绩</th>
			</tr>
			<c:forEach var="item" items="${ resultList}">
				<tr>
					<td>${item.sid}</td>
					<td>${item.sno}</td>
					<td>${item.sname}</td>
					<td>${item.term}</td>
					<td>${item.coursename}</td>
					<td>${item.credit}</td>
					<td>${item.score}</td>
				</tr>
			</c:forEach>
		</table>
	</c:if>



</body>
</html>