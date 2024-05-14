/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package juegocartas;

import modelo.Modelo;

/**
 *
 * @author nicop
 */
public class NodoCarta {
   private String carta;
    private NodoCarta siguiente;

    public NodoCarta(String carta) {
        this.carta = carta;
        this.siguiente = null;
    }

    public String obtenerCarta() {
        return carta;
    }

    public void establecerSiguiente(NodoCarta siguiente) {
        this.siguiente = siguiente;
    }

    public NodoCarta obtenerSiguiente() {
        return siguiente;
    }
}
