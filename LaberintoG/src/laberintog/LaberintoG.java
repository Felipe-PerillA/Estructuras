/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package laberintog;

import Controlador.controlador;
import java.util.Scanner;

/**
 *
 * @author juanFelipe
 */
public class LaberintoG {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bienvenido al laberinto de tu vida.");
        System.out.println("Estas listo para empezar el laberinto? (Si o No)");
        String respuesta = scanner.nextLine();
        
        if (respuesta.equalsIgnoreCase("Si")) {
            controlador controlador = new controlador();

        // Se agregan los acertijos
        controlador.agregarAcertijo("Cuanto es 8 * 6?", "48");
        controlador.agregarAcertijo("Que animal puede girar su cabeza 360 grados?", "buho");
        controlador.agregarAcertijo("Que palabra se escribe incorrectamente en todos los diccionarios?", "incorrectamente");
        controlador.agregarAcertijo("Cual es la capital de Russia?", "moscouw");
        controlador.agregarAcertijo("Cual es la capital de Ucrania?", "kiev");
        controlador.agregarAcertijo("Cual es la capital de Irlanda?", "dublin");
        controlador.agregarAcertijo("Cual es el hueso mas grande del cuerpo?", "femur");
        controlador.agregarAcertijo("Como se llamaba antiguamente estambul?", "constantinopla");
        

        // Inicia el juego
        controlador.jugar();
         } else if (respuesta.equalsIgnoreCase("No")) {
            System.out.println("Gracias por entrar al juego. Hasta luego"); {
             
         }
        }
    }
}        

    

    
    

