<%--
  Created by IntelliJ IDEA.
  User: guoqi
  Date: 2021/11/25
  Time: 14:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>listnew</title>
</head>
<body>
<h1>listnew</h1>
<table>
    <thead>
    <tr>
        <td>count</td>
        <td>title</td>
        <td>操作</td>
        <td>drop</td>
        <td>modify</td>
    </tr>
    </thead>
    <tbody>
    <form action="search" method="post">
        <input type="text" name="title" id="title">
        <button type="submit">submit</button>
    </form>
    <c:forEach items="${news}" var="u" varStatus="v">
        <tr>
            <td>${v.count }</td>
            <td>${u.title }</td>
            <td><a class="btn" href="getnew?nid=${u.id }">详细</a></td>
            <td><a class="btn" href="dropnew?nid=${u.id }">drop</a></td>
            <td><a class="btn" href="modifynews?nid=${u.id }">modify</a></td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>
