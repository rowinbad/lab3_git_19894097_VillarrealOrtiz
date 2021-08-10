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
public class RedSocial {
    //Atributos
    String nombre;
    int numeroUsuarios, numeroPublicaciones, numeroComentarios, numeroReacciones;
    ArrayList<Usuario> listaUsuarios;
    
    // Metodos
    
    //getter de la lista de usuarios de la red social
    public ArrayList getListaUsuarios(){
        return listaUsuarios;
    }
    
    //getter del nombre de la red social
    public String getNombre(){
        return nombre;
    }
    
    //setter del nombre de la red social
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    //getter del numero de usuarios de la red social
    public int getNumeroUsuarios(){
        return numeroUsuarios;
    }
    
    //setter del numero de usuarios de la red social
    public void setNumeroUsuarios(int num){
        this.numeroUsuarios = num;
    }
    
    //getter del numero de publicaciones de la red social
    public int getNumeroPublicaciones(){
        return numeroPublicaciones;
    }
    
    //setter del numero de publicaciones de la red social
    public void setNumeroPublicaciones(int num){
        this.numeroPublicaciones = num;
    }
    
    //getter del numero de comentarios de la red social
    public int getNumeroComentarios(){
        return numeroComentarios;
    }
    
    //setter del numero de comentarios de la red social
    public void setNumeroComentarios(int num){
        this.numeroComentarios = num;
    }
    
    //getter del numero de reacciones de la red social
    public int getNumeroReacciones(){
        return numeroReacciones;
    }
    
    //setter del numero de reacciones de la red social
    public void setNumeroReacciones(int num){
        this.numeroReacciones = num;
    }
    
    //constructor
    public RedSocial(String nombre){
        this.nombre = nombre;
        this.numeroUsuarios = 0;
        this.numeroPublicaciones = 0;
        this.numeroComentarios = 0;
        this.numeroReacciones = 0;
        listaUsuarios = new ArrayList<Usuario>();
    }
    /**
    * funcionalidad Register que agrega un nuevo usuario a la lista de usuarios de la red social
    * @red social
    * @param nombre
    * @param contrasena
    * @return red social
    */
    public void register(String nombre, String contrasena){
        int verificador = 1;
        for (int i=0; i<this.getNumeroUsuarios();i++){
            if (listaUsuarios.get(i).getNombre().equals(nombre)){
                verificador = 0;
            }
        }
        if (verificador == 0){
            System.out.println("Ya existe este nombre de usuario");
        }
        else {
            Usuario nuevoUsuario = new Usuario();
            nuevoUsuario.setNombre(nombre);
            nuevoUsuario.setContrasena(contrasena);
            numeroUsuarios += 1;
            nuevoUsuario.setID(numeroUsuarios);
            listaUsuarios.add(nuevoUsuario);
            System.out.println("usuario "+listaUsuarios.get(numeroUsuarios-1).getNombre()+" anadido");
        }
    }
}
