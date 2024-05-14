    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gestiontarease;

import java.util.Scanner;

/**
 * Materia: Estructura de datos
 * @author juanFelipe
 */
public class GestionTareasE {
    // Clase Main
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ListaTareas listaTareas = new ListaTareas();

        int opcion;
        do {
            System.out.println("----- Menu -----");  //El usario selecciona una opcion del menu
            System.out.println("1. Agregar tarea");
            System.out.println("2. Completar tarea");
            System.out.println("3. Listar tareas");
            System.out.println("4. Eliminar tarea");
            System.out.println("5. Contar tareas pendientes");
            System.out.println("6. Eliminar duplicados");
            System.out.println("7. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de línea después de nextInt()

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese la tarea a agregar: ");
                    String tareaAgregar = scanner.nextLine();
                    listaTareas.agregarTarea(tareaAgregar);
                    break;
                case 2:
                    System.out.print("Ingrese la tarea a completar: ");
                    String tareaCompletar = scanner.nextLine();
                    listaTareas.completarTarea(tareaCompletar);
                    break;
                case 3:
                    listaTareas.listarTareas();
                    break;
                case 4:
                    System.out.print("Ingrese la tarea a eliminar: ");
                    String tareaEliminar = scanner.nextLine();
                    listaTareas.eliminarTarea(tareaEliminar);
                    break;
                case 5:
                    int tareasPendientes = listaTareas.contarTareasPendientes();
                    System.out.println("Número de tareas pendientes: " + tareasPendientes);
                    break;
                case 6:
                    listaTareas.removerDuplicados();
                    System.out.println("Duplicados eliminados correctamente.");
                    break;
                case 7:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida. Inténtelo de nuevo.");
                    break;
            }
        } while (opcion != 7);

        scanner.close();
    }
}


    
    

