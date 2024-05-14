/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Evento;
import Modelo.SecuenciaEventos;
import java.util.List;



/**
 *
 * @author nicop
 */
   public class controlador {
    private SecuenciaEventos secuenciaEventos;

    public controlador() {
        this.secuenciaEventos = new SecuenciaEventos();
    }

    public void agregarEvento(int idEvento, String tipo, int idUsuario, String fechaHora, String contenido) {
        Evento evento = new Evento(idEvento, tipo, idUsuario, fechaHora, contenido);
        secuenciaEventos.agregarEvento(evento);
    }

    public void eliminarEvento(int idEvento) {
        secuenciaEventos.eliminarEvento(idEvento);
    }

    public List<Evento> buscarEventosPorTipo(String tipoEvento) {
        return secuenciaEventos.buscarEventosPorTipo(tipoEvento);
    }

    public List<Evento> buscarEventosPorUsuario(int idUsuario) {
        return secuenciaEventos.buscarEventosPorUsuario(idUsuario);
    }

    public List<Evento> listarEventos(String tipoEvento, int idUsuario) {
        return secuenciaEventos.listarEventos(tipoEvento, idUsuario);
    }
   }



