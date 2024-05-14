/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.modelo;
import Vista.vista;

/**
 *
 * @author  juanFelipe
 */
public class controlador {
    private vista vista;
    private modelo modelo;
    
    public controlador(vista vista){
        this.vista = vista;
    }
    public void iniciar (){
        boolean salir = false;
        while (!salir){
            int opcion = vista.mostrarMenuYobtenerOpcion();
            switch (opcion){
                case 1:
                    this.modelo = vista.metodoParaObtenerdatos();
                    vista.mostrarMensaje("Su cuenta fue Creada.");
                    break;
                case 2:
                    this.vista.mostrarDatos(modelo);
                    break;
                case 3:
                    salir = true;
                    vista.mostrarMensaje("Saliendo...");
                    break;
                default:
                    vista.mostrarMensaje("Opcion Invalida. Intente de nuevo.");
                    
                
                
            }
        }
    }
    
}
