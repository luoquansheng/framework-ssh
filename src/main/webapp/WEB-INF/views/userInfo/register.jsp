<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="contextPath" value="${pageContext.request.contextPath}"/>
<html>
<head>
    <title>管理平台-注册</title>
    <style type="text/css">

        body {width: 100%;position: absolute;top: 0;bottom: 0;background: url("${contextPath}/static/image/index/4_160506151207_1.jpg");background-repeat: no-repeat;overflow: hidden;background-size: cover;}
        .register-main {display:-webkit-flex; display:flex;justify-content: flex-start;width: 500px;margin: auto;background-color: rgba(40,57,101,.9);border-radius: 15px;opacity: 0.85; padding: 50px;}
        .register-main form {width: 100%;}
        .input-title {text-align: right;width: 40%;color: #f0f0f0;font-weight: 800;}
        .register-btn {border: none;border-radius: 25px;margin: auto;width: 100%;outline: none;padding: 0;background-color: #1161ee;font-weight: 800;font-size: 18px;color: #f0f0f0;}
        .register-btn:hover {cursor: pointer;}
        .login-input {border: none;-webkit-border-radius: 25px;/*适配以webkit为核心的浏览器(chrome、safari等)*/-moz-border-radius: 25px;/*适配firefox浏览器*/-ms-border-radius: 25px;/*适配IE浏览器*/-o-border-radius: 25px;/*适配opera浏览器*/border-radius: 25px;/*适配所有浏览器(需要放在最后面，类似于if..else if..else..)*/width: 100%;display: -moz-inline-box;display: inline-block;margin: auto;outline:none;background-color:rgba(10%,20%,30%,0.3);color: #f0f0f0;}
        table {width: 100%;}
        table input {height: 40px;padding: 15px 20px;}
        table td {padding: 10px;}
        .login-btn {color: #fff;font-weight: 900;text-decoration: none;text-align: right;}
        .login-btn:hover {color: red;}
        .login-btn:after{color: #fff;}

    </style>
</head>
<body>
<div class="register-main">
    <form method="post" action="${contextPath}/register">
        <table>
            <tr>
                <td class="input-title">用户名：</td>
                <td>
                    <input name="userName" class="login-input"/>
                </td>
            </tr>
            <tr>
                <td class="input-title">密码：</td>
                <td>
                    <input name="ciphers" class="login-input" type="password"/>
                </td>
            </tr>
            <tr>
                <td class="input-title">性别：</td>
                <td>
                    <input name="gender" class="login-input"/>
                </td>
            </tr>
            <tr>
                <td class="input-title">生日：</td>
                <td>
                    <input name="birthday" class="login-input" type="datetime-local"/>
                </td>
            </tr>
            <tr>
                <td class="input-title">邮箱：</td>
                <td>
                    <input name="email" class="login-input"/>
                </td>
            </tr>
            <tr>
                <td class="input-title">电话号码：</td>
                <td>
                    <input name="phone" class="login-input"/>
                </td>
            </tr>
            <tr>
                <td class="input-title">座机号码：</td>
                <td>
                    <input name="telePhone" class="login-input"/>
                </td>
            </tr>
            <tr>
                <td class="input-title">地址：</td>
                <td>
                    <input name="address" class="login-input"/>
                </td>
            </tr>
            <tr>
                <td colspan="2">
                    <input type="submit" class="register-btn" value="注&nbsp;&nbsp;&nbsp;册"/>
                </td>
            </tr>
            <tr>
                <td>&nbsp;</td>
                <td>
                    <a class="login-btn" href="${contextPath}/login">登&nbsp;&nbsp;&nbsp;录</a>
                </td>
            </tr>
        </table>
    </form>
</div>
</body>
</html>
