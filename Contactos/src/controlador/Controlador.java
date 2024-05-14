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
    private ArrayList<Modelo> listaContactos;

    public Controlador() {
        listaContactos = new ArrayList<>();
    }

    public void agregarContacto(String nombre, String telefono, String correoElectronico) {
        Modelo nuevoContacto = new Modelo(nombre, telefono, correoElectronico);
        listaContactos.add(nuevoContacto);
    }

    public ArrayList<Modelo> obtenerListaContactos() {
        return listaContactos;
    }
}


