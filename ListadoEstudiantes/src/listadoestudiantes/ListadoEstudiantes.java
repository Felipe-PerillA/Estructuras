/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package listadoestudiantes;

import Controlador.controlador;
import Vista.vista;






/**
 *
 * @author nicop
 */
public class ListadoEstudiantes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       controlador Controlador = new controlador();
        vista vista = new vista(Controlador);
        vista.ejecutar();
    }
}
    

