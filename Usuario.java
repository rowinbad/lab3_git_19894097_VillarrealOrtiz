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
    //Constructor
    public Usuario(String nombre, String contrasena){
        this.nombre = nombre;
        this.contrasena = contrasena;
        //this.id = 
    }
}