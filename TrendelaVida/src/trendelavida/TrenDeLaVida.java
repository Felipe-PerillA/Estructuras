/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package trenDelavida;

/**
 *
 * @author nicop
 */
 /**
 * @param args the command line arguments
 */
        // TrenDeLaVida.java
// TrenDeLaVida.java
import java.util.NoSuchElementException;

public class TrenDeLaVida {
    private Listas lista;

    public TrenDeLaVida() {
        this.lista = new Listas();
    }

    public Listas getLista() {
        return lista;
    }

    public void agregarEvento(String contenido) {
        lista.AgregarVagon(contenido);
    }

    public void eliminarEvento(String contenido) {
        try {
            lista.eliminarVagon(contenido);
        } catch (NoSuchElementException e) {
            System.out.println(e.getMessage());
        }
    }

    public void mostrarViaje() {
        Nodo actual = lista.getPrimerNodo();
        while (actual != null) {
            System.out.println(actual.getContenido());
            actual = actual.getSiguiente();
        }
    }

    public static void main(String[] args) {
        TrenDeLaVida tren = new TrenDeLaVida();

        // Agregar eventos al viaje
        tren.agregarEvento("Nacimiento");
        tren.agregarEvento("Primer dia de escuela");
        tren.agregarEvento("Graduacion universitaria");
        tren.agregarEvento("Primer trabajo");
        tren.agregarEvento("Matrimonio");
        tren.agregarEvento("Nacimiento de hijos");

        // Mostrar el viaje completo
        System.out.println("El viaje de la vida:");
        tren.mostrarViaje();

        // Eliminar un evento
        System.out.println("\nEliminando el evento 'Graduacion universitaria'...");
        tren.eliminarEvento("Graduación universitaria");

        // Mostrar el

    }
}

    
    

