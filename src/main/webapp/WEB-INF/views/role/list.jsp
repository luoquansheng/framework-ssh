<%@ page contentType="text/html;charset=UTF-8" pageEncoding="utf-8" language="java" %>
<%@ include file="../common/header.jsp"%>
        <div class="content-component">
            <table border="1">
                <thead>
                    <tr>
                        <th>编号</th>
                        <th>名称</th>
                        <th>描述</th>
                    </tr>
                </thead>
                <tbody>
                <c:forEach var="role" items="${roles}">
                    <tr>
                        <td>${role.id}</td>
                        <td>${role.name}</td>
                        <td>${role.description}</td>
                    </tr>
                </c:forEach>
                </tbody>
            </table>
        </div>
<%@ include file="../common/footer.jsp"%>