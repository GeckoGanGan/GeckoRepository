<%--
  Created by IntelliJ IDEA.
  User: 齐小胖
  Date: 2023/6/3
  Time: 20:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <%--JSP表达式
  作用：用来将程序的输出，输出到客户端
    <%=变量或表达式%>
  --%>
  <%=new java.util.Date()%>
  <hr>

  <%--JSP脚本片段--%>
  <%
  int sum = 0;
    for (int i = 0; i < 100; i++) {
      sum+=i;
    }
    out.println("<h1>sum="+sum+"</h1>");
  %>

  <%
  int x = 10;
  out.println(x);
  %>

  <%
  int y = 20;
  out.println(y);
  %>

  <%for (int i = 0; i <10 ; i++) {%>
  <h1>hello word</h1>
  <%}%>

  <hr>

  <%!

  static {
    System.out.println("Loading...");
  }
  private int Globalvar = 0;
  public void zhudake(){
    System.out.println("进入了zhudake()方法！");
  };

  %>






  </body>
</html>
