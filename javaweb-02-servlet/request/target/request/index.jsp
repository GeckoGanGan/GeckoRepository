<%--
  Created by IntelliJ IDEA.
  User: 齐小胖
  Date: 2023/5/30
  Time: 22:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录</title>
</head>
<body>
<h1>登录</h1>
<div style="text-align: center">
    <%--以post方式提交表单，提交到我们的login请求--%>
    <form action="${pageContext.request.contextPath}/login" method="post">
        用户名：<input type="text" name="username"><br>
        密码:<input type="text" name="password"><br>
        爱好：
        <input type="checkbox" name="hobbys" value="唱">唱
        <input type="checkbox" name="hobbys" value="跳">跳
        <input type="checkbox" name="hobbys" value="rap">rap
        <input type="checkbox" name="hobbys" value="篮球">篮球

        <br>
        <input type="submit">
    </form>
</div>
</body>
</html>