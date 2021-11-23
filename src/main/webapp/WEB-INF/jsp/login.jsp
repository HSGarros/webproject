<%--
  Created by IntelliJ IDEA.
  User: guoqi
  Date: 2021/11/23
  Time: 15:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="login" method="post">
  用户名：<input type="text" name="account"><br>
  密码：<input type="password" name="pwd"><br>
  <button type="submit">登录</button>
</form>
<a href="/webproject_war_exploded/welcome">测试：未登录则重定向回本页</a>
</body>
</html>
