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
        System.out.println("===== Agenda de Contactos =====");
        System.out.println("1. Agregar Contacto");
        System.out.println("2. Mostrar Contactos");
        System.out.println("3. Salir");
        System.out.print("Seleccione una opción: ");
    }

    public void agregarContacto(Scanner scanner) {
        System.out.println("===== Agregar Contacto =====");
        System.out.print("Nombre: ");
        String nombre = scanner.nextLine();
        System.out.print("Teléfono: ");
        String telefono = scanner.nextLine();
        System.out.print("Correo Electrónico: ");
        String correoElectronico = scanner.nextLine();
        controlador.agregarContacto(nombre, telefono, correoElectronico);
        System.out.println("Contacto agregado correctamente.");
    }

    public void mostrarContactos() {
        ArrayList<Modelo> listaContactos = controlador.obtenerListaContactos();
        System.out.println("===== Lista de Contactos =====");
        for (Modelo contacto : listaContactos) {
            System.out.println("Nombre: " + contacto.getNombre());
            System.out.println("Teléfono: " + contacto.getTelefono());
            System.out.println("Correo Electrónico: " + contacto.getCorreoElectronico());
            System.out.println("-----------------------------");
        }
    }
}
