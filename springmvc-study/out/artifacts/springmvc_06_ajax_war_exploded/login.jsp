<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script src="${pageContext.request.contextPath}/static/js/jquery-3.1.1-main.js"></script>
    <script>
        function a1(){
            $.get({
                url:"${pageContext.request.contextPath}/a3",
                data:{'name':$("#name").val()},
                success:function (data){
                    if (data.toString()==="ok"){
                        $("#nameInfo").css("color","green");
                    }else {
                        $("#nameInfo").css("color","red");
                    }
                    $("#nameInfo").html(data);
                }
            })
        }
        function a2(){
            $.post({
                url:"${pageContext.request.contextPath}/a3",
                data:{'pwd':$("#pwd").val()},
                success:function (data){
                    if (data.toString()==="密码正确"){
                        $("#pwdInfo").css("color","blue");
                    }else {
                        $("#pwdInfo").css("color","red")
                    }
                    $("#pwdInfo").html(data);
                }
            })
        }
    </script>
</head>
<body>

<p>
    用户名：<input type="text" id="name" onblur="a1()">
    <span id="nameInfo"></span>
</p>

<p>
    密码：<input type="text" id="pwd" onblur="a2()">
    <span id="pwdInfo"></span>
</p>
</body>
</html>
