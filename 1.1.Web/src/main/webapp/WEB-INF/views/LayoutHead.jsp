<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="frm" %>
<!DOCTYPE html>

<html>
<head>
    <title>
        Sport Services
    </title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
    <script type="text/javascript" src="http://netdna.bootstrapcdn.com/bootstrap/3.3.4/js/bootstrap.min.js"></script>
    <script type="text/javascript" src="http://maps.googleapis.com/maps/api/js?v3"></script>
    <link href="http://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.3.0/css/font-awesome.min.css"
          rel="stylesheet" type="text/css">
    <link href="resources/extranet/css/estilos.css" rel="stylesheet" type="text/css" />


</head>

<body class="color">
    <br />
    <br />
    <div class="section text-center">
        <div class="container">
            <div class="row">
                <div class="col-md-12">
                    <a href="#"><img src="resources/extranet/Img/Sportservices.png" class="center-block img-responsive"></a>
                </div>
                
            </div>
        </div>
    </div>
    <div class="section navbar-inverse">
        <div class="container navbar-inverse">
            <div class="row">
                <div class="col-md-12 text-center navbar-inverse">
                    <div class="btn-group navbar-inverse">
                        <i class="fa fa-3x fa-calendar fa-fw text-muted"></i>
                        <i class="fa fa-2x fa-arrow-circle-right fa-fw text-muted"></i>
                        <i class="fa fa-3x fa-fw fa-user text-muted"></i>
                        <i class="fa fa-2x fa-arrow-circle-right fa-fw text-muted"></i>
                        <i class="fa fa-3x fa-cc-paypal fa-fw text-muted"></i>
                        <i class="fa fa-2x fa-arrow-circle-right fa-fw text-muted"></i>
                        <i class="fa fa-3x fa-check fa-fw text-muted"></i>
                        <i class="fa fa-2x fa-arrow-circle-right fa-fw text-muted"></i>
                        <i class="fa fa-3x fa-fw fa-soccer-ball-o text-muted"></i>
                    </div>
                </div>
            </div>
        </div>
    </div>

    <div class="nav-col navbar navbar-default navbar-fixed-top navbar-inverse">
        <div class="container">
            <div class="navbar-header">
                <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#navbar-ex-collapse">
                    <span class="sr-only">Toggle navigation</span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
                <a class="navbar-brand"></a>
            </div>
            <div class="collapse navbar-collapse" id="navbar-ex-collapse">
                <ul class="nav navbar-nav navbar-right">
                    <li>
                        <a href="${pageContext.request.contextPath}/"><strong>INICIO</strong><i class="fa fa-fw -phone fa-home"></i></a>
                    </li>
                    <li>
                        <a href="${pageContext.request.contextPath}/QuienesSomos"><strong>QUIENES SOMOS</strong><i class="fa fa-fw fa-building"></i></a>
                    </li>
                   
                    <li>
                        <a href="${pageContext.request.contextPath}/ListarCanchas"><strong>NUESTRAS CANCHAS</strong><i class="fa fa-fw fa-soccer-ball-o"></i></a>
                    </li>
                    <li>
                        <a href="${pageContext.request.contextPath}/Contactenos"><strong>CONTACTENOS</strong><i class="fa fa-fw -o fa-phone-square"></i></a>
                    </li>
                </ul>
                <a href="${pageContext.request.contextPath}/Login" class="btn btn-link navbar-btn" >Iniciar Sesion</a>
                <p class="navbar-text navbar-right">
                    <a href="#" class="navbar-link"></a>
                </p>
            </div>
        </div>
    </div>

    <div class="section">
        <div class="background-image background-image-fixed" style="background-image : url('../../Img/soccer-768685_960_720.jpg');opacity: 0.5;"></div>
        <div>
            <div class="section ">
                <div class="container">
                    <div class="row">
                        <div class="col-md-12 ">