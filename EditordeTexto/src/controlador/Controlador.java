/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import editordetexto.NodoTexto;
import java.util.ArrayList;
import modelo.Modelo;

/**
 *
 * @author nicop
 */
public class Controlador {
    private ArrayList<NodoTexto> historial;
    private NodoTexto actual;

    public Controlador() {
        this.historial = new ArrayList<>();
        this.actual = null;
    }

    public void agregarTexto(Modelo modelo) {
        NodoTexto nuevoNodo = new NodoTexto(modelo);
        if (actual != null) {
            actual.setSiguiente(nuevoNodo);
            nuevoNodo.setAnterior(actual);
        }
        actual = nuevoNodo;
        historial.add(actual);
    }

    public Modelo obtenerTextoActual() {
        if (actual != null) {
            return actual.getModelo();
        }
        return new Modelo(); // Devuelve un texto vacío si no hay texto actual
    }

    public void deshacer() {
        if (actual != null && actual.getAnterior() != null) {
            actual = actual.getAnterior();
        }
    }

    public void rehacer() {
        if (actual != null && actual.getSiguiente() != null) {
            actual = actual.getSiguiente();
        }
    }
}
