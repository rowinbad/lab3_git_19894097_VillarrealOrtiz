/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3_19894097_VillarrealOrtiz;

import java.util.Date;
import java.time.LocalTime;
import java.util.ArrayList;
        
/**
 *
 * @author PabloVillarreal
 */
public class Publicacion {
    
    //Atributos
    int id;
    String contenido;
    String tipoPublicacion;
    Date fechaPublicacion;
    String autor;
    ArrayList<String> listaDirigidos;
    ArrayList<String> listaCompartidos;
    ArrayList<Comentario> listaComentarios;
    ArrayList<Reaccion> listaReacciones;
    
    //Constructor
    public Publicacion(int identificacion,String usuario, String tipoPublicacion, String contenido,ArrayList dirigidos){
        this.id = identificacion;
        this.contenido = contenido;
        this.tipoPublicacion = tipoPublicacion;
        this.fechaPublicacion = new Date();
        this.autor = usuario;
        this.listaDirigidos = new ArrayList<String>();
        this.listaCompartidos = new ArrayList<String>();
        this.listaComentarios = new ArrayList<Comentario>();
        this.listaReacciones = new ArrayList<Reaccion>();
    }
    
    //getter del ID de la publicacion
    public int getID(){
        return id;
    }
    
    //setter de nombre del usuario
    public void setID(int identificacion){
        this.id = identificacion;
    }
    
    public String publicacionToString(){
        String salida = "Publicacion numero "+id+"\n";
        salida = salida+"Publicada por: "+autor+"\nFecha de publicacion: "+fechaPublicacion+"\nTipo: "+tipoPublicacion+"\n"+"Contenido: "+contenido+"\n";
        for (int i=0; i<listaDirigidos.size();i++){
            salida = salida+listaDirigidos.get(i);
        }
        salida = salida+"--------------------------------\n";
        return salida;
    }
}
