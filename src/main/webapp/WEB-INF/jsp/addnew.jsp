<%--
  Created by IntelliJ IDEA.
  User: guoqi
  Date: 2021/11/25
  Time: 14:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>addnews</title>
</head>
<body>
<h1>addnews</h1>
<form action="addnews" method="post">
    <label>title<input type="text" required name="title" placeholder="请输入标题"></label><br>
    <textarea name="content" rows="20" cols="150" required placeholder="请输入内容"></textarea>
    <button type="submit">submit</button>
    <button type="reset">reset</button>
</form>
</body>
</html>
