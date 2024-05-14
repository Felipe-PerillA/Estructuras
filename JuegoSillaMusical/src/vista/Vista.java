/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

import nodo.NodoSilla;

/**
 *
 * @author nicop
 */
public class Vista {
  public void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }

    public void mostrarEstadoSillas(NodoSilla cabeza, int numSillas) {
        NodoSilla temp = cabeza;
        for (int i = 0; i < numSillas; i++) {
            System.out.print(temp.ocupada ? "X " : "O ");
            temp = temp.siguiente;
        }
        System.out.println();
    }
} 

