<%--
  Created by IntelliJ IDEA.
  User: Ro
  Date: 2020/1/14
  Time: 15:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" pageEncoding="utf-8" language="java" %>
<%@ include file="../common/header.jsp"%>
        <div>
            <table border="1">
                <tr>
                    <td>编号：</td>
                    <td>${userInfo.id}</td>
                </tr>
                <tr>
                    <td>用户名：</td>
                    <td>${userInfo.userName}</td>
                </tr>
                <tr>
                    <td>密码：</td>
                    <td>${userInfo.ciphers}</td>
                </tr>
                <tr>
                    <td>性别：</td>
                    <td>${userInfo.gender}</td>
                </tr>
                <tr>
                    <td>生日：</td>
                    <td>${userInfo.birthday}</td>
                </tr>
                <tr>
                    <td>邮箱：</td>
                    <td>${userInfo.email}</td>
                </tr>
                <tr>
                    <td>电话号码：</td>
                    <td>${userInfo.phone}</td>
                </tr>
                <tr>
                    <td>座机号码：</td>
                    <td>${userInfo.telePhone}</td>
                </tr>
                <tr>
                    <td>地址：</td>
                    <td>${userInfo.address}</td>
                </tr>
            </table>
        </div>
<%@ include file="../common/footer.jsp"%>