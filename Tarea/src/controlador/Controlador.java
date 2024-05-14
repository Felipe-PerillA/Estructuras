/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.util.ArrayList;
import modelo.Modelo;

/**
 *
 * @author nicop
 */
public class Controlador {
    private ArrayList<Modelo> listaTareas;

    public Controlador() {
        listaTareas = new ArrayList<>();
    }

    public void agregarTarea(String descripcion) {
        Modelo nuevaTarea = new Modelo(descripcion);
        listaTareas.add(nuevaTarea);
    }

    public ArrayList<Modelo> obtenerListaTareas() {
        return listaTareas;
    }

    public void marcarComoCompletada(int indice) {
        if (indice >= 0 && indice < listaTareas.size()) {
                Modelo tarea = listaTareas.get(indice);
            tarea.setCompletada(true);
        }
    } 
}
