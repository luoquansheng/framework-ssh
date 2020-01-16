<%@ page contentType="text/html;charset=UTF-8" pageEncoding="utf-8" language="java" %>
<%@ include file="../common/header.jsp"%>
        <div>
            <form method="post" action="${contextPath}/role">
                <table border="1">
                    <tr>
                        <th>名称</th>
                        <td>
                            <input type="text" name="name">
                        </td>
                    </tr>
                    <tr>
                        <th>描述</th>
                        <td>
                            <input type="text" name="description">
                        </td>
                    </tr>
                    <tr>
                        <td colspan="2">
                            <input type="submit" value="   提  交   ">
                        </td>
                    </tr>
                </table>
            </form>
        </div>
<%@ include file="../common/footer.jsp"%>