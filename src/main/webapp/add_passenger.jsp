<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="p" uri="https://www.serverTS.com/tag" %>
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
    <title>订票页</title>

</head>

<body>

<!--header-->
<%@include file="head.jsp" %>

<div class="col-md-12 animate-box">
    <h2 class="fh5co-uppercase-heading-sm text-center">注册</h2>
    <div class="fh5co-spacer fh5co-spacer-sm"></div>
</div>

<div id="fh5co-hero">
    <a href="#fh5co-main" class="smoothscroll fh5co-arrow to-animate hero-animate-3"><i class="ti-angle-down"></i></a>
    <!-- End fh5co-arrow -->
    <div class="container">
        <div class="col-md-8 col-md-offset-2">
            <div class="fh5co-hero-wrap">
                <div class="fh5co-hero-intro">
                    <h1 class="to-animate hero-animate-1">订票信息填写</h1>
                    <p class="to-animate hero-animate-2">因技术有限，暂只能订单人票</p>
                </div>
            </div>
        </div>
    </div>
</div>

<!--main-->
<div id="fh5co-main">
    <div class="row">
        <h2 class="fh5co-uppercase-heading-sm text-center animate-box">乘客信息填写</h2>
        <div class="fh5co-spacer fh5co-spacer-xs"></div>
        <div class="col-md-8 col-md-offset-2 animate-box">
            <form action="${pageContext.request.contextPath}/AddPassengerServlet" method="post">
                <div class="col-md-12">
                    <div class="form-group">
                        <label for="name" class="sr-only">姓名</label>
                        <input placeholder="姓名" id="name" name="name" type="text" class="form-control input-lg">
                    </div>
                </div>
                <div class="col-md-12">
                    <div class="form-group">
                        <label for="id_card" class="sr-only">身份证号码</label>
                        <input placeholder="身份证号码" id="id_card" name="id_card" type="text" class="form-control input-lg">
                    </div>
                </div>
                <div class="col-md-12">
                    <div class="form-group">
                        <label for="air_id" class="sr-only">航班号</label>
                        <input value="${ticket_result.ticket_id}" id="air_id" name="air_id" type="text" class="form-control input-lg" readonly>
                    </div>
                </div>
                <div class="col-md-12">
                    <div class="form-group">
                        <label for="departure" class="sr-only">出发地</label>
                        <input value="${ticket_result.departure}" id="departure" name="departure" type="text" class="form-control input-lg" readonly>
                    </div>
                </div>
                <div class="col-md-12">
                    <div class="form-group">
                        <label for="destination" class="sr-only">目的地</label>
                        <input value="${ticket_result.destination}" id="destination" name="destination" type="text" class="form-control input-lg" readonly>
                    </div>
                </div>
                <div class="col-md-12">
                    <div class="form-group">
                        <label for="ticket_date" class="sr-only">出发时间</label>
                        <input value="${ticket_result.ticket_date}" id="ticket_date" name="ticket_date" type="text" class="form-control input-lg" readonly>
                    </div>
                </div>
                <div class="col-md-12">
                    <div class="form-group">
                        <label for="gender" class="sr-only">性别</label>
                        <select class="form-control input-lg"  name="gender" id="gender">
                            <option>--性别--</option>
                            <option>男</option>
                            <option>女</option>
                        </select>
                    </div>
                </div>
                <div class="col-md-12">
                    <div class="form-group">
                        <input type="submit" class="btn btn-primary btn-lg " value="确认">
                    </div>
                </div>
            </form>
        </div>
    </div>
</div>

<!--footer-->
<%@include file="foot.jsp" %>

<%--script--%>
<%@include file="script.jsp" %>

</body>
</html>