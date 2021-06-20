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
            <form:label path="fullName">Name</form:label>
            <form:input path="fullName"/>
            <br/>
        </div>
        <div class="form-group">
            <form:label path="birthday">Birthday</form:label>
            <form:input path="birthday" pattern ="^(0[1-9]|3[01]|[12][0-9])/(0[1-9]|1[0-2])/[0-9]{4}$" />
            <br/>
        </div>
        <div class="form-group">
            <form:label path="hometown">Hometown</form:label>
            <form:input path="hometown"/>
            <br/>
        </div>
        <div class="form-group">
            <form:label path="className">ClassName</form:label>
            <form:input path="className"/>
            <br/>
        </div>
        <div class="form-group">
            <form:label path="gender">Gender</form:label>
            <form:input path="gender"/>
            <br/>
        </div>
        <div class="form-group">
            <button id="save-button" type="submit">Save</button>
        </div>
    </root>
</form:form>
</body>
</html>