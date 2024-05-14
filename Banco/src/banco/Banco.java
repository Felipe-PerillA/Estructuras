/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package banco;

import Controlador.controlador;
import Vista.vista;

/**
 *
 * @author juanFelipe
 */
public class Banco {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        vista vista = new vista();
        controlador controlador = new controlador(vista);
        controlador.iniciar();
            
        
        
    }
    
}
