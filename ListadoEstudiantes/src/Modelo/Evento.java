/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author nicop
 */
public class Evento {
        private int idEvento;
    private String tipo;
    private int idUsuario;
    private String fechaHora;
    private String contenido;

    public Evento(int idEvento, String tipo, int idUsuario, String fechaHora, String contenido) {
        this.idEvento = idEvento;
        this.tipo = tipo;
        this.idUsuario = idUsuario;
        this.fechaHora = fechaHora;
        this.contenido = contenido;
    }

    public int getIdEvento() {
        return idEvento;
    }

    public void setIdEvento(int idEvento) {
        this.idEvento = idEvento;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getFechaHora() {
        return fechaHora;
    }

    public void setFechaHora(String fechaHora) {
        this.fechaHora = fechaHora;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }
    public String toString() {
        return "Evento{" +
                "idEvento=" + idEvento +
                ", tipo='" + tipo + '\'' +
                ", idUsuario=" + idUsuario +
                ", fechaHora='" + fechaHora + '\'' +
                ", contenido='" + contenido + '\'' +
                '}';
    }
}



