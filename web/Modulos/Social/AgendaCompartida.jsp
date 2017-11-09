<%-- 
    Document   : AgendaCompartida
    Created on : 7/11/2017, 12:43:22 PM
    Author     : Alumno
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en" style="height: 100%; margin: 0px;">
    <head>
        <meta charset="UTF-8">
        <title> Agenda compartida</title>
        <link rel="stylesheet"  type="text/css" href="../../CSS/agendaCompartida.css">
        <script type="text/javascript" src="../../script/agendaCompartida.js"></script>

    </head>

    <body style="height: 100%; margin: 0px;">

        <div class="contenedor">



            <div class="introduccion">
                <div class="contenedora" id="contenedor1">
                    <img src="../../imagenes/temafotografia/AgendaCompartida/fondo1.jpg" class="fondo" id="imagen1">
                </div>
                <div class="contenedorb" id="contenedor2">
                    <img src="../../imagenes/temafotografia/AgendaCompartida/fondo2.jpg" class="fondo" id="imagen2">
                </div> 
                <div class="nombremodulo" id="log">  <img class="logo" src="../../imagenes/logos/AC.png"></div>
            </div>
        </div>
        <div class="cuerpo">
            <div class="iz" name="menuUsu">
                <iframe src="PantallaAmigos.jsp" width=95% height=95%></iframe>
                
            </div>
            <div class="der" name="conversacion">
                <iframe src="PantallaDerecha.jsp" width=100% height=100%></iframe>
            </div>


        </div>







    </body>
</html>