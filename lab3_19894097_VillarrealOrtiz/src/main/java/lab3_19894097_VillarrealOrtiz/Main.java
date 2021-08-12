/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3_19894097_VillarrealOrtiz;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author PabloVillarreal
 */
public class Main {

    public static void main(String[] args) {
        // TODO code application logic here
        RedSocial rs = new RedSocial("GramInsta");
        
        int activo = 0;
        int menu = 1;
        Scanner entrada = new Scanner(System.in);
        
        while (menu != 0){
            System.out.println("### RED SOCIAL : "+rs.getNombre()+" ###");
            if (activo == 0){
                System.out.println("### Authentication ###");
                System.out.println("Elija su opcion");
                System.out.println("1. Register");              //funcionalidad Register
                System.out.println("2. Login");                 //funcionalidad Login
                System.out.println("3. Visualizar red social");
                System.out.println("0. Salir del programa");
                menu = entrada.nextInt();
                //varios if para las funciones
                if (menu == 1){
                    System.out.println("Ingrese nombre: ");
                    entrada.nextLine();
                    String lecturaNombre = entrada.nextLine();
                    System.out.println("Ingrese contrasena: ");
                    String lecturaContrasena = entrada.nextLine();
                    rs.register(lecturaNombre,lecturaContrasena);
                    /*System.out.println("el numero de usuarios es: "+rs.getNumeroUsuarios());
                    Usuario prueba = (Usuario) rs.getListaUsuarios().get(0);
                    String prueba1 = prueba.getNombre();
                    System.out.println("el nombre del primer usuario es: "+prueba1);*/
                }
                if (menu == 2){
                    System.out.println("Ingrese nombre: ");
                    entrada.nextLine();
                    String lecturaNombre = entrada.nextLine();
                    System.out.println("Ingrese contrasena: ");
                    String lecturaContrasena = entrada.nextLine();
                    rs.login(lecturaNombre,lecturaContrasena);
                }
                if (menu == 3){
                    String salida = rs.socialNetworkToString();
                    rs.PrintSocialNetwork(salida);
                }
            }
            while ((rs.activoID != 0)&&(menu != 0)) {
                System.out.println("### Registrado como: "+rs.getUsuarioActivo().getNombre()+" ###");
                System.out.println("Elija su opcion");
                System.out.println("1. Realizar publicacion");  //funcionalidad Post
                System.out.println("2. Seguir a un usuario");   //funcionalidad Follow
                System.out.println("3. Compartir publicacion"); //funcionalidad Share
                System.out.println("4. Visualizar red social"); //funcionalidad visualize
                System.out.println("5. Cerrar sesion");         //funcionalidad Logout
                System.out.println("0. Salir del programa");
                menu = entrada.nextInt();
                //varios if para las funciones
                if (menu == 1){
                    System.out.println("Ingrese tipo de publicacion: ");
                    entrada.nextLine();
                    String lecturaTipo = entrada.nextLine();
                    System.out.println("Ingrese contenido de publicacion: ");
                    String lecturaContenido = entrada.nextLine();
                    System.out.println("Ingrese cantidad de dirigidos: ");
                    int lecturaCantidadDirigidos = entrada.nextInt();
                    entrada.nextLine();
                    ArrayList<String> dirigidos = new ArrayList<String>();
                    while (lecturaCantidadDirigidos > 0){
                        System.out.println("Ingrese usuario dirigido: ");
                        String lecturaDirigido = entrada.nextLine();
                        dirigidos.add(lecturaDirigido);
                        lecturaCantidadDirigidos -= 1;
                    }
                    rs.Post(rs.getUsuarioActivo().getNombre(),lecturaTipo,lecturaContenido,dirigidos);
                }
                if (menu == 2){
                    System.out.println("Ingrese nombre: ");
                    entrada.nextLine();
                    String lecturaNombre = entrada.nextLine();
                    rs.follow(lecturaNombre);
                }
                if (menu == 4){
                    String salida = rs.socialNetworkToString();
                    rs.PrintSocialNetwork(salida);
                }
                if (menu == 5){
                    rs.setActivoID(0);
                }
            }
        }
        System.out.println("Cerrando Programa");
    }
        
}
