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
 * @author rowin
 */
public class Compartido{
    //Atributos
    String autor;
    Date fechaCompartido;
    ArrayList<String> listaDirigidos;
    
    //Metodos
    
    //constructor
    public Compartido(String autor,ArrayList listaDirigidos) {
        this.autor = autor;
        this.fechaCompartido = new Date();
        this.listaDirigidos = listaDirigidos;
    }
    
    //getter del autor
    public String getAutor(){
        return autor;
    }
    
    //setter de autor
    public void setAutor(String nombre){
        this.autor = nombre;
    }
    
    //getter de la fecha de compartido
    public Date getDate(){
        return fechaCompartido;
    }
    
    //getter de la lista de dirigidos
    public ArrayList getListaDirigidos(){
        return listaDirigidos;
    }
    
}
