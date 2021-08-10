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
    ArrayList<Usuario> listaUsuarios;
    
    //getter del nombre de la red social
    public String getNombre(){
        return nombre;
    }
    
    //getter de la lista de usuarios de la red social
    public ArrayList getListaUsuarios(){
        return listaUsuarios;
    }
    
    //setter del nombre de la red social
    public void setNombre(String nombre){
        this.nombre = nombre;
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
        for (Usuario i:this.listaUsuarios ){
            if (i.nombre == nombre){
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
            this.listaUsuarios.add(nuevoUsuario);
        }
    }
}
