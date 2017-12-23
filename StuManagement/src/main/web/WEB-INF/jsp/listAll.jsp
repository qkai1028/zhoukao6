<%--
  Created by IntelliJ IDEA.
  User: hp
  Date: 2017/12/11
  Time: 9:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>学员信息管理系统</title>
    <c:if test="${!empty message}">
        <script type="text/javascript">
            window.alert("${message}");
        </script>
    </c:if>
</head>
<body>
    <h1 align="center" style="color:red;">学员信息列表</h1>
    <table align="center" border="1">
        <tr>
            <td colspan="7" align="right"><a href="${pageContext.request.contextPath}/student/showAdd.html">添加学员</a></td>
        </tr>
        <tr bgcolor="#8fbc8f">
            <th align="center">编号</th>
            <th align="center">姓名</th>
            <th align="center">性别</th>
            <th align="center">年龄</th>
            <th align="center">电话</th>
            <th align="center">email</th>
            <th align="center">班级</th>
        </tr>
        <c:forEach items="${students}" var="student" varStatus="i">
        <tr <c:if test="${i.index%2==1}">bgcolor="#ffe4c4"</c:if>>
            <td>${student.id}</td>
            <td>${student.name}</td>
            <td>${student.gender}</td>
            <td>${student.age}</td>
            <td>${student.telephone}</td>
            <td>${student.email}</td>
            <td>${student.clazz.name}</td>
        </tr>
        </c:forEach>
    </table>
</body>
</html>
