/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import juegocartas.NodoCarta;
import modelo.Modelo;
import vista.Vista;

/**
 *
 * @author nicop
 */
public class Controlador {
   private Modelo modelo;
   private Vista  vista;

    public Controlador (Modelo modelo, Vista vista) {
        this.modelo = modelo;
        this.vista = vista;
    }

    public void iniciarJuego() {
        while (true) {
            vista.mostrarCartaActual(modelo.obtenerCartaJugadorActual());
            vista.solicitarSiguienteJugador();
            modelo.siguienteJugador();
        }
    }
}

