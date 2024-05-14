/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.util.Random;
import nodo.NodoSilla;




/**
 *
 * @author nicop
 */
public class Modelo {
   public NodoSilla cabeza;
   private int numSillas;

    public Modelo(int numSillas) {
        this.numSillas = numSillas;
        inicializarLista();
    }

    private void inicializarLista() {
        cabeza = new NodoSilla(false);
        NodoSilla prev = cabeza;
        for (int i = 1; i < numSillas; i++) {
            NodoSilla nuevo = new NodoSilla(false);
            prev.siguiente = nuevo;
            prev = nuevo;
        }
        prev.siguiente = cabeza;
    }

     public void moverJugadores() {
        Random rand = new Random();
        int pasos = rand.nextInt(numSillas);
        for (int i = 0; i < pasos; i++) {
            cabeza = cabeza.siguiente;
        }
    }

    public void ocuparSilla() {
        cabeza.ocupada = true;
    }

    public void eliminarJugador() {
        while (cabeza.ocupada) {
            cabeza.ocupada = false;
            cabeza = cabeza.siguiente;
        }
        cabeza.ocupada = true;
    }

    public boolean hayGanador() {
        int jugadoresRestantes = numSillas;
        NodoSilla temp = cabeza;
        do {
            if (temp.ocupada) {
                jugadoresRestantes--;
            }
            temp = temp.siguiente;
        } while (temp != cabeza);
        return jugadoresRestantes == 1;
    }

    public int getNumSillas() {
        return numSillas;
    }    
    public int getNumSillasOcupadas() {
        int count = 0;
        NodoSilla temp = cabeza;
        do {
            if (temp.ocupada) {
                count++;
            }
            temp = temp.siguiente;
        } while (temp != cabeza);
        return count;
    }
}


