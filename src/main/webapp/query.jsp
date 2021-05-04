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

    <title>查询页</title>

</head>
<body>

<!--header-->
<%@include file="head.jsp" %>

<div id="fh5co-hero">
    <div class="fh5co-spacer fh5co-spacer-md"></div>
    <div class="container">
        <div class="owl-carousel owl-carousel-fullwidth animate-box hero-animate-1">
            <div class="item"><a href="images/img_large_1.jpeg" class="image-popup"><img src="images/img_large_1.jpeg"
                                                                                        alt="image"></a></div>
            <div class="item"><a href="images/img_large_2.jpeg" class="image-popup"><img src="images/img_large_2.jpeg"
                                                                                         alt="image"></a></div>
            <div class="item"><a href="images/img_large_3.jpeg" class="image-popup"><img src="images/img_large_3.jpeg"
                                                                                         alt="image"></a></div>
            <div class="item"><a href="images/img_large_4.jpeg" class="image-popup"><img src="images/img_large_4.jpeg"
                                                                                        alt="image"></a></div>
            <div class="item"><a href="images/img_large_5.jpeg" class="image-popup"><img src="images/img_large_5.jpeg"
                                                                                        alt="image"></a></div>
            <div class="item"><a href="images/img_large_6.jpeg" class="image-popup"><img src="images/img_large_6.jpeg"
                                                                                        alt="image"></a></div>
        </div>
    </div>
</div>

<%--main--%>
<div id="fh5co-main">
    <div class="container">


        <div class="fh5co-spacer fh5co-spacer-md"></div>


        <div class="row">

        </div>


        <div class="col-md-12 animate-box">
            <div id="fh5co-tab-feature" class="fh5co-tab">
                <ul class="resp-tabs-list hor_1">
                    <li><i class="fh5co-tab-menu-icon ti-ticket"></i>国内/国际机票</li>
                    <li><a href="${pageContext.request.contextPath}/add_passenger.jsp"><i class="fh5co-tab-menu-icon ti-back-left"></i>退票改签</a></li>
                    <li><i class="fh5co-tab-menu-icon ti-more"></i>更多服务</li>
                </ul>
                <div class="resp-tabs-container hor_1">
                    <%--订票--%>
                    <div>
                        <div class="row">
                            <div class="col-md-12 col-offset-2 animate-box fade-InUp animated">
                                <form action="${pageContext.request.contextPath}/query" method="post">
                                    <div class="col-md-5">
                                        <div class="form-group">
                                            <label for="departure" class="sr-only">出发地</label>
                                            <input type="text" name="departure" id="departure" placeholder="出发地"
                                                   class="form-control input-lg">
                                        </div>
                                    </div>
                                    <div class="col-md-1">
                                        <ul class="fh5co-social-icons">
                                            <li><button type="button" id="exchange" class="fh5co-arrow ti-arrows-horizontal"></button></li>
                                        </ul>
                                    </div>
                                    <div class="col-md-6">
                                        <div class="form-group">
                                            <label for="destination" class="sr-only">目的地</label>
                                            <input type="text" name="destination" id="destination" placeholder="目的地"
                                                   class="form-control input-lg">
                                        </div>
                                    </div>
                                    <div class="col-md-12">
                                        <div class="form-group">
                                            <label for="time" class="sr-only">出发日期</label>
                                            <input type="text" name="time" id="time" placeholder="出发日期"
                                                   class="form-control input-lg">
                                        </div>
                                    </div>
                                    <div class="col-md-6 col-md-offset-5">
                                        <div class="form-group">
                                            <button type="submit" class="btn btn-primary btn-lg" value="搜索">
                                                <i class="ti-search">搜索</i>
                                            </button>
                                        </div>
                                    </div>
                                </form>
                            </div>
                        </div>
                    </div>

                    <%--更多--%>
                    <div>
                        <div class="row">
                            <div class="col-md-12">
                                <h2>更多功能尽请期待</h2>
                            </div>
                        </div>
                    </div>

                </div>
            </div>
        </div>

        <div class="fh5co-spacer fh5co-spacer-lg"></div>

    </div>
</div>
<!--footer-->
<%@include file="foot.jsp" %>


<%--script--%>

<%@include file="script.jsp" %>
<script>
    $("#time").datetimepicker({
        format: 'YYYY-MM-DD',
        locale: moment.locale('zh-CN')
    });
    $("#exchange").click(function () {
        var departure = $("#departure").val();
        var destination = $("#destination").val();
        $("#departure").val(destination);
        $("#destination").val(departure);
    })
</script>

</body>
</html>
