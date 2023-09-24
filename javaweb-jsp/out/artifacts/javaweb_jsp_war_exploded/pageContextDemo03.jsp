<%--
  Created by IntelliJ IDEA.
  User: 齐小胖
  Date: 2023/6/7
  Time: 17:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    pageContext.forward("/index.jsp");//转发
    //request.getRequestDispatcher("/index.jsp").forward(request,response);
%>

</body>
</html>
