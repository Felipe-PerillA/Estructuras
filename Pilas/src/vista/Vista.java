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
    public static String solicitarCadena() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la cadena a verificar: ");
        return scanner.nextLine();
    }

    public static void mostrarResultado(boolean resultado) {
        if (resultado) {
            System.out.println("Los parentesis estan correctamente balanceados.");
        } else {
            System.out.println("Los parentesis NO estan correctamente balanceados.");
        }
    }
}

