<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>添加成绩</title>
</head>
<body>
	<form action="/javaweb202158359066/AddcjServletgb">
		学号：<input type="text" name="sno"><br>
		姓名：<input type="text" name="sname"><br>
		学期：<input type="text" name="term"><br>
		课程名：<input type="text" name="coursename"><br>
		学分：<input type="text" name="credit"><br>
		成绩：<input type="text" name="score"><br>
		
		<input type="submit" value="保存">
	</form>
</body>
</html>