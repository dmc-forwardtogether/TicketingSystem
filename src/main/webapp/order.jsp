<%@ page contentType="text/html;charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="p" uri="https://www.serverTS.com/tag" %>
<%@ page import="com.server.TicketingSystem.domain.Tickets" %>
<!DOCTYPE html>
<!--[if lt IE 7]>
<html class="no-js lt-ie9 lt-ie8 lt-ie7" lang="zh"> <![endif]-->
<!--[if IE 7]>
<html class="no-js lt-ie9 lt-ie8" lang="zh"> <![endif]-->
<!--[if IE 8]>
<html class="no-js lt-ie9" lang="zh"> <![endif]-->
<!--[if gt IE 8]><!-->
<html class="no-js"> <!--<![endif]-->

<head>
    <%--style--%>
    <%@include file="style.jsp" %>
    <%
        Tickets tickets = (Tickets) request.getSession().getAttribute("tickets");
    %>
    <title>${tickets.departure}</title>

</head>

<body>

<!--header-->
<%@include file="head.jsp" %>

<div class="col-md-12 animate-box">
    <h2 class="fh5co-uppercase-heading-sm text-center">注册</h2>
    <div class="fh5co-spacer fh5co-spacer-sm"></div>
</div>

<div id="fh5co-hero">
    <a href="#fh5co-main" class="smoothscroll fh5co-arrow to-animate hero-animate-2"><i class="ti-angle-down"></i></a>
    <!-- End fh5co-arrow -->
    <div class="container">
        <div class="col-md-8 col-md-offset-2">
            <div class="fh5co-hero-wrap">
                <div class="fh5co-hero-intro">
                    <h1 class="to-animate hero-animate-1">查询结果</h1>
                </div>
            </div>
        </div>
    </div>
</div>

<!--main-->
<div id="fh5co-main">

</div>

<!--footer-->
<%@include file="foot.jsp" %>

<%--script--%>
<%@include file="script.jsp" %>

</body>
</html>