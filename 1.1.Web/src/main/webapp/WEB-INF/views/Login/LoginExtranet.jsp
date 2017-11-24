<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="frm" %>
<!DOCTYPE html>
<html lang="es">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <!-- Meta, title, CSS, favicons, etc. -->
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <title>Sistema De Reservas </title>

    <!-- Bootstrap -->

    <link href="resources/Login/css/bootstrap.min.css" rel="stylesheet" />
    <!-- Font Awesome -->

    <link href="resources/Login/fonts/css/font-awesome.min.css" rel="stylesheet" />

    <!-- Custom Theme Style -->

    <link href="resources/Login/css/custom.css" rel="stylesheet" />
</head>

<body style="background:#F7F7F7;">
    <div class="">
        <a class="hiddenanchor" id="toregister"></a>
        <a class="hiddenanchor" id="tologin"></a>

        <div id="wrapper">
            <div id="login" class=" form">
                <section class="login_content">
                    <frm:form method="POST" action="VerificarAcceso">

                        <h1>Sistema De Reservas</h1>
                        <h1>Formulario de acceso</h1>

                        <div>
                            
                            <frm:input path="Name"  placeholder="Usuario"  class="form-control" data-val="true" type="text" value="" />
                        </div>
                        <div>
                            <frm:input path="Contrasenia"  type="password" class="form-control" placeholder="Contraseña" value="" />

                        </div>
                        <div>
                            <button type="submit" class="btn btn-default">Iniciar Sesión</button>
                        
                        </div>
                        <div class="clearfix"></div>
                        <div class="separator">


                            <div class="clearfix"></div>
                            <br />
                            <div>
                                <h1> Canchas Deportivas!!!
                                  </h1>
                               
                                    
                         

                                <p>Â©2017- Proyecto de SOWAD </p>
                            </div>
                        </div>
                    </frm:form>
                </section>
            </div>


        </div>
    </div>
</body>
</html>
