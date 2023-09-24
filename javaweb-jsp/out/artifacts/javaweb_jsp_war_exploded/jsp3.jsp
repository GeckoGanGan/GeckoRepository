<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Title</title>
</head>
<body>
<%--@include会将两个页面合二为一--%>
<%@include file="commen/header.jsp" %>
<h1>网页主体</h1>
<%@include file="commen/footer.jsp" %>
<hr>

<%--JSP标签--%>
<%--
jsp:include
拼接页面，不是合二为一
--%>
<jsp:include page="commen/header.jsp"/>
<h1>我是网页主体</h1>
<jsp:include page="commen/footer.jsp"/>


</body>
</html>
