/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package editordetexto;

import modelo.Modelo;

/**
 *
 * @author nicop
 */
public class NodoTexto {
    private Modelo modelo;
    private NodoTexto anterior;
    private NodoTexto siguiente;

    public NodoTexto(Modelo modelo) {
        this.modelo = modelo;
        this.anterior = null;
        this.siguiente = null;
    }

    public Modelo getModelo() {
        return modelo;
    }

    public NodoTexto getAnterior() {
        return anterior;
    }

    public void setAnterior(NodoTexto anterior) {
        this.anterior = anterior;
    }

    public NodoTexto getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoTexto siguiente) {
        this.siguiente = siguiente;
    }
}
