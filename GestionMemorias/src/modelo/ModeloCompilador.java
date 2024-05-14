/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author nicop
 */
public class ModeloCompilador {
    //Declaración de variables
    private String nombre;
    private ModeloCompilador nodoAnterior;
    private ModeloCompilador nodoSiguiente;
    private int indice;
//Metodo Constructor
    public ModeloCompilador(String nombre) {
        this.nombre = nombre;
        this.nodoAnterior = null;
        this.nodoSiguiente = null;
        this.indice = 0;
    }
//Metodo para obtener el nombre
    public String getNombre() {
        return nombre;
    }
//Metodo para obtener el nodo anterior
    public ModeloCompilador getNodoAnterior() {
        return nodoAnterior;
    }
//Metodo para asignar el nodo anterior
    public void setNodoAnterior(ModeloCompilador nodoAnterior) {
        this.nodoAnterior = nodoAnterior;
    }
//Metodo para obtener el nodo siguiente
    public ModeloCompilador getNodoSiguiente() {
        return nodoSiguiente;
    }
//Metodo para asignar el nodo siguiente
    public void setNodoSiguiente(ModeloCompilador nodoSiguiente) {
        this.nodoSiguiente = nodoSiguiente;
    }
//Metodo para obtener el indice
    public int getIndice() {
        return indice;
    }
//Metodo para asignar el indice
    public void setIndice(int indice) {
        this.indice = indice;
    }
}

