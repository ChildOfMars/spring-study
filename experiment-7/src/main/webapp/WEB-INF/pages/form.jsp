<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>客户端向服务器传递数据</title>
</head>
<body>
<h2>发送数据到服务器</h2>

<form action="${pageContext.request.contextPath}/test" method="post">
    <label for="stringValue">String Value:</label>
    <input type="text" id="stringValue" name="testList[0].stringValue" required><br>

    <label for="intValue">Int Value:</label>
    <input type="number" id="intValue" name="testList[0].intValue" required><br>

    <label for="stringArray">String Array:</label>
    <input type="text" id="stringArray" name="testList[0].stringArray" value="value1"><br>
    <input type="text" id="stringArray" name="testList[0].stringArray" value="value2"><br>
    <input type="text" id="stringArray" name="testList[0].stringArray" value="value3"><br>

    <label for="stringValue">String Value:</label>
    <input type="text" id="stringValue" name="testList[1].stringValue" required><br>

    <label for="intValue">Int Value:</label>
    <input type="number" id="intValue" name="testList[1].intValue" required><br>

    <label for="stringArray">String Array:</label>
    <input type="text" id="stringArray" name="testList[1].stringArray" value="value1"><br>
    <input type="text" id="stringArray" name="stestList[1].tringArray" value="value2"><br>
    <input type="text" id="stringArray" name="testList[1].stringArray" value="value3"><br>

    <button type="submit">提交</button>
</form>
</body>
</html>