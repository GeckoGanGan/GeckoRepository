<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>修改书籍</title>
    <!-- 引入 Bootstrap -->
    <link href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<div class="row clearfix">
    <div class="col-md-12 column">
        <div class="page-header">
            <h1>
                <small>修改书籍信息</small>
            </h1>
        </div>
    </div>
</div>
<form action="${pageContext.request.contextPath}/book/updateBook" method="post">
    <input type="hidden" name="bookID" value="${booksByQuery.bookID}">
    <div class="form-group">
        <label>bookName</label>
        <input type="text" name="bookName" value="${booksByQuery.bookName}" class="form-control" required>
    </div>
    <div class="form-group">
        <label>bookCounts</label>
        <input type="text" name="bookCounts" value="${booksByQuery.bookCounts}" class="form-control" required>
    </div>
    <div class="form-group">
        <label>detail</label>
        <input type="text" name="detail" value="${booksByQuery.detail}" class="form-control" required>
    </div>
    <button type="submit" class="btn btn-default">提交</button>
</form>

</body>
</html>
