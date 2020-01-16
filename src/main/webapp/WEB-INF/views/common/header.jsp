<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="contextPath" value="${pageContext.request.contextPath}" scope="page"/>

<html>
    <head>
        <title>管理平台</title>
        <script type="text/javascript" src="${contextPath}/static/jquery/jquery-1.10.2.min.js"></script>
        <link rel="stylesheet" type="text/css" href="${contextPath}/static/jquery/plugins/left-side/css/left-side-menu.css">
        <link rel="stylesheet" type="text/css" href="${contextPath}/static/jquery/plugins/left-side/font/iconfont.css">
        <script type="text/javascript" src="${contextPath}/static/jquery/plugins/left-side/js/jquery.slimscroll.min.js"></script>
        <script type="text/javascript" src="${contextPath}/static/jquery/plugins/left-side/js/left-side-menu.js"></script>
        <style>
            .display-container{position: absolute; bottom: 0; top: 78px; height: calc(100% - 80px); width: 100%;}
            .fiex{display:-webkit-flex; display:flex;}
            .fiex-line{justify-content: flex-start;}
            .content-component{width: 100%; background-color: #ffffff; padding: 32px;}
        </style>
    </head>
    <body>
        <div class ="top" style="width: 100%; height: 78px; background-color: #3498db !important">
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
        <div class="display-container fiex fiex-line">
            <div class="left-side-menu">
                <div class="lsm-expand-btn">
                    <div class="lsm-mini-btn">
                        <label>
                            <input type="checkbox" checked="checked">
                            <svg viewBox="0 0 100 100" xmlns="http://www.w3.org/2000/svg">
                                <circle cx="50" cy="50" r="30" />
                                <path class="line--1" d="M0 40h62c18 0 18-20-17 5L31 55" />
                                <path class="line--2" d="M0 50h80" />
                                <path class="line--3" d="M0 60h62c18 0 18 20-17-5L31 45" />
                            </svg>
                        </label>
                    </div>
                </div>
                <div class="lsm-container">
                    <div class="lsm-scroll" >
                        <div class="lsm-sidebar">
                            <ul>
                                <li class="lsm-sidebar-item">
                                    <a href="javascript:;">
                                        <i class="my-icon lsm-sidebar-icon icon_1"></i>
                                        <span>系统设置</span>
                                        <i class="my-icon lsm-sidebar-more"></i>
                                    </a>
                                    <ul>

                                        <li>
                                            <a href="javascript:;" class="active">
                                                <span>组织架构</span>
                                            </a>
                                        </li>
                                        <li>
                                            <a href="${contextPath}/userInfo/list">
                                                <span>用户管理</span>
                                            </a>
                                        </li>
                                        <li>
                                            <a href="${contextPath}/role/list">
                                                <span>角色管理</span>
                                            </a>
                                        </li>
                                        <li>
                                            <a href="javascript:;">
                                                <span>权限管理</span>
                                            </a>
                                        </li>
                                        <li class="lsm-sidebar-item">
                                            <a href="javascript:;"><i class="my-icon lsm-sidebar-icon "></i><span>二级菜单11</span><i class="my-icon lsm-sidebar-more"></i></a>
                                            <ul>
                                                <li><a href="javascript:;"><span>地爆天星</span></a></li>
                                                <li><a href="javascript:;"><span>无线月读</span></a></li>
                                                <li><a href="javascript:;"><span>一乐拉面</span></a></li>
                                                <li><a href="javascript:;"><span>血继限界</span></a></li>
                                                <li><a href="javascript:;"><span>秽土转生</span></a></li>
                                                <li><a href="javascript:;"><span>万象天引</span></a></li>
                                                <li><a href="javascript:;"><span>尸鬼封尽</span></a></li>
                                                <li><a href="javascript:;"><span>飞雷神之术</span></a></li>
                                                <li><a href="javascript:;"><span>多重影分身术</span></a></li>
                                                <li><a href="javascript:;"><span>飞雷神之术</span></a></li>
                                                <li><a href="javascript:;"><span>须佐之男</span></a></li>
                                                <li><a href="javascript:;"><span>外道魔像</span></a></li>
                                                <li><a href="javascript:;"><span>双蛇相杀</span></a></li>
                                            </ul>
                                        </li>

                                        <li class="lsm-sidebar-item">
                                            <a href="javascript:;"><i class="my-icon lsm-sidebar-icon "></i><span>二级菜单22</span><i class="my-icon lsm-sidebar-more"></i></a>
                                            <ul >
                                                <li><a href="javascript:;"><span>血继限界</span></a></li>
                                                <li><a href="javascript:;"><span>秽土转生</span></a></li>
                                                <li><a href="javascript:;"><span>万象天引</span></a></li>
                                                <li><a href="javascript:;"><span>尸鬼封尽</span></a></li>
                                                <li><a href="javascript:;"><span>飞雷神之术</span></a></li>
                                            </ul>
                                        </li>
                                    </ul>
                                </li>
                            </ul>
                        </div>
                    </div>
                </div>
            </div>