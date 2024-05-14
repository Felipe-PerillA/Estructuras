/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;
import modelo.Modelo;
import vista.Vista;

/**
 *
 * @author nicop
 */
public class Controlador {
     private Vista vistaConsola;
    private Modelo contrasenaCifrada;

    public Controlador() {
        vistaConsola = new Vista();
        ejecutarAplicacion();
    }

    private void ejecutarAplicacion() {
        String contrasenaOriginal = vistaConsola.solicitarContrasenaOriginal();
        contrasenaCifrada = new Modelo(contrasenaOriginal);
        String contrasenaEncriptada = contrasenaCifrada.getContrasenaEncriptada();
        vistaConsola.mostrarContrasenaEncriptada(contrasenaEncriptada);

        String contrasenaIngresada = vistaConsola.solicitarContrasenaEncriptada();
        String contrasenaDesencriptada = contrasenaCifrada.desencriptarContrasena(contrasenaIngresada);
        vistaConsola.mostrarContrasenaDesencriptada(contrasenaDesencriptada);
    }

    public static void main(String[] args) {
        new Controlador();
    }
}
