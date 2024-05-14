/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trenDelavida;

/**
 *
 * @author juanFelipe
 * Asignatura: Estructura de Datos
 * Descripcion: El programa mostrara al usuario los vagones de la vida,
 *                                    Nacimiento,Primer dia de escuela,
 *                                    Graduacion Universitaria, Primer Trabajo, 
 *                                             Matrinmonio, Nacimiento de Hijos,
 *                                          tal como lo describe en el ejercicio 
 *                                                        puesto por el docente
 */
public class Nodo {
//Definimos las variables contenido, siguiente.
    private String contenido;
    private Nodo siguiente;
   

    public Nodo(String contenido) {
        this.contenido = contenido;
        this.siguiente = null;
    }

    public String getContenido() {         //Generamos el constructor Getter and Setter para nuestras variables
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }

   
    }
