/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package paginaweb;

import controlador.ControladorHistorial;
import modelo.HistorialNavegacion;
import vista.VistaHistorial;

/**
 *
 * @author nicop
 */
public class PaginaWeb {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        HistorialNavegacion Histori = new HistorialNavegacion();
        VistaHistorial vista = new VistaHistorial();
        ControladorHistorial cont = new ControladorHistorial(Histori, vista);
        cont.Iniciar();
    }
    
}
