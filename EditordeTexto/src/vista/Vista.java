/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

import controlador.Controlador;
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
        System.out.println("===== Editor de Texto Avanzado =====");
        System.out.println("1. Escribir Texto");
        System.out.println("2. Deshacer");
        System.out.println("3. Rehacer");
        System.out.println("4. Mostrar Texto Actual");
        System.out.println("5. Salir");
        System.out.print("Seleccione una opcion: ");
    }

    public void escribirTexto(Scanner scanner) {
        System.out.println("Ingrese el texto:");
        String contenido = scanner.nextLine();
        Modelo modelo = new Modelo();
        modelo.setContenido(contenido);
        controlador.agregarTexto(modelo);
        System.out.println("Texto agregado correctamente.");
    }

    public void mostrarTextoActual() {
        Modelo modelo = controlador.obtenerTextoActual();
        System.out.println("===== Texto Actual =====");
        System.out.println(modelo.getContenido());
    }

    public void deshacer() {
        controlador.deshacer();
        System.out.println("Deshacer completado.");
    }

    public void rehacer() {
        controlador.rehacer();
        System.out.println("Rehacer completado.");
    }
}
