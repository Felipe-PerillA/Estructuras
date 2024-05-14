/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio;

import java.util.Scanner;

/**
 *
 * @author nicop
 */
public class Ejercicio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
        ListaEstudiantes listaEstudiantes = new ListaEstudiantes();

        int opcion;
        do {
            System.out.println("\nMenú:");
            System.out.println("1. Agregar estudiante al principio");
            System.out.println("2. Agregar estudiante al final");
            System.out.println("3. Eliminar estudiante al principio");
            System.out.println("4. Eliminar estudiante al final");
            System.out.println("5. Mostrar listado de estudiantes");
            System.out.println("6. Salir");
            System.out.print("Ingrese una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese nombre del estudiante: ");
                    String nombreInicio = scanner.next();
                    System.out.print("Ingrese edad del estudiante: ");
                    int edadInicio = scanner.nextInt();
                    listaEstudiantes.agregarAlInicio(new Estudiante(nombreInicio, edadInicio));
                    break;
                case 2:
                    System.out.print("Ingrese nombre del estudiante: ");
                    String nombreFinal = scanner.next();
                    System.out.print("Ingrese edad del estudiante: ");
                    int edadFinal = scanner.nextInt();
                    listaEstudiantes.agregarAlFinal(new Estudiante(nombreFinal, edadFinal));
                    break;
                case 3:
                    listaEstudiantes.eliminarAlInicio();
                    break;
                case 4:
                    listaEstudiantes.eliminarAlFinal();
                    break;
                case 5:
                    listaEstudiantes.MostrarEstudiantes();
                    break;
                case 6:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción inválida.");
                    break;
            }
        } while (opcion != 6);
        scanner.close();
    }
}
    
    

