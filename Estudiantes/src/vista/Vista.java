/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

import Estudiante.Estudiante;
import java.util.List;

/**
 *
 * @author juanFelipe
 */
public class Vista {
   public void mostrarEstudiantes(List<Estudiante> estudiantes) {
       System.out.println("Lista de Estudiantes");
       for (Estudiante estudiante: estudiantes){
           System.out.println("Nombre"+estudiante.getNombre()+",Edad"+ estudiante.getEdad());
           
       }
       
   }
          public void  mostrarMensaje(String mensaje){
              System.out.println(mensaje);
          }
}
