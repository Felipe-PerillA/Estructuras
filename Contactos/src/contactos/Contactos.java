/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package contactos;

import controlador.Controlador;
import java.util.Scanner;
import vista.Vista;

/**
 *
 * @author nicop
 */
public class Contactos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Controlador controlador = new Controlador();
        Vista vista = new Vista(controlador);
        Scanner scanner = new Scanner(System.in);

        while (true) {
            vista.mostrarMenu();
            int opcion = scanner.nextInt(); // Leer la opción del usuario
            scanner.nextLine(); // Consumir el salto de línea pendiente

            switch (opcion) {
                case 1:
                    vista.agregarContacto(scanner);
                    break;
                case 2:
                    vista.mostrarContactos();
                    break;
                case 3:
                    System.out.println("¡Hasta luego!");
                    System.exit(0);
                default:
                    System.out.println("Opción inválida. Intente de nuevo.");
            }
        }
    }
}
    

