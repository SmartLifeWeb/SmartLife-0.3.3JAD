/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chat;
// Hora
// Fecha

import java.sql.Date;

// Usuario
// Mensaje
/**
 *
 * @author angel
 */
class mensajes {
   Date fechaHora;
   String Usuario;
   String Mensaje;  
   public mensajes(){
       this.fechaHora=null;
       this.Usuario=null;
       this.Mensaje=null;
   }

    public Date getFechaHora() {
        return fechaHora;
    }

    public void setFechaHora(Date fechaHora) {
        this.fechaHora = fechaHora;
    }

    public String getUsuario() {
        return Usuario;
    }

    public void setUsuario(String Usuario) {
        this.Usuario = Usuario;
    }

    public String getMensaje() {
        return Mensaje;
    }

    public void setMensaje(String Mensaje) {
        this.Mensaje = Mensaje;
    }
   
    
}
