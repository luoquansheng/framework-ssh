<%@ page contentType="text/html;charset=UTF-8" pageEncoding="utf-8" language="java" %>
<%@ include file="../common/header.jsp"%>
        <div class="content-component">
            <table border="1">
                <thead>
                    <tr>
                        <th>编号</th>
                        <th>用户名</th>
                        <th>性别</th>
                        <th>生日</th>
                        <th>邮箱</th>
                        <th>电话号码</th>
                        <th>座机号码</th>
                        <th>地址</th>
                    </tr>
                </thead>
                <tbody>
                    <c:forEach var="userInfo" items="${userInfos}">
                    <tr>
                        <td>${userInfo.id}</td>
                        <td>${userInfo.userName}</td>
                        <td>${userInfo.gender}</td>
                        <td>${userInfo.birthday}</td>
                        <td>${userInfo.email}</td>
                        <td>${userInfo.phone}</td>
                        <td>${userInfo.telePhone}</td>
                        <td>${userInfo.address}</td>
                    </tr>
                    </c:forEach>
                </tbody>
            </table>
        </div>
<%@ include file="../common/footer.jsp"%>