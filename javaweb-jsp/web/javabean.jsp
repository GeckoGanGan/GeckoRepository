<%@ page import="com.zhudake.entity.People" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>Title</title>
</head>
<body>
<%
  /*
     People people = new People();
     people.setAddress("西安");
     people.setId(1);
     people.setName("张三");
     people.setAge(18);
  */
%>
<jsp:useBean id="people" class="com.zhudake.entity.People" scope="page"/>
<jsp:setProperty name="people" property="address" value="西安"/>
<jsp:setProperty name="people" property="id" value="1"/>
<jsp:setProperty name="people" property="name" value="张三"/>
<jsp:setProperty name="people" property="age" value="18"/>

姓名：<jsp:getProperty name="people" property="name"/>
地址：<jsp:getProperty name="people" property="address"/>
年龄：<jsp:getProperty name="people" property="age"/>
id：<jsp:getProperty name="people" property="id"/>

</body>
</html>
