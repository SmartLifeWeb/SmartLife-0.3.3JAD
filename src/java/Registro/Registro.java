/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Registro;

import BD.cBD;
import java.io.*;
import java.sql.*;
import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.System.out;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Diego
 */
public class Registro extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response) {
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        cBD conexion = new cBD();
        String existe ="";
        String usuario = request.getParameter("user");
        String avt = "1";
        String nombre = request.getParameter("nombre");
        String apaterno = request.getParameter("a_paterno");
        String amaterno = request.getParameter("a_materno");
        String tel = request.getParameter("telefono");
        String email = request.getParameter("correo");
        String rol = request.getParameter("rol");
        String pass = request.getParameter("contrasena");

        String likes = "0";

        Connection con = null;
        try {
            con = conexion.conectar();
        } catch (Exception error) {
            out.println("<script> alert('No conec') </script>");
            out.print(error.toString() + "no conecto");
        }

        try {
            existe = conexion.Registrar(con, usuario, avt, rol, nombre, apaterno, amaterno, tel, email, pass, likes);
            if (existe.equals("no")) {
                out.println("<script> alert('Registro exitoso')</script>");
                out.println("<script>location.replace('/SmartLifeWeb/Modulos/InicioSesion/Registrarte.html');</script>");
            } else if(existe.equals("si")){
                out.println("<script> alert('Este nombre de usuario ya existe')</script>");
                out.println("<script>location.replace('/SmartLifeWeb/Modulos/InicioSesion/Registrarte.html');</script>");
                
            }
        } catch (Exception error) {
            out.print(error.toString());
            out.println("<script> alert('Mal') </script>");

        }
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);

    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
