<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--引入JSTL核心标签库--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="x" uri="http://java.sun.com/jsp/jstl/xml" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h4>if测试</h4>
<form action="coreif.jsp" method="get">
  <%--
  EL表达式获取表单中的数据
  ${param.参数名}
  --%>
  <input type="text" name="username" value="${param.username}">
  <input type="submit" value="登录">
</form>
<%--判断如果提交的用户是管理员，则登录成功--%>
<c:if test="${param.username=='admin'}" var="isadmin" >
    <c:out value="管理员欢迎你"/>
</c:if>
<c:out value="${isadmin}"/>
</body>
</html>
