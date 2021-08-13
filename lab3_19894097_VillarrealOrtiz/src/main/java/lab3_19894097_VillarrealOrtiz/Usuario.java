/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3_19894097_VillarrealOrtiz;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author PabloVillarreal
 */
public class Usuario {
    //Atributos
    int id;
    String nombre;
    String contrasena;
    Date fechaCreacion;
    ArrayList<String> listaSeguidos;
    ArrayList<Publicacion> listaPublicaciones;
    
    //Metodos
    
    //getter de publicaciones del usuario
    public ArrayList getListaPublicaciones(){
        return listaPublicaciones;
    }
    
    //getter del nombre del usuario
    public String getNombre(){
        return nombre;
    }
    
    //setter de nombre del usuario
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    //getter de la contrasena del usuario
    public String getContrasena(){
        return contrasena;
    }
    
    //setter de la constrasena del usuario
    public void setContrasena(String constrasena){
        this.contrasena = constrasena;
    }
    
    //getter del ID del usuario
    public int getID(){
        return id;
    }
    
    //setter del ID del usuario
    public void setID(int id){
        this.id = id;
    }
    
    public void anadirSeguido(String nombreUsuario){
        int verificador = 1;
        for (int i=0; i<this.listaSeguidos.size();i++){
            if (listaSeguidos.get(i).equals(nombreUsuario)){
                verificador = 0;
            }
        }
        if ((nombreUsuario.equals(nombre))){
            verificador = 0;
        }
        if (verificador == 0){
            System.out.println("No es posible seguir a este usuario");
        }
        else{
            listaSeguidos.add(nombreUsuario);
            System.out.println("usuario "+nombreUsuario+" seguido");
        }
    }
    
    public void anadirPublicacion(Publicacion publicacion){
        listaPublicaciones.add(publicacion);
        System.out.println("publicacion numero "+publicacion.getIDPublicacion()+" realizada");
    }
    
    public String usuarioToString(){
        String salida;
        salida = "Usuario numero "+id+"\nNombre: "+nombre+"\nFecha de creacion: "+fechaCreacion+"\nSigue a: \n";
        for (int i=0; i<listaSeguidos.size();i++){
            salida = salida+listaSeguidos.get(i)+"\n";
        }
        salida = salida+"--------------------------------\n";
        for (int i=0; i<listaPublicaciones.size();i++){
            //salida = salida+listaPublicaciones.get(i).publicacionToString()+"\n";
            salida = salida+listaPublicaciones.get(i).publicacionToString()+"\n";
        }
        return salida;
    }
}