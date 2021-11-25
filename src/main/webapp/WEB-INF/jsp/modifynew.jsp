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
    <title>modifynews</title>
</head>
<body>
<h1>modifynews</h1>
<form action="modifynews" method="post">
    <input type="text" name="nid" value="${get_new.id}" hidden>
    <label>title<input type="text" required name="title" placeholder="请输入标题" value="${get_new.title}"></label><br>
    <textarea name="content" rows="20" cols="150" required placeholder="请输入内容">${get_new.content}</textarea>
    <button type="submit">submit</button>
    <button type="reset">reset</button>

</form>
newID：${get_new.id} <br />
newTile：${get_new.title}<br />
newInsertTime：${get_new.insertTime}<br />
newContent：${get_new.content}
</body>
</html>
