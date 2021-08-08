/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3_19894097_VillarrealOrtiz;

import java.util.Scanner;

/**
 *
 * @author rowin
 */
public class Main {

    public static void main(String[] args) {
        // TODO code application logic here
        int activo = 0;
        Scanner entrada = new Scanner(System.in);
        int menu = 1;
        while (menu != 0){
            System.out.println("### RED SOCIAL : GramInsta ###");
            if (activo == 0){
                System.out.println("### Authentication ###");
                System.out.println("Elija su opcion");
                System.out.println("1. Register");
                System.out.println("2. Login");
                System.out.println("0. Salir del programa");
                menu = entrada.nextInt();
                //varios if para las funciones
            }
            else {
                System.out.println("### Registrado como: (getUsuario a partir de ID ###");
                System.out.println("Elija su opcion");
                System.out.println("1. Realizar publicacion");  //funcionalidad Post
                System.out.println("2. Seguir a un usuario");   //funcionalidad Follow
                System.out.println("3. Compartir publicacion"); //funcionalidad Share
                System.out.println("4. Visualizar red social"); //funcionalidad visualize
                System.out.println("5. Cerrar sesión");         //funcionalidad Logout
                System.out.println("0. Salir del programa");
                menu = entrada.nextInt();
                //varios if para las funciones
            }
        }
        System.out.println("Cerrando Programa");
    }
    
}
