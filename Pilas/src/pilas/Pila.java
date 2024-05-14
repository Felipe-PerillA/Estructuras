/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pilas;

/**
 *
 * @author nicop
 */
public class Pila {
     Nodo tope;

    public Pila() {
        this.tope = null;
    }

    public boolean isEmpty() {
        return tope == null;
    }

    public void push(char dato) {
        Nodo nuevo = new Nodo(dato);
        nuevo.siguiente = tope;
        tope = nuevo;
    }

    public char pop() {
        if (isEmpty()) {
            throw new RuntimeException("La pila está vacía");
        }
        char dato = tope.dato;
        tope = tope.siguiente;
        return dato;
    }
}
