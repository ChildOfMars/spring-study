<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>添加图书</title>
</head>
<body>
	<h2>添加图书</h2>
    <form action="${pageContext.request.contextPath}/addBook" method="post">
        
        <label for="bookName">书名:</label>
        <input type="text" id="bookName" name="bookName" required>
        <br>
        
        <label for="author">作者:</label>
        <input type="text" id="author" name="author" required>
        <br>
        
        <label for="price">价格:</label>
        <input type="number" id="price" name="price" step="0.01" required>
        <br>
        
        <input type="submit" value="提交">
    </form>
</body>
</html>