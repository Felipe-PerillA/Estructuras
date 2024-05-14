/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;


import java.util.Scanner;
import javax.swing.JFrame;
/**
 *
 * @author nicop
 */
    public class Vista {
      private Scanner scanner;

    public Vista() {
        scanner = new Scanner(System.in);
    }

    public String solicitarContrasenaOriginal() {
        System.out.print("Ingrese la contrasena : ");
        return scanner.nextLine();
    }

    public String solicitarContrasenaEncriptada() {
        System.out.print("Ingrese la contrasena encriptada para desencriptpar: ");
        return scanner.nextLine();
    }

    public void mostrarContrasenaEncriptada(String contrasenaEncriptada) {
        System.out.println("Ingrese la contrasena encriptada: " + contrasenaEncriptada);
    }

    public void mostrarContrasenaDesencriptada(String contrasenaDesencriptada) {
        System.out.println("Contrasena original: " + contrasenaDesencriptada);
    }
}
