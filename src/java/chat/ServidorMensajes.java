/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chat;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Alumno
 */
@WebServlet(name = "ServidorMensajes", urlPatterns = {"/ServidorMensajes"})
public class ServidorMensajes extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            mensajes mensajeusuario = new mensajes();

            try {
                
                ServerSocket servidorcito = new ServerSocket(14);
                ArrayList<mensajes> nombres = new ArrayList<mensajes>();
                Socket usuario1 = servidorcito.accept();
                Socket usuario2 = servidorcito.accept();

                ObjectInputStream nombre1 = new ObjectInputStream(usuario1.getInputStream());
                ObjectInputStream nombre2 = new ObjectInputStream(usuario2.getInputStream());
                
                String nombreusu1 = "";
                String nombreusu2 = "";
                
                nombreusu1 = (String) nombre1.readObject();
                nombreusu2 = (String) nombre2.readObject();

                ObjectInputStream entrada = new ObjectInputStream(servidorcito.accept().getInputStream());
                mensajeusuario = (mensajes) entrada.readObject();
                
                if (mensajeusuario.getUsuario().equals(nombreusu1)) {
                    while (!mensajeusuario.equals("485fgh4784fh5t4ujty78io78fyg4j86ds74g78sej78y4j86t4djh894tg56jn4g867j4fg56n4bdf5b4163jm46f5g4jn86gh45m56fgn453gh4k53gh41m51h53m4gh3hm41jh56n4mh5m1vjh564m123g4msd4f8s74er8y4trg45d4jfyh4yu8j4fg8h4f86h4df564gv5f4dv154dfjh86g7489s7g84ae8we564t5h45g1b3df46fg574h89d80b4fg54ng56fb4g56f4n1fgbn145cn13cf1gb5g1n51v31x35fn6gf4h345djh65dt56j4dg51n53g1n53fg6n541df56m41dh1mnh53gh12m5h31fh531fh23gh1m53fn121hm56d1hm231g23fm153dgh23m1hg53mfu153fj1")) {
                        //ObjectInputStream entrada = new ObjectInputStream(usuario1.getInputStream());
                        ObjectOutputStream respuesta = new ObjectOutputStream(usuario2.getOutputStream());
                        if (!mensajeusuario.getMensaje().equals("485fgh4784fh5t4ujty78io78fyg4j86ds74g78sej78y4j86t4djh894tg56jn4g867j4fg56n4bdf5b4163jm46f5g4jn86gh45m56fgn453gh4k53gh41m51h53m4gh3hm41jh56n4mh5m1vjh564m123g4msd4f8s74er8y4trg45d4jfyh4yu8j4fg8h4f86h4df564gv5f4dv154dfjh86g7489s7g84ae8we564t5h45g1b3df46fg574h89d80b4fg54ng56fb4g56f4n1fgbn145cn13cf1gb5g1n51v31x35fn6gf4h345djh65dt56j4dg51n53g1n53fg6n541df56m41dh1mnh53gh12m5h31fh531fh23gh1m53fn121hm56d1hm231g23fm153dgh23m1hg53mfu153fj1")) {
                            respuesta.writeObject(mensajeusuario);
                        } else {
                            respuesta.writeObject(mensajeusuario.getUsuario() + " se ha ido!");
                        }

                    }
                        
                } else {
                    if (mensajeusuario.getUsuario().equals(nombreusu2)) {
                        while (!mensajeusuario.equals("485fgh4784fh5t4ujty78io78fyg4j86ds74g78sej78y4j86t4djh894tg56jn4g867j4fg56n4bdf5b4163jm46f5g4jn86gh45m56fgn453gh4k53gh41m51h53m4gh3hm41jh56n4mh5m1vjh564m123g4msd4f8s74er8y4trg45d4jfyh4yu8j4fg8h4f86h4df564gv5f4dv154dfjh86g7489s7g84ae8we564t5h45g1b3df46fg574h89d80b4fg54ng56fb4g56f4n1fgbn145cn13cf1gb5g1n51v31x35fn6gf4h345djh65dt56j4dg51n53g1n53fg6n541df56m41dh1mnh53gh12m5h31fh531fh23gh1m53fn121hm56d1hm231g23fm153dgh23m1hg53mfu153fj1")) {
                            //ObjectInputStream entrada = new ObjectInputStream(usuario1.getInputStream());
                            ObjectOutputStream respuesta = new ObjectOutputStream(usuario1.getOutputStream());
                            if (!mensajeusuario.getMensaje().equals("485fgh4784fh5t4ujty78io78fyg4j86ds74g78sej78y4j86t4djh894tg56jn4g867j4fg56n4bdf5b4163jm46f5g4jn86gh45m56fgn453gh4k53gh41m51h53m4gh3hm41jh56n4mh5m1vjh564m123g4msd4f8s74er8y4trg45d4jfyh4yu8j4fg8h4f86h4df564gv5f4dv154dfjh86g7489s7g84ae8we564t5h45g1b3df46fg574h89d80b4fg54ng56fb4g56f4n1fgbn145cn13cf1gb5g1n51v31x35fn6gf4h345djh65dt56j4dg51n53g1n53fg6n541df56m41dh1mnh53gh12m5h31fh531fh23gh1m53fn121hm56d1hm231g23fm153dgh23m1hg53mfu153fj1")) {
                                respuesta.writeObject(mensajeusuario);
                            } else {
                                respuesta.writeObject(mensajeusuario.getUsuario() + " se ha ido!");
                            }

                        }

                    } else {

                    }
                }

                usuario1.close();
                usuario2.close();
                //System.out.println("Gracias por su uso :')");
                servidorcito.close();

            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
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
