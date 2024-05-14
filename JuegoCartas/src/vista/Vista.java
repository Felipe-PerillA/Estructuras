/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

import java.util.Scanner;



/**
 *
 * @author nicop
 */
public class Vista {
   private Scanner scanner;

    public Vista() {
        scanner = new Scanner(System.in);
    }

    public void mostrarCartaActual(String carta) {
        System.out.println("Carta actual del jugador: " + carta);
    }

    public void solicitarSiguienteJugador() {
        System.out.println("Presiona Enter para pasar al siguiente jugador...");
        scanner.nextLine();
    }
}
