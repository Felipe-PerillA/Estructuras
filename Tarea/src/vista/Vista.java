/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

import controlador.Controlador;
import java.util.ArrayList;
import java.util.Scanner;
import modelo.Modelo;

/**
 *
 * @author nicop
 */
public class Vista {
    private Controlador controlador;

    public Vista(Controlador controlador) {
        this.controlador = controlador;
    }

    public void mostrarMenu() {
        System.out.println("===== Gestion de Tareas Pendientes =====");
        System.out.println("1. Agregar Tarea");
        System.out.println("2. Mostrar Tareas");
        System.out.println("3. Marcar Tarea como Completada");
        System.out.println("4. Salir");
        System.out.print("Seleccione una opcion: ");
    }

    public void agregarTarea(Scanner scanner) {
        System.out.println("Ingrese la descripción de la tarea:");
        String descripcion = scanner.nextLine();
        controlador.agregarTarea(descripcion);
        System.out.println("Tarea agregada correctamente.");
    }

    public void mostrarTareas() {
        ArrayList<Modelo> listaTareas = controlador.obtenerListaTareas();
        System.out.println("===== Lista de Tareas Pendientes =====");
        for (int i = 0; i < listaTareas.size(); i++) {
            Modelo tarea = listaTareas.get(i);
            System.out.println((i + 1) + ". [" + (tarea.isCompletada() ? "X" : " ") + "] " + tarea.getDescripcion());
        }
    }

    public void marcarTareaComoCompletada(Scanner scanner) {
        System.out.println("Ingrese el numero de la tarea que desea marcar como completada:");
        int indice;
        try {
            indice = Integer.parseInt(scanner.nextLine()) - 1;
            ArrayList<Modelo> listaTareas = controlador.obtenerListaTareas();
            if (indice >= 0 && indice < listaTareas.size()) {
                controlador.marcarComoCompletada(indice);
                System.out.println("Tarea marcada como completada.");
            } else {
                System.out.println("Error: El numero de tarea proporcionado no es valido.");
            }
        } catch (NumberFormatException e) {
            System.out.println("Error: Por favor, ingrese un numero válido.");
        }
    }
    
}
