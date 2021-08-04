/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3_19894097_VillarrealOrtiz;

import java.time.LocalTime;

/**
 *
 * @author rowin
 */
public class Reaccion {
    int id;
    String contenido;
    String tipoReaccion;
    LocalTime fechaPublicacion;
    Usuario usuario;
    //Constructor
    public Reaccion(Usuario usuario, String contenido, String tipoReaccion){
        this.contenido = contenido;
        this.tipoReaccion = tipoReaccion;
        this.fechaPublicacion = LocalTime.now();
        this.usuario = usuario;
        //this.id = 
    }
}
