<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<%--jsp:include--%>

<%--
http://localhost:8080/jsptag.jsp?name=朱大可1&age=18
--%>
<%--转发并携带参数--%>
<jsp:forward page="/jsptag2.jsp">
    <jsp:param name="name" value="zhudake"/>
    <jsp:param name="age" value="18"/>
</jsp:forward>

</body>
</html>
