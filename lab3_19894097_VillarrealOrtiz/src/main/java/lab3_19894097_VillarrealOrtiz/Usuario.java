/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3_19894097_VillarrealOrtiz;

import java.util.ArrayList;

/**
 *
 * @author rowin
 */
public class Usuario {
    //Atributos
    int id;
    String nombre;
    String contrasena;
    ArrayList<Publicacion> listaPublicaciones;
    //Metodos
    
    //getter del nombre del usuario
    public String getNombre(){
        return nombre;
    }
    
    //getter de publicaciones del usuario
    public ArrayList getListaPublicaciones(){
        return listaPublicaciones;
    }
    
    //setter de nombre del usuario
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    //setter de la constrasena del usuario
    public void setContrasena(String constrasena){
        this.contrasena = constrasena;
    }
    
    /*
    public Usuario(String nombre, String contrasena){
        this.nombre = nombre;
        this.contrasena = contrasena;
        //this.id = 
    }*/
}