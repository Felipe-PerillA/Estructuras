/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

/**
 *
 * @author nicop
 */
public class ControladorCompilador {
   
    //Declaración de variables
    private DoblementeEnlazada modelo;
    private PantallaDGestorDeMemoria vista;
    
    //Metodo Constructor
    public ControladorCompilador(PantallaDGestorDeMemoria vista) {
        this.vista = vista;
        modelo = new DoblementeEnlazada();
    }
    
    //Metodo para asignar memoria
    public void asignarMemoria() {
        modelo.asignarMemoria();
        vista.actualizarPanelDeInformacion();
    }
    //Metodo para liberar memoria
    public void liberarMemoria() {
        modelo.liberarMemoria();
        vista.actualizarPanelDeInformacion();
    }
    //Metodo para obtener el modelo
    public DoblementeEnlazada getModelo() {
        return modelo;
    }
}


