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
    ArrayList<Compartido> listaCompartidos;
    ArrayList<Comentario> listaComentarios;
    ArrayList<Reaccion> listaReacciones;
    
    //Constructor
    public Publicacion(int identificacion,String usuario, String tipoPublicacion, String contenido,ArrayList listaDirigidos){
        this.id = identificacion;
        this.contenido = contenido;
        this.tipoPublicacion = tipoPublicacion;
        this.fechaPublicacion = new Date();
        this.autor = usuario;
        this.listaDirigidos = listaDirigidos;
        this.listaCompartidos = new ArrayList<Compartido>();
        this.listaComentarios = new ArrayList<Comentario>();
        this.listaReacciones = new ArrayList<Reaccion>();
    }
    
    //getter del ID de la publicacion
    public int getIDPublicacion(){
        return id;
    }
    
    //setter del ID de la publicacion
    public void setID(int identificacion){
        this.id = identificacion;
    }
    
    //getter de lista de compartidos de la publicacion
    public ArrayList getCompartidos(){
        return listaCompartidos;
    }
    
    public String publicacionToString(){
        String salida = "Publicacion numero "+id+"\n";
        salida = salida+"Publicada por: "+autor+"\nFecha de publicacion: "+fechaPublicacion+"\nTipo: "+tipoPublicacion+"\n"+"Contenido: "+contenido+"\nDirigido a: \n";
        for (int i=0; i<listaDirigidos.size();i++){
            salida = salida+listaDirigidos.get(i)+"\n";
        }
        salida = salida+"Compartido por: \n";
        for (int i=0; i<listaCompartidos.size();i++){
            salida = salida+listaCompartidos.get(i).getAutor()+" en la fecha:  "+listaCompartidos.get(i).getDate()+"\nDirigido a:\n";
            for (int j=0; j<listaCompartidos.get(i).getListaDirigidos().size();j++){
                salida = salida+listaCompartidos.get(i).getListaDirigidos().get(j)+"\n";
            }
        }
        salida = salida+"--------------------------------\n";
        return salida;
    }
}
