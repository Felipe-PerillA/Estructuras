/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import Estudiante.Estudiante;
import java.util.ArrayList;
import java.util.List;
import vista.Vista;

/**
 *
 * @author juanFelipe
 */
public class Controlador {
    private List<Estudiante> estudiantes;
    private Vista vista;

    public Controlador() {
        this.estudiantes = new ArrayList<>();
        this.vista = new Vista();
    }

    public void agregarEstudiante(String nombre, int edad) {
        Estudiante nuevoEstudiante = new Estudiante(nombre, edad);
        estudiantes.add(nuevoEstudiante);
        vista.mostrarMensaje("Estudiante agregado correctamente.");
    }

    public void actualizarEstudiante(String nombreAnterior, String nuevoNombre, int nuevaEdad) {
        for (Estudiante estudiante : estudiantes) {
            if (estudiante.getNombre().equals(nombreAnterior)) {
                estudiante.setNombre(nuevoNombre);
                estudiante.setEdad(nuevaEdad);
                vista.mostrarMensaje("Estudiante actualizado correctamente.");
                return;
            }
        }
        vista.mostrarMensaje("Estudiante no encontrado.");
    }

    public void eliminarEstudiante(String nombre) {
        for (Estudiante estudiante : estudiantes) {
            if (estudiante.getNombre().equals(nombre)) {
                estudiantes.remove(estudiante);
                vista.mostrarMensaje("Estudiante eliminado correctamente.");
                return;
            }
        }
        vista.mostrarMensaje("Estudiante no encontrado.");
    }

    public void verEstudiantes() {
        vista.mostrarEstudiantes(estudiantes);
    }
}


