<%@ page pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <c:url var="base" value="/"/>
    <base href="${base}">
    <meta charset="UTF-8">
    <title>Title</title>
    <style>
        * {
            margin: 0;
            padding: 0;
            box-sizing: border-box;
        }

        .container {
            display: flex;
            flex-direction: column;
            min-height: 100vh;
        }

        #main {
            flex-grow: 1;
            display: flex;
        }

        #article {
            margin: 0 15px;
            height: 100%;

        }

        ul {
            list-style: none;
        }

        table {
            width: 100%;
            table-layout: fixed;
            border-collapse: collapse;
        }

        table thead {
            background-color: #4caf50;
            color: white;
        }

        table th, table td {
            padding: 8px;
            text-align: center;
            border-bottom: 1px solid #ddd;
        }

        a.btn {
            display: inline-block;
            background-color: #f44336;
            color: white;
            padding: 10px 15px;
            text-decoration: none;
            border-radius: 5px;
        }

    </style>
</head>
<body>
<div class="major"></div>
<div class="lab"></div>
<div class="teacher"></div>
<div class="job"></div>
<div class="container">
    <div id="main">
        <div id="article">
            <table>
                <thead>
                <tr>
                    <td>#</td>
                    <td>姓名</td>
                    <td>操作</td>
                </tr>
                </thead>
                <tbody>
                <c:forEach items="${news}" var="u" varStatus="v">
                    <tr>
                        <td>${v.count }</td>
                        <td>${u.title }</td>
                        <td><a class="btn" href="getnew?nid=${u.id }">详细</a></td>

                    </tr>
                </c:forEach>
                </tbody>
            </table>
        </div>
    </div>
</div>
</body>
</html>