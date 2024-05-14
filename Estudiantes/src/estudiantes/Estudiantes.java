/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package estudiantes;

import controlador.Controlador;
import java.util.Scanner;

/**
 *
 * @author juanFelipe
 */
public class Estudiantes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Controlador controlador = new Controlador();
        Scanner scanner = new Scanner(System.in);

        // Agregar estudiantes
        System.out.println("Ingrese el nombre del estudiante:");
        String nombreEstudiante = scanner.nextLine();
        System.out.println("Ingrese la edad del estudiante:");
        int edadEstudiante = scanner.nextInt();
        controlador.agregarEstudiante(nombreEstudiante, edadEstudiante);

        // Ver estudiantes
        controlador.verEstudiantes();

        // Actualizar estudiante
        scanner.nextLine(); // Consumir el salto de línea pendiente
        System.out.println("Ingrese el nombre del estudiante a actualizar:");
        String nombreAnterior = scanner.nextLine();
        System.out.println("Ingrese el nuevo nombre del estudiante:");
        String nuevoNombre = scanner.nextLine();
        System.out.println("Ingrese la nueva edad del estudiante:");
        int nuevaEdad = scanner.nextInt();
        controlador.actualizarEstudiante(nombreAnterior, nuevoNombre, nuevaEdad);

        // Ver estudiantes después de actualizar
        controlador.verEstudiantes();

        // Eliminar estudiante
        scanner.nextLine(); // Consumir el salto de línea pendiente
        System.out.println("Ingrese el nombre del estudiante a eliminar:");
        String nombreEliminar = scanner.nextLine();
        controlador.eliminarEstudiante(nombreEliminar);

        // Ver estudiantes después de eliminar
        controlador.verEstudiantes();

        scanner.close();
    }
}

  


    
    

