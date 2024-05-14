/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import ListaAcertijos.ListaAcertijo;
import java.util.Scanner;
import nodoAcertijo.NodoAcertijo;

/**
 *
 * @author juanFelipe
 */
public class controlador {
    private ListaAcertijo listaAcertijo;

    public controlador() {
        listaAcertijo = new ListaAcertijo();
    }

    public void agregarAcertijo(String enunciado, String respuesta) {
        listaAcertijo.agregarAcertijo(enunciado, respuesta);
    }

    public void jugar() {
        Scanner scanner = new Scanner(System.in);
        NodoAcertijo actual = listaAcertijo.getCabeza();
        int llavesObtenidas = 0;

       
        while (actual != null) {
            System.out.println(actual.getAcertijo().getpregunta());
            String respuestaUsuario = scanner.nextLine();
            if (actual.getAcertijo().verificarRespuesta(respuestaUsuario)) {
                System.out.println("Respuesta correcta!!! Has obtenido una llave.");
                llavesObtenidas++;
                actual = actual.getSiguiente();
            } else {
                System.out.println("Respuesta incorrecta. Porfavor intentalo de nuevo.");
            }
        }

        System.out.println("Felicidades!!! Has completado todos los acertijos.");
        System.out.println("Obtuviste " + llavesObtenidas + " llaves durante el juego.");{
        
    }
        
    }
}
        

    


