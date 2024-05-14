/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nodoAcertijo;

import Acertijo.Acertijo;

/**
 *
 * @author juanFelipe
 */
public class NodoAcertijo {
    private Acertijo acertijo;
    private NodoAcertijo siguiente;

    public NodoAcertijo(Acertijo acertijo) {
        this.acertijo = acertijo;
        this.siguiente = null;
    }

    public NodoAcertijo getSiguiente() {   // Se agrega el constructor getter an setter
        return siguiente;
    }

    public void setSiguiente(NodoAcertijo siguiente) {
        this.siguiente = siguiente;
    }

    public Acertijo getAcertijo() {
        return acertijo;
    }
}


