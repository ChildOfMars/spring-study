<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>请假申请表单</title>
</head>
<body>
<h2>请假申请表单</h2>

<form action="submitLeaveRequest" method="post">
    <label for="employeeName">员工姓名：</label>
    <input type="text" id="employeeName" name="employeeName" required><br>

    <label for="leaveType">请假类型：</label>
    <select id="leaveType" name="leaveType" required>
        <option value="事假">事假</option>
        <option value="病假">病假</option>
        <option value="年假">年假</option>
        <!-- Add more leave types as needed -->
    </select><br>

    <label for="startDate">开始日期：</label>
    <input type="date" id="startDate" name="startDate" required><br>

    <label for="endDate">结束日期：</label>
    <input type="date" id="endDate" name="endDate" required><br>

    <label for="contactNumber">联系电话：</label>
    <input type="tel" id="contactNumber" name="contactNumber" required><br>

    <label>请假原因：</label>
    <textarea id="leaveReason" name="leaveReason" required></textarea><br>

    <button type="submit">提交请假申请</button>
</form>
</body>
</html>
