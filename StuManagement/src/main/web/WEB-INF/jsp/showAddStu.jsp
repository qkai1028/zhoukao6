<%--
  Created by IntelliJ IDEA.
  User: hp
  Date: 2017/12/11
  Time: 9:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>学员信息管理系统</title>
    <script type="text/javascript" src="${pageContext.request.contextPath}/statics/js/jquery-3.2.1.min.js"></script>
</head>
<body>
    <h1 align="center" style="color:red;">学员信息添加</h1>
    <form action="${pageContext.request.contextPath}/student/submit.html" method="post" onsubmit="return check();">
        <table align="center" border="1">
            <tr bgcolor="#f5f5dc">
                <td>姓名：</td>
                <td>
                    <input type="text" name="name" id="name"/>
                </td>
            </tr>
            <tr bgcolor="#f5f5dc">
                <td>性别：</td>
                <td>
                    <input type="text" name="gender" id="gender"/>
                </td>
            </tr>
            <tr bgcolor="#f5f5dc">
                <td>年龄：</td>
                <td>
                    <input type="text" name="age" id="age"/>
                </td>
            </tr>
            <tr bgcolor="#f5f5dc">
                <td>电话：</td>
                <td>
                    <input type="text" name="telephone" id="telephone"/>
                </td>
            </tr>
            <tr bgcolor="#f5f5dc">
                <td>email：</td>
                <td>
                    <input type="text" name="email" id="email"/>
                </td>
            </tr>
            <tr bgcolor="#f5f5dc">
                <td>班级：</td>
                <td>
                    <select name="classId" id="classId">
                        <option value="0">==请选择==</option>
                        <c:forEach items="${classes}" var="clazz">
                            <option value="${clazz.id}">${clazz.name}</option>
                        </c:forEach>
                    </select>
                </td>
            </tr>
            <tr bgcolor="#f5f5dc">
                <td align="center" colspan="2">
                    <input type="submit" id="saveBtn" value="保存"/>
                    <input type="button" id="returnBtn" onclick="returnList();" value="返回"/>
                </td>
            </tr>
        </table>
    </form>
    <script type="text/javascript">
        function returnList() {
            window.location.href="${pageContext.request.contextPath}/student/listAll.html";
        }
        function check() {
            var name = $("#name").val();
            var gender = $("#gender").val();
            var age = $("#age").val();
            var telephone = $("#telephone").val();
            var email = $("#email").val();
            var classId = $("#classId").val();
            if (name==null || name ==""){
                alert("姓名不能为空！");
                return false;
            }
            if (gender==null || gender ==""){
                alert("性别不能为空！");
                return false;
            }
            if (age==null || age ==""){
                alert("年龄不能为空！");
                return false;
            }
            if (telephone==null || telephone ==""){
                alert("电话不能为空！");
                return false;
            }
            var emailReg = /^[a-zA-Z]\w{2,}@\w{2,}(\.\w{2,3}){1,2}$/;
            if(!emailReg.test(email)){
                alert("邮箱格式错误！")
                return false;
            }
            if(classId=="0"){
                alert("请选择班级");
                return false;
            }
        }
    </script>
</body>
</html>
