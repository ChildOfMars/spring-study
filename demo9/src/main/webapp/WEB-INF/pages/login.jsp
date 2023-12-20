<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>登录</title>
</head>
<body>
	<h2>登录</h2>

    <form action="/login" method="post">
        <label for="username">用户名:</label>
        <input type="text" id="username" name="username" required><br>

        <label for="password">密码:</label>
        <input type="password" id="password" name="password" required><br>

        <input type="submit" value="提交">
    </form>
    
</body>
</html>