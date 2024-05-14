/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author nicop
 */
public class NodoPilaDeMemoria {
    //Declaración de variables
    private ModeloCompilador[] pila;
    private int tope;
    //Metodo Constructor

    public NodoPilaDeMemoria() {
        pila = new ModeloCompilador[100];
        tope = -1;
    }
    //Metodo para validar 

    public boolean estaVacia() {
        return tope == -1;
    }
    //Metodo para expandir la pila

    public void push(ModeloCompilador variable) {
        if (tope >= pila.length - 1) {
            // Expandir la pila si se llena
            ModeloCompilador[] nuevaPila = new ModeloCompilador[pila.length * 2];
            System.arraycopy(pila, 0, nuevaPila, 0, pila.length);
            pila = nuevaPila;
        }
        pila[++tope] = variable;
    }
    //Metodo para validar

    public ModeloCompilador pop() {
        if (estaVacia()) {
            return null;
        }
        return pila[tope--];
    }
    //Metodo para asignar tamaño

    public int size() {
        return tope + 1;
    }
}
