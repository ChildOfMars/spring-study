<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>文件上传</title>
</head>
<body>
<h2>文件上传</h2>
<form action="fileUpload" method="post" enctype="multipart/form-data">
	<input type="file" name="file"/><br>
	<input type="submit">
</form>
</body>
</html>