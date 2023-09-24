<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<form action="${pageContext.request.contextPath}/book/addBook" method="post">
    <div class="form-group">
        <label>bookName</label>
        <input type="text" name="bookName" class="form-control" required>
    </div>
    <div class="form-group">
        <label>bookCounts</label>
        <input type="text" name="bookCounts" class="form-control" required>
    </div>
    <div class="form-group">
        <label>detail</label>
        <input type="text" name="detail" class="form-control" required>
    </div>
    <button type="submit" class="btn btn-primary">提交</button>
</form>

</body>
</html>
