/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package juegocartas;

import controlador.Controlador;
import modelo.Modelo;
import vista.Vista;



/**
 *
 * @author nicop
 */
public class JuegoCartas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Modelo modelo = new Modelo ();
        Vista  vista = new Vista();
        Controlador controlador = new Controlador(modelo, vista);

        // Agregar algunas cartas de ejemplo
        modelo.agregarCarta("As de Corazones");
        modelo.agregarCarta("Reina de Diamantes");
        modelo.agregarCarta("Joker");

        // Iniciar el juego
        controlador.iniciarJuego();
    }
}

    

