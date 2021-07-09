<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: HuyNQ
  Date: 6/13/2021
  Time: 5:25 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
<%--    <style type="text/css">--%>
<%--        <%@ include file="../static/teacher.css " %>--%>
<%--    </style>--%>
    <title>Title</title>
</head>
<body>

<script>
    const insertFail = location.search.split('insertFail=')[1]
    if (insertFail) {
        alert("Thêm mới thất bại");
    }
</script>

<form:form id="form" action="./student" method="POST">
    <root>
        <div class="form-group">
            <form:label path="name">Name</form:label>
            <form:input path="name"/>
            <br/>
        </div>
        <div class="form-group">
            <form:label path="address">Address</form:label>
            <form:input path="address" />
            <br/>
        </div>
        <div class="form-group">
            <form:label path="phoneNumber">PhoneNumber</form:label>
            <form:input path="phoneNumber"/>
            <br/>
        </div>
        <div class="form-group">
            <form:label path="teacherLevel">TeacherLevel</form:label>
            <form:input path="teacherLevel"/>
            <br/>
        </div>
        <div class="form-group">
            <button id="save-button" type="submit">Save</button>
        </div>
    </root>
</form:form>
</body>
</html>