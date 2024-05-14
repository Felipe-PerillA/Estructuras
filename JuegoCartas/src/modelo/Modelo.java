/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import juegocartas.NodoCarta;

/**
 *
 * @author nicop
 */
public class Modelo {
    private NodoCarta inicio;
    private NodoCarta ultimo;
    private NodoCarta jugadorActual;

    public Modelo() {
        inicio = null;
        ultimo = null;
        jugadorActual = null;
    }

    public void agregarCarta(String carta) {
        NodoCarta nuevoNodo = new NodoCarta(carta);
        if (inicio == null) {
            inicio = nuevoNodo;
            ultimo = nuevoNodo;
            jugadorActual = nuevoNodo;
            ultimo.establecerSiguiente(inicio);
        } else {
            ultimo.establecerSiguiente(nuevoNodo);
            nuevoNodo.establecerSiguiente(inicio);
            ultimo = nuevoNodo;
        }
    }

    public String obtenerCartaJugadorActual() {
        return jugadorActual.obtenerCarta();
    }

    public void siguienteJugador() {
        jugadorActual = jugadorActual.obtenerSiguiente();
    }
}