/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import modelo.Modelo;
import vista.Vista;

/**
 *
 * @author nicop
 */
public class Controlador {
    private Vista vista;

    public Controlador() {
        vista = new Vista();
        manejarEventos();
    }

    private void manejarEventos() {
        String expresion = vista.obtenerExpresion();
        Modelo modelo = new Modelo(expresion);
        double resultado = modelo.evaluar();
        vista.mostrarResultado(resultado);
    }
        
}


