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

    <script type="text/javascript">
        function changeImage() {
            // 改变验证码图片中的文字
            document.getElementById("img").src = "${pageContext.request.contextPath}/imageCode?time="
                + new Date().getTime();
        }
    </script>

    <title>注册页</title>


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
                    <h1 class="to-animate hero-animate-1">注册页面</h1>
                </div>
            </div>
        </div>
    </div>
</div>

<div class="fh5co-spacer fh5co-spacer-md"></div>


<%--main--%>
<div id="fh5co-main">
    <div class="row">
        <h2 class="fh5co-uppercase-heading-sm text-center animate-box">基本信息</h2>
        <div class="fh5co-spacer fh5co-spacer-xs"></div>
        <div class="col-md-8 col-md-offset-2 animate-box">
            <form action="${pageContext.request.contextPath}/RegisterServlet" method="post">
                <div class="col-md-5">
                    <div class="form-group">
                        <label for="username" class="sr-only">用户名</label>
                        <input placeholder="用户名" id="username" name="username" type="text" class="form-control input-lg">
                    </div>
                </div>
                <div class="col-md-5 col-md-offset-2 ">
                    <div class="form-group">
                        <label for="password" class="sr-only">密码</label>
                        <input placeholder="密码" id="password" name="password" type="password" class="form-control input-lg">
                    </div>
                </div>
                <div class="col-md-5">
                    <div class="form-group">
                        <label for="birthday" class="sr-only">生日</label>
                        <input placeholder="生日" id="birthday" name="birthday" type="text" class="form-control input-lg">
                    </div>
                </div>
                <div class="col-md-5 col-md-offset-2">
                    <div class="form-group">
                        <label for="re_password" class="sr-only">确认密码</label>
                        <input placeholder="确认密码" id="re_password" name="re_password" type="password" class="form-control input-lg">
                    </div>
                </div>
                <div class="col-md-5">
                    <div class="form-group">
                        <label for="telephone" class="sr-only">电话号码</label>
                        <input placeholder="电话号码" id="telephone" name="telephone" type="text" class="form-control input-lg">
                    </div>
                </div>
                <div class="col-md-5 col-md-offset-2">
                    <div class="form-group">
                        <label for="gender" class="sr-only">性别</label>
                        <select class="form-control input-lg" name="gender" id="gender">
                            <option>--性别--</option>
                            <option>男</option>
                            <option>女</option>
                        </select>
                    </div>
                </div>
                <div class="col-md-12">
                    <div class="form-group">
                        <label for="message" class="sr-only">个人简介</label>
                        <textarea placeholder="个人简介" name="message" id="message" class="form-control input-lg" rows="3"></textarea>
                    </div>
                </div>
                <div class="col-md-12">
                    <h2 class="fh5co-uppercase-heading-sm text-center animate-box">验证码</h2>
                    <div class="col-md-6">
                        <div class="form-group">
                            <label for="imgCode" class="sr-only">验证码</label>
                            <input placeholder="请输入验证码" name="imgCode" id="imgCode" type="text" class="form-control input-lg">
                        </div>
                    </div>
                    <div class="col-md-6 col-md-offset-2">
                        <div class="form-group">
                            <img src="${pageContext.request.contextPath}/imageCode" alt="验证码">
                            <a href="javascript:void(0);" onclick="changeImage()">看不清换一张</a>
                        </div>
                    </div>
                </div>
                <div class="col-md-5 col-md-offset-5">
                    <div class="form-group">
                        <input type="submit" class="btn btn-primary btn-lg " value="注册">
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
<script>
    $("#birthday").datetimepicker({
        format: 'YYYY-MM-DD',
        locale: moment.locale('zh-CN')
    });
</script>

</body>
</html>
