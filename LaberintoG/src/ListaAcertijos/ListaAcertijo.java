/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ListaAcertijos;

import Acertijo.Acertijo;
import nodoAcertijo.NodoAcertijo;

/**
 *
 * @author juanFelipe
 */
public class ListaAcertijo {
    private NodoAcertijo cabeza;

    public void agregarAcertijo(String enunciado, String respuesta) {
        Acertijo nuevoAcertijo = new Acertijo(enunciado, respuesta);
        NodoAcertijo nuevoNodo = new NodoAcertijo(nuevoAcertijo);
        if (cabeza == null) {
            cabeza = nuevoNodo;
        } else {
            NodoAcertijo temp = cabeza;
            while (temp.getSiguiente() != null) {
                temp = temp.getSiguiente();
            }
            temp.setSiguiente(nuevoNodo);
        }
    }

    public NodoAcertijo getCabeza() {
        return cabeza;
    }
}


