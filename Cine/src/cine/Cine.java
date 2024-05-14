/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cine;

import java.util.Scanner;

 import java.util.Scanner;
/**
 *
 * @author Juan felipe
 */
public class Cine {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
  

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        System.out.println("Bienvenido al sistema de gestión de cine");

        do {
            System.out.println("\nMenú:");
            System.out.println("1. Gestionar usuarios");
            System.out.println("2. Gestionar cartelera");
            System.out.println("3. Gestionar salas");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Gestionar usuarios");
                    // Aquí iría la lógica para gestionar usuarios
                    break;
                case 2:
                    System.out.println("Gestionar cartelera");
                    // Aquí iría la lógica para gestionar la cartelera
                    break;
                case 3:
                    System.out.println("Gestionar salas");
                    // Aquí iría la lógica para gestionar las salas
                    break;
                case 4:
                    System.out.println("Saliendo del sistema de gestión de cine.");
                    break;
                default:
                    System.out.println("Opción inválida. Por favor, seleccione una opción válida.");
            }
        } while (opcion != 4);

        scanner.close();
    }
}

        
                       
}
  
    