<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
    <script src="${pageContext.request.contextPath}/static/js/jquery-3.1.1-main.js"></script>
    <script>
      function a(){
        jQuery.post({
          url:"${pageContext.request.contextPath}/a1",
          data:{'name':$("#userName").val()},
          success:function (data,status){
            alert(data);
            alert(status);
          }
        })
      }
    </script>
  </head>
  <body>
  <%--onblur：触发失去焦点事件--%>
  输入名字:<input type="text" id="userName" onblur="a()">
  </body>
</html>
