/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tarea;

import controlador.Controlador;
import java.util.Scanner;
import vista.Vista;

/**
 *
 * @author nicop
 */
public class Tarea {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Controlador controlador = new Controlador();
        Vista vista = new Vista(controlador);
        Scanner scanner = new Scanner(System.in);

        while (true) {
            vista.mostrarMenu();
            int opcion = Integer.parseInt(scanner.nextLine());

            switch (opcion) {
                case 1:
                    vista.agregarTarea(scanner);
                    break;
                case 2:
                    vista.mostrarTareas();
                    break;
                case 3:
                    vista.marcarTareaComoCompletada(scanner);
                    break;
                case 4:
                    System.out.println("¡Hasta luego!");
                    System.exit(0);
                default:
                    System.out.println("Opcion inválida. Intente de nuevo.");
            }
        }
    }
}
    

