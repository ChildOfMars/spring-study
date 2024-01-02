<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Book Search</title>
    <!-- Bootstrap CSS -->
    <link href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>

<div class="container mt-4">
    <h2>搜索书籍</h2>

    <form action="/findBook/1" method="post">
        <div class="form-group">
            <label for="searchText">输入书名:</label>
            <input type="text" class="form-control" id="searchText" name="bookName" placeholder="请输入书名">
        	
        </div>
        <button type="submit" class="btn btn-primary">搜索</button>
    </form>
    <hr>
    <h3>搜索结果</h3>
    <c:if test="${empty bookList}">
        <p>没有找到相关书籍</p>
    </c:if>

    <c:forEach var="book" items="${bookList}">
        <div class="card">
            <div class="card-body">
                <h5 class="card-title">${book.bookName}</h5>
                <p class="card-text">作者: ${book.author}</p>
                <p class="card-text">价格: ${book.price}</p>
            </div>
        </div>
    </c:forEach>
	<c:if test="${not empty bookList and totalPage > 1}">
	<hr>
    <nav aria-label="Page navigation">
        <ul class="pagination">
            <li class="page-item<c:if test='${currentPage == 1}'> disabled</c:if>">
                <a class="page-link" href="/findBook/1">第一页</a>
            </li>
            <c:forEach begin="1" end="${totalPage}" var="page">
                <li class="page-item<c:if test='${currentPage == page}'> active</c:if>">
                    <a class="page-link" href="/findBook/${page}">${page}</a>
                </li>
            </c:forEach>
            <li class="page-item<c:if test='${currentPage == totalPage}'> disabled</c:if>">
                <a class="page-link" href="/findBook/${totalPage}">最后</a>
            </li>
        </ul>
    </nav>
</c:if>
</div>

<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.5.2/dist/umd/popper.min.js"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>

</body>
</html>
