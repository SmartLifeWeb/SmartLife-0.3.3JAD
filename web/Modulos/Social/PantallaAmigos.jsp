<%-- 
    Document   : PantallaAmigos
    Created on : 7/11/2017, 08:33:16 PM
    Author     : angel
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%><%@page import="java.sql.SQLException"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="chat.jsp" >
            <h1><font Style="color: white"> Tus amigos son:</font></h1><br><br><select name="tipoactividad">
                <%
                    Connection c = null;
                    Statement sta = null;
                    ResultSet r = null;

                    try {
                        Class.forName("com.mysql.jdbc.Driver").newInstance();
                        c = DriverManager.getConnection("jdbc:mysql://localhost/smartdatabase", "root", "n0m3l0");
                        sta = c.createStatement();

                    } catch (SQLException error) {

                        out.println(error.toString());
                    }
                    int contador = 0;
                    out.println("<div class='contenedormenu'>");

                    try {
                        HttpSession sesion = request.getSession();
                        String Usuario = (String) sesion.getAttribute("idUsuario");
                        String nombrebusqueda = Usuario; //cambiar al usuario una vez hecha las sesiones
                        r = sta.executeQuery("Select idUsuario,Nombre from Usuario inner join chat on idUsuario=chat.idUsuario2 where chat.idusuario1 = '" + Usuario + "'  ;");

                        while (r.next()) {
                            contador = contador + 1;
                            String id = r.getString("idUsuario");
                            String nombre = r.getString("Nombre");

                            out.println("<option value='" + id + "'>" + nombre + "</option>");

                        }
                        r = sta.executeQuery("Select idUsuario,Nombre from Usuario inner join chat on idUsuario=chat.idUsuario1 where chat.idusuario2 = '" + Usuario + "'  ;");
                        while (r.next()) {
                            contador = contador + 1;
                            String id = r.getString("idUsuario");
                            String nombre = r.getString("Nombre");

                            out.println("<option value='" + id + "'>" + nombre + "</option>");

                        }
                        
                        out.println("</select><br><br><input type='submit' name='jaj' value='Iniciar Chat'>");
                        

                    } catch (SQLException error) {
                        out.println(error.toString());
                    }


                %>
                
               
            </select>
        </form>


    </body>
</html>
