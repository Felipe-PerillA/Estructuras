/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package juegotorneo;

/**
 *
 * @author nicop
 */
public class ListaCircular {
       Nodo inicio;

    public ListaCircular() {
        this.inicio = null;
    }

    public void agregarAlFinal(Participante participante) {
        Nodo nuevoNodo = new Nodo(participante);
        if (inicio == null) {
            inicio = nuevoNodo;
            nuevoNodo.siguiente = inicio;
        } else {
            Nodo temp = inicio;
            while (temp.siguiente != inicio) {
                temp = temp.siguiente;
            }
            temp.siguiente = nuevoNodo;
            nuevoNodo.siguiente = inicio;
        }
    }

    public void imprimir() {
        if (inicio == null) {
            System.out.println("La lista circular está vacía.");
            return;
        }
        Nodo temp = inicio;
        do {
            System.out.print(temp.participante + " ");
            temp = temp.siguiente;
        } while (temp != inicio);
        System.out.println();
    }

    public void reorganizar() {
        inicio = inicio.siguiente;
    }
}
