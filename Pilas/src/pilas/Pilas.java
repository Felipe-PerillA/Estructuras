/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pilas;

import controlador.Controlador;
import modelo.Modelo;
import vista.Vista;

/**
 *
 * @author nicop
 */
public class Pilas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Modelo modelo = new Modelo();
        Vista vista = new Vista();
        Controlador controlador = new Controlador(modelo, vista);

        String cadena = vista.solicitarCadena();
        controlador.verificarBalance(cadena);
    }
}
    

