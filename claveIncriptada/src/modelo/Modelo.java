/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 *
 * @author nicop
 */
    public class Modelo {
    private static final Map<Character, Character> claveEncriptacion = new HashMap<>();
    private static final Map<Character, Character> claveDesencriptacion = new HashMap<>();

    static {
        claveEncriptacion.put('a', '@');
        claveEncriptacion.put('b', '#');
        claveEncriptacion.put('c', '$');
        claveEncriptacion.put('d', 's');
        claveEncriptacion.put('e', 'F');
        claveEncriptacion.put('f', 'x');
        claveEncriptacion.put('g', '?');
        claveEncriptacion.put('h', 'G');
        claveEncriptacion.put('i', 'Ñ');
        claveEncriptacion.put('j', 'y');
        claveEncriptacion.put('k', '2');
        claveEncriptacion.put('l', '&');
        claveEncriptacion.put('m', '6');
        claveEncriptacion.put('n', 'X');
        claveEncriptacion.put('ñ', 'L');
        claveEncriptacion.put('o', '-');
        claveEncriptacion.put('p', '.');
       
        

        // Invertir la clave de encriptación para obtener la clave de desencriptacion
        for (Map.Entry<Character, Character> entry : claveEncriptacion.entrySet()) {
            claveDesencriptacion.put(entry.getValue(), entry.getKey());
        }
    }

    private String contrasenaOriginal;
    private String contrasenaEncriptada;

    public Modelo(String contrasenaOriginal) {
        this.contrasenaOriginal = contrasenaOriginal;
        this.contrasenaEncriptada = encriptarContrasena(contrasenaOriginal);
    }

    public String getContrasenaOriginal() {
        return contrasenaOriginal;
    }

    public String getContrasenaEncriptada() {
        return contrasenaEncriptada;
    }

    private String encriptarContrasena(String contrasena) {
        Stack<Character> pila = new Stack<>();

        for (char c : contrasena.toCharArray()) {
            if (claveEncriptacion.containsKey(c)) {
                pila.push(claveEncriptacion.get(c));
            } else {
                pila.push(c);
            }
        }

        StringBuilder contrasenaEncriptada = new StringBuilder();
        while (!pila.isEmpty()) {
            contrasenaEncriptada.append(pila.pop());
        }

        return contrasenaEncriptada.toString();
    }

    public String desencriptarContrasena(String contrasenaEncriptada) {
        Stack<Character> pila = new Stack<>();

        for (char c : contrasenaEncriptada.toCharArray()) {
            if (claveDesencriptacion.containsKey(c)) {
                pila.push(claveDesencriptacion.get(c));
            } else {
                pila.push(c);
            }
        }

        StringBuilder contrasenaDesencriptada = new StringBuilder();
        while (!pila.isEmpty()) {
            contrasenaDesencriptada.append(pila.pop());
        }

        return contrasenaDesencriptada.toString();
    }
}
    


