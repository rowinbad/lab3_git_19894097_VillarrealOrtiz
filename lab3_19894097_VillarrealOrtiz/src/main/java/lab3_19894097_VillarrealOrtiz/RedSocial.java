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
public class RedSocial {
    //Atributos
    String nombreRS;
    int numeroUsuarios, numeroPublicaciones, numeroComentarios, numeroReacciones;
    int activoID;
    Usuario usuarioActivo;
    ArrayList<Usuario> listaUsuarios;
    
    // Metodos
    
    //getter de la lista de usuarios de la red social
    public ArrayList getListaUsuarios(){
        return listaUsuarios;
    }
    
    //getter de un usuario a partir de su nombre
    public Usuario getUsuario(String nombreUsuario){
        for (int i=0; i<numeroUsuarios;i++){
            if (listaUsuarios.get(i).getNombre().equals(nombreUsuario)){
                return listaUsuarios.get(i);
            }
        }
        System.out.println("usuario no encontrado");
        return null;
    }
    
    //getter del nombre de la red social
    public String getNombre(){
        return nombreRS;
    }
    
    //setter del nombre de la red social
    public void setNombre(String nombre){
        this.nombreRS = nombre;
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
    
    //getter del numero de reacciones de la red social
    public int getActivoID(){
        return activoID;
    }
    
    //setter del numero de reacciones de la red social
    public void setActivoID(int num){
        this.activoID = num;
    }
    
    //getter del numero de reacciones de la red social
    public Usuario getUsuarioActivo(){
        return usuarioActivo;
    }
    /*
    //setter del numero de reacciones de la red social
    public void setActivoID(int num){
        this.activoID = num;
    }*/
    
    //constructor
    public RedSocial(String nombre){
        this.nombreRS = nombre;
        this.numeroUsuarios = 0;
        this.numeroPublicaciones = 0;
        this.numeroComentarios = 0;
        this.numeroReacciones = 0;
        this.activoID = 0;
        listaUsuarios = new ArrayList<Usuario>();
    }
    /**
    * funcionalidad Register que agrega un nuevo usuario a la lista de usuarios de la red social
    * @param nombre
    * @param contrasena
    */
    public void register(String nombre, String contrasena){
        int verificador = 1;
        for (int i=0; i<numeroUsuarios;i++){
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
            nuevoUsuario.numeroSeguidos = 0;
            nuevoUsuario.listaSeguidos = new ArrayList<String>();
            nuevoUsuario.listaPublicaciones = new ArrayList<Publicacion>();
            nuevoUsuario.fechaCreacion = new Date();
            listaUsuarios.add(nuevoUsuario);
            System.out.println("usuario "+listaUsuarios.get(numeroUsuarios-1).getNombre()+" anadido");
        }
    }
    /**
    * funcionalidad Login que coloca en activo a un usuario en red social
    * @param nombre
    * @param contrasena
    */
    public void login(String nombre, String contrasena){
        int verificador = 1;
        for (int i=0; i<numeroUsuarios;i++){
            if ((listaUsuarios.get(i).getNombre().equals(nombre))&&(listaUsuarios.get(i).getContrasena().equals(contrasena))){
                verificador = 0;
                activoID = i+1;
                usuarioActivo = listaUsuarios.get(i);
                i=numeroUsuarios;
            }
        }
        if (verificador == 1){
            System.out.println("No existe el usuario o no coinciden los datos de ingreso");
        }
    }
    /**
    * funcionalidad Follow que agrega un usuario a la lista de seguidos del usuario activo en la red social
    * @param nombre
    */
    public void follow(String nombre){
        int verificador = 1;
        for (int i=0; i<numeroUsuarios;i++){
            if (listaUsuarios.get(i).getNombre().equals(usuarioActivo.getNombre())){
                verificador = 0;
            }
        }
        if (verificador == 1){
            System.out.println("No existe el usuario a seguir en la red social");
        }
        else{
            usuarioActivo.anadirSeguido(nombre);
            listaUsuarios.remove(this.getUsuario(usuarioActivo.getNombre()));
            listaUsuarios.add(usuarioActivo);
        }
    }
    public void Post(String autor, String tipoPublicacion, String contenido,ArrayList listaDirigidos){
        numeroPublicaciones += 1;
        //constructor con las entradas
        Publicacion nuevaPublicacion = new Publicacion(numeroPublicaciones,autor,tipoPublicacion,contenido,listaDirigidos);
        usuarioActivo.anadirPublicacion(nuevaPublicacion);
        listaUsuarios.remove(this.getUsuario(usuarioActivo.getNombre()));
        listaUsuarios.add(usuarioActivo);
    }
    public String socialNetworkToString(){
        String salida;
        salida = "### Red Social "+nombreRS+" ###";
        if (activoID == 0){
            salida = salida+"\n---Sin usuario activo---\n";
            //string usuario
            for (int i=0; i<numeroUsuarios;i++){
                salida = salida+listaUsuarios.get(i).usuarioToString();
            }
            //final
            salida = salida+"\n-----Fin de la red-----";
            return salida;
        }
        else {
            salida = salida+"\n---usuario activo: "+usuarioActivo.getNombre()+"---\n";
            salida = salida+usuarioActivo.usuarioToString();
            //final
            salida = salida+"\n-----Fin de la red-----";
            return salida;
        }
    }
    public void PrintSocialNetwork(String salida){
        System.out.println(salida);
    }
}
