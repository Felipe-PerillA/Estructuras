/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.util.ArrayList;
import java.util.List;





/**
 *
 * @author nicop
 */
    public class SecuenciaEventos {
     private NodoEvento cabeza;
    private NodoEvento cola;

    public void agregarEvento(Evento evento) {
        NodoEvento nuevoNodo = new NodoEvento(evento);
        if (cabeza == null) {
            cabeza = nuevoNodo;
            cola = nuevoNodo;
        } else {
            NodoEvento actual = cabeza;
            while (actual != null && actual.evento.getFechaHora().compareTo(evento.getFechaHora()) < 0) {
                actual = actual.siguiente;
            }

            if (actual == cabeza) {
                nuevoNodo.siguiente = cabeza;
                cabeza.anterior = nuevoNodo;
                cabeza = nuevoNodo;
            } else if (actual == null) {
                cola.siguiente = nuevoNodo;
                nuevoNodo.anterior = cola;
                cola = nuevoNodo;
            } else {
                nuevoNodo.siguiente = actual;
                nuevoNodo.anterior = actual.anterior;
                actual.anterior.siguiente = nuevoNodo;
                actual.anterior = nuevoNodo;
            }
        }
    }

    public void eliminarEvento(int idEvento) {
        NodoEvento actual = cabeza;
        while (actual != null) {
            if (actual.evento.getIdEvento() == idEvento) {
                if (actual.anterior != null) {
                    actual.anterior.siguiente = actual.siguiente;
                } else {
                    cabeza = actual.siguiente;
                }

                if (actual.siguiente != null) {
                    actual.siguiente.anterior = actual.anterior;
                } else {
                    cola = actual.anterior;
                }

                return;
            }
            actual = actual.siguiente;
        }
    }

    public List<Evento> buscarEventosPorTipo(String tipoEvento) {
        List<Evento> eventos = new ArrayList<>();
        NodoEvento actual = cabeza;
        while (actual != null) {
            if (actual.evento.getTipo().equals(tipoEvento)) {
                eventos.add(actual.evento);
            }
            actual = actual.siguiente;
        }
        return eventos;
    }

    public List<Evento> buscarEventosPorUsuario(int idUsuario) {
        List<Evento> eventos = new ArrayList<>();
        NodoEvento actual = cabeza;
        while (actual != null) {
            if (actual.evento.getIdUsuario() == idUsuario) {
                eventos.add(actual.evento);
            }
            actual = actual.siguiente;
        }
        return eventos;
    }

    public List<Evento> listarEventos(String tipoEvento, int idUsuario) {
        List<Evento> eventos = new ArrayList<>();
        NodoEvento actual = cabeza;
        while (actual != null) {
            if ((tipoEvento == null || actual.evento.getTipo().equals(tipoEvento)) &&
                (idUsuario == 0 || actual.evento.getIdUsuario() == idUsuario)) {
                eventos.add(actual.evento);
            }
            actual = actual.siguiente;
        }
        return eventos;
    }

    private static class NodoEvento {
        private Evento evento;
        public NodoEvento siguiente;
        public NodoEvento anterior;

        public NodoEvento(Evento evento) {
            this.evento = evento;
        }
    }
}





