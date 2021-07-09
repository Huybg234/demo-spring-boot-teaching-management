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
<%--    <style type="text/css">--%>
<%--        <%@ include file="../static/teacher.css" %>--%>
<%--    </style>--%>
</head>
<body>
<table id="table">
    <tr>
        <th>Id</th>
        <th>Họ và tên</th>
        <th>Địa chỉ</th>
        <th>Số điện thoại</th>
        <th>Trình độ</th>
    </tr>
    <c:forEach var="teacher" items="${teachers}">
        <tr>
            <td>${teacher.id}</td>
            <td>${teacher.name}</td>
            <td>${teacher.address}</td>
            <td>${teacher.phoneNumber}</td>
            <td>${teacher.teacherLevel}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
