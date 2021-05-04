<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" %>
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

    <title>登录页</title>

</head>

<body>

<!--header-->
<%@include file="head.jsp" %>

<%--band--%>
<div id="fh5co-hero">
    <a href="#fh5co-main" class="smoothscroll fh5co-arrow to-animate hero-animate-4"><i class="ti-angle-down"></i></a>
    <!-- End fh5co-arrow -->
    <div class="container">
        <div class="col-md-8 col-md-offset-2">
            <div class="fh5co-hero-wrap">
                <div class="fh5co-hero-intro">
                    <h1 class="to-animate hero-animate-1">登录</h1>
                </div>
            </div>
        </div>
    </div>
</div>

<div class="fh5co-spacer fh5co-spacer-md"></div>


<%--main--%>
<div id="fh5co-main">
    <div class="row">
        <h2 class="fh5co-uppercase-heading-sm text-center animate-box">登录</h2>
        <div class="fh5co-spacer fh5co-spacer-xs"></div>
        <div class="col-md-8 col-md-offset-2 animate-box">
            <form action="${pageContext.request.contextPath}/login" method="post">
                <div class="col-md-12">
                    <div class="form-group">
                        <label for="username" class="sr-only">用户名</label>
                        <input placeholder="用户名" id="username" name="username" type="text" class="form-control input-lg">
                    </div>
                </div>
                <div class="col-md-12">
                    <div class="form-group">
                        <label for="password" class="sr-only">密码</label>
                        <input placeholder="密码" id="password" name="password" type="password" class="form-control input-lg">
                    </div>
                </div>
                <div class="col-md-6 col-md-offset-5">
                    <div class="form-group">
                        <input type="submit" class="btn btn-primary btn-lg " value="登录">
                    </div>
                </div>
                <div class="col-md-4 col-md-offset-8">
                    <div class="form-group">
                        <a href="register.jsp">还没有账号?去注册-></a>
                    </div>
                </div>
            </form>
        </div>

    </div>

    <div class="fh5co-spacer fh5co-spacer-md"></div>
</div>

<!--footer-->
<%@include file="foot.jsp" %>

<%--script--%>
<%@include file="script.jsp" %>

</body>
</html>
