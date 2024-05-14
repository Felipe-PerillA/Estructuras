/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trenDelavida;

import java.util.NoSuchElementException;

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

                                        //Definimos variable primerNodo
public class Listas {
    private Nodo primerNodo;

    public Listas() {
        this.primerNodo = null;
    }

    public Nodo getPrimerNodo() {
        return primerNodo;
    }

    public void setPrimerNodo(Nodo primerNodo) {
        this.primerNodo = primerNodo;
    }

    public void AgregarVagon(String contenido) {
        Nodo nuevoNodo = new Nodo(contenido);
        if (primerNodo == null) {
            primerNodo = nuevoNodo;
        } else {
            Nodo actual = primerNodo;
            while (actual.getSiguiente() != null) {
                actual = actual.getSiguiente();
            }
            actual.setSiguiente(nuevoNodo);
        }
    }

    public void eliminarVagon(String contenido) {
        if (primerNodo == null) {
            throw new NoSuchElementException("La lista está vacía");
        }
            
        }
    }

                



   


