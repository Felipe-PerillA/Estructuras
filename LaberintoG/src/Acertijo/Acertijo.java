/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Acertijo;

/**
 *
 * @author juanFelipe
 */
public class Acertijo {
    private String pregunta;
    private String respuesta;
   

    public Acertijo(String pregunta, String respuesta) {
        this.pregunta = pregunta;
        this.respuesta = respuesta;
    }

    public String getpregunta() {
        return pregunta;
    }

    public boolean verificarRespuesta(String respuestaUsuario) {
        return respuesta.equalsIgnoreCase(respuestaUsuario);
    }
}


