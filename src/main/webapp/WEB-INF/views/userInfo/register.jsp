<%--
  Created by IntelliJ IDEA.
  User: Ro
  Date: 2020/1/14
  Time: 15:26
  To change this template use File | Settings | File Templates.
--%>
    <%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" language="java" %>

    <%@include file="../common/header.jsp" %>

    <div style="padding-left: 100px;">

        <form:form modelAttribute="userInfo" method="post" action="${contextPath}/register">
            <table border="1">
                <tr>
                    <td>用户名：</td>
                    <td>
                        <form:input path="userName" placeholder="请输入用户名"/>
                    </td>
                </tr>
                <tr>
                    <td>密码：</td>
                    <td>
                        <input name="ciphers" type="password" placeholder="请输入密码"/>
                    </td>
                </tr>
                <tr>
                    <td colspan="2">
                        <input type="submit" value="注册"/>
                    </td>
                </tr>
            </table>
        </form:form>

    </div>

    <%@include file="../common/footer.jsp" %>
