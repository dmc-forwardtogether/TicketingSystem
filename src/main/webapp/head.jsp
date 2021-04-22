<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<header id="fh5co-header-section" role="header" class="">
    <div class="container">

        <!-- <div id="fh5co-menu-logo"> -->
        <!-- START #fh5co-logo -->
        <h1 id="fh5co-logo" class="pull-left"><a href="index.jsp"><img src="images/logo.png" alt="向前票务" style="height: 45px"></a></h1>

        <!-- START #fh5co-menu-wrap -->
        <nav id="fh5co-menu-wrap" role="navigation">


            <ul class="sf-menu" id="fh5co-primary-menu">
                <li class="active">
                    <a href="index.jsp">首页</a>
                </li>
                <li>
                    <a href="#" class="fh5co-sub-ddown">登录</a>
                    <ul class="fh5co-sub-menu">
                        <li><a href="${pageContext.request.contextPath}/profile.jsp">账户</a></li>
                        <li><a href="${pageContext.request.contextPath}/order.jsp">订单</a></li>
                        <li><a href="${pageContext.request.contextPath}/logout">退出登录</a></li>
                    </ul>
                </li>
                <li class="fh5co-special"><a href="${pageContext.request.contextPath}/query.jsp">立即订票</a></li>
            </ul>
        </nav>

    </div>
</header>
</html>
