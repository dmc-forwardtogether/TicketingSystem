<%@ page contentType="text/html;charset=UTF-8"%>
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

    <title>向前票务</title>

</head>

<body>

<!--header-->
<%@include file="head.jsp" %>

<div class="col-md-12 animate-box">
    <h2 class="fh5co-uppercase-heading-sm text-center">注册</h2>
    <div class="fh5co-spacer fh5co-spacer-sm"></div>
</div>

<div id="fh5co-hero">
    <a href="#fh5co-main" class="smoothscroll fh5co-arrow to-animate hero-animate-4"><i class="ti-angle-down"></i></a>
    <!-- End fh5co-arrow -->
    <div class="container">
        <div class="col-md-8 col-md-offset-2">
            <div class="fh5co-hero-wrap">
                <div class="fh5co-hero-intro">
                    <h1 class="to-animate hero-animate-1">总有你想要的低价</h1>
                    <p class="to-animate hero-animate-3">
                        <a href="${pageContext.request.contextPath}/query.jsp" class="btn btn-outline btn-lg">
                            立即订票
                        </a>
                    </p>
                </div>
            </div>
        </div>
    </div>
</div>

<div id="fh5co-main">
    <div class="fh5co-spacer fh5co-spacer-lg"></div>
    <div class="row">
        <h1 class="col-md-4 col-md-offset-4">低价机票推荐(功能暂未上线)</h1>
    </div>
    <div class="fh5co-spacer fh5co-spacer-lg"></div>
</div>

<!--footer-->
<%@include file="foot.jsp" %>

<%--script--%>
<%@include file="script.jsp" %>

</body>
</html>