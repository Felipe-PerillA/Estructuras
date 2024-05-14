/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.HistorialNavegacion;
import vista.VistaHistorial;

/**
 *
 * @author nicop
 */
public class ControladorHistorial  implements ActionListener{
    private HistorialNavegacion historial;
    private VistaHistorial vista;
    
public ControladorHistorial(HistorialNavegacion historial,VistaHistorial vista){
    this.historial = historial;
    this.vista = vista;
    this.vista.JB_Siguiente.addActionListener(this);
    this.vista.JB_Anterior.addActionListener(this);
    this.vista.JB_Buscar.addActionListener(this);  
    }
public void Iniciar(){
    vista.setTitle("Histrial de Navegacion");
    vista.setLocationRelativeTo(null);
    
}
public void actionPerformed(ActionEvent e){
    
  }
}
