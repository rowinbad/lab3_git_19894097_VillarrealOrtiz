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
public class Publicacion {
    int id;
    String contenido;
    String tipoPublicacion;
    LocalTime fechaPublicacion;
    Usuario usuario;
    //Constructor
    public Publicacion(Usuario usuario, String contenido, String tipoPublicacion){
        this.contenido = contenido;
        this.tipoPublicacion = tipoPublicacion;
        this.fechaPublicacion = LocalTime.now();
        this.usuario = usuario;
        //this.id = 
    }
}
