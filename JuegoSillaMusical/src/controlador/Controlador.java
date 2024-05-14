/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import modelo.Modelo;
import vista.Vista;

/**
 *
 * @author nicop
 */
public class Controlador {
   private Modelo modelo;
    private Vista vista;

    public Controlador(Modelo modelo, Vista vista) {
        this.modelo = modelo;
        this.vista = vista;
    }

    public void simularJuego() {
        vista.mostrarMensaje("Comienza el juego.");

        while (!modelo.hayGanador()) {
            vista.mostrarEstadoSillas(modelo.cabeza, modelo.getNumSillas());
            vista.mostrarMensaje("Música sonando...");
            modelo.moverJugadores();
            vista.mostrarMensaje("¡Música detenida!");
            modelo.ocuparSilla();
            int numJugadoresSentados = modelo.getNumSillasOcupadas();
            if (numJugadoresSentados == 1) {
                vista.mostrarMensaje("Un jugador se ha sentado.");
            } else {
                vista.mostrarMensaje(numJugadoresSentados + " jugadores se han sentado.");
            }
            modelo.eliminarJugador();
        }

        vista.mostrarEstadoSillas(modelo.cabeza, modelo.getNumSillas());
        vista.mostrarMensaje("¡El ganador es el último jugador en la silla!");
    }
        }
    

