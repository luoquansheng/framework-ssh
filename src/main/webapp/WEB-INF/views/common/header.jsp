<%--
  Created by IntelliJ IDEA.
  User: Ro
  Date: 2020/1/14
  Time: 15:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="contextPath" value="${pageContext.request.contextPath}" scope="page"/>

<html>
    <head>
        <title>管理平台</title>
    </head>
    <body>
        <div style="height: 80px; background-color: aliceblue;">
            <h1>
                <span>管理平台</span>
            </h1>
            <span style="display: inline-block; float: right;">
                <c:if test="${null != sessionScope.CURRENT_SESSION}">
                    <a href="${contextPath}/logout">退出登录</a>
                    <span style="display: inline-block; float: right;">
                        您好，尊敬的|${sessionScope.CURRENT_SESSION}
                    </span>
                </c:if>
            </span>
        </div>