/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestiontarease;

/**
 * Materia: Estructura de datos
 * @author juanFelipe
 */
// Nombramos Variables
public class Nodos {
     private String tarea;
    private boolean completada;
    private Nodos siguiente;

    public Nodos(String tarea) {
        this.tarea = tarea;
        this.completada = false;
        this.siguiente = null;
    // Agregamos el constructor getter and setter
    }

    public String getTarea() {
        return tarea;
    }

    public void setTarea(String tarea) {
        this.tarea = tarea;
    }

    public boolean isCompletada() {
        return completada;
    }

    public void setCompletada(boolean completada) {
        this.completada = completada;
    }

    public Nodos getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodos siguiente) {
        this.siguiente = siguiente;
    }
}

