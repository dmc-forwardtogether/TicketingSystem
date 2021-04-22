<%@ page contentType="text/html;charset=UTF-8" %>
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
          <h1 class="to-animate hero-animate-1">总有你想要的低价</h1>
          <h2 class="to-animate hero-animate-2">Lovely Made by <a href="#" target="_blank">FREEHTML5.co</a>
          </h2>
          <p class="to-animate hero-animate-3"><a href="#" class="btn btn-outline btn-lg">立即订票</a></p>
        </div>
      </div>
    </div>
  </div>
</div>

<div class="fh5co-spacer fh5co-spacer-md"></div>


<%--main--%>
<div id="fh5co-main">
  <div class="row">
    <h2 class="fh5co-uppercase-heading-sm text-center animate-box">Slider</h2>
    <div class="fh5co-spacer fh5co-spacer-xs"></div>
    <div class="col-md-8 col-md-offset-2 animate-box">
      <form action="#" method="post">
        <div class="col-md-12">
          <div class="form-group">
            <label for="username" class="sr-only">用户名</label>
            <input placeholder="用户名" id="username" type="text" class="form-control input-lg">
          </div>
        </div>
        <div class="col-md-12">
          <div class="form-group">
            <label for="password" class="sr-only">密码</label>
            <input placeholder="密码" id="password" type="text" class="form-control input-lg">
          </div>
        </div>
        <div class="col-md-6">
          <div class="form-group">
            <label for="gender" class="sr-only">性别</label>
            <select class="form-control input-lg" id="gender">
              <option>--性别--</option>
              <option>男</option>
              <option>女</option>
            </select>
          </div>
        </div>
        <div class="col-md-6">
          <div class="form-group">
            <label for="message" class="sr-only">个人简介</label>
            <textarea placeholder="Message" id="message" class="form-control input-lg" rows="3"></textarea>
          </div>
        </div>
        <div class="col-md-6">
          <div class="form-group">
  <%--          todo capchar--%>
          </div>
        </div>
        <div class="col-md-12">
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

</body>
</html>
