<%--
  Created by IntelliJ IDEA.
  User: HuyNQ
  Date: 6/14/2021
  Time: 10:40 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
    <title>Title</title>
    <style type="text/css">
        <%@ include file="../static/teacher.css" %>
    </style>
</head>
<body>
<table id="table">
    <tr>
        <th>Id</th>
        <th>Họ và tên</th>
        <th>Ngày sinh</th>
        <th>Quê quán</th>
        <th>Tên lớp</th>
        <th>Giới tính</th>
    </tr>
    <c:forEach var="student" items="${students}">
        <tr>
            <td>${student.id}</td>
            <td>${student.fullName}</td>
            <td>${student.birthday}</td>
            <td>${student.hometown}</td>
            <td>${student.className}</td>
            <td>${student.gender}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
