<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>主页</title>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-3.7.1.min.js"></script>
<script type="text/javascript">
	var user = new Array();
	user.push({username:"张三",password:"123456",phone:["123456","456765"]});
	user.push({username:"李四",password:"654321",phone:["324234","752265"]});
	/* $.ajax({
		type:"POST",
		url:"registry",
		data:JSON.stringify(user),
		contentType:"application/json;charset=utf-8"
	}) */
	
	
</script>
</head>
<body>
<h2>hello</h2>
<img alt="" src="${pageContext.request.contextPath}/images/1.jpg">

</body>
</html>