<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--引入JSTL核心标签库--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%--定义一个变量score 值为100--%>
<%--
从上往下判断
--%>
<c:set var="score" value="85"/>

<c:choose>
    <c:when test="${score>=90}">
        <c:out value="牛"/>
    </c:when>
    <c:when test="${score>80}">
        <c:out value="牛-"/>
    </c:when>
    <c:when test="${score>70}">
        <c:out value="可以"/>
    </c:when>
    <c:when test="${score>60}">
        <c:out value="小菜鸡"/>
    </c:when>
</c:choose>

</body>
</html>
