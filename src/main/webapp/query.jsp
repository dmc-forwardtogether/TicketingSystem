<%@ page contentType="text/html;charset=UTF-8"%>
<html>
<head>

    <%--style--%>
    <%@include file="style.jsp" %>

    <title>查询页</title>

</head>
<body>

<!-- START #fh5co-header -->
<%@include file="head.jsp" %>

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

<div class="row">
    <div class="col-md-8 col-offset-2 animate-box fade-InUp animated">
        <form action="#" method="post">
            <div class="col-md-3">
                <div class="form-group">
                    <label for="departure" class="sr-only">出发地</label>
                    <input type="text" name="departure" id="departure" placeholder="出发地" class="form-control input-lg">
                </div>
            </div>
        </form>
    </div>
</div>



<!--footer-->
<%@include file="foot.jsp" %>


<%--script--%>
<%@include file="script.jsp" %>


</body>
</html>
