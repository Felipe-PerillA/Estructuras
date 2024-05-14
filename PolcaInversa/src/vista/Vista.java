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

    public String obtenerExpresion() {
        System.out.print("Ingrese la expresión en Notación Polaca Inversa: ");
        return scanner.nextLine();
    }

    public void mostrarResultado(double resultado) {
        System.out.println("Resultado: " + resultado);
    }
}

