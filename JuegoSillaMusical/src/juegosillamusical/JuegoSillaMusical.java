/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package juegosillamusical;

import controlador.Controlador;
import modelo.Modelo;
import vista.Vista;


/**
 *
 * @author nicop
 */
public class JuegoSillaMusical {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   Modelo modelo = new Modelo(5); // Ejemplo: 5 sillas iniciales
        Vista vista = new Vista();
        Controlador controlador = new Controlador(modelo, vista);
        controlador.simularJuego();
    }
}
    

