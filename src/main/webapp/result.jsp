<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
    <title></title>

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
<%--    <p:user/>--%>
    <div class="row">
        <div class="col-md-12 animate-box">
            <div class="panel-group fh5co-accordion" id="accordion" role="tablist" aria-multiselectable="true">

                <c:forEach items="${tickets}" var="ticket">
                    <div class="panel panel-default ">
                        <div class="panel-heading" role="tab" id="headingOne" data-toggle="collapse"
                             data-parent="#accordion" data-target="#collapseOne" aria-expanded="false"
                             aria-controls="collapseOne">
                            <h4 class="panel-title">
                                <a class="accordion-toggle">${ticket.air_company}&nbsp;&nbsp;
                                        ${ticket.ticket_id}&nbsp;&nbsp;${ticket.ticket_price}元</a>
                            </h4>
                        </div>
                        <div id="collapseOne" class="panel-collapse collapse in" role="tabpanel"
                             aria-labelledby="headingOne">
                            <div class="panel-body">
                                    <h2 class="col-md-12">${ticket.ticket_startTime}--${ticket.ticket_arrivalTime}</h2>
                                    <h2 class="col-md-4">${ticket.departure}--${ticket.destination}</h2>
                                    <h2 class="col-md-2 col-md-offset-6" style="color: red">${ticket.ticket_price}元</h2>
                                    <p class="col-md-4">${ticket.air_company}&nbsp;&nbsp;
                                            ${ticket.ticket_id}
                                    </p>
                                    <a href="#"><button class="col-md-2 col-md-offset-6 btn-lg" type="button">订票</button></a>
                            </div>
                        </div>
                    </div>
                </c:forEach>

            </div>
        </div>
    </div>
</div>

<!--footer-->
<%@include file="foot.jsp" %>

<%--script--%>
<%@include file="script.jsp" %>

</body>
</html>