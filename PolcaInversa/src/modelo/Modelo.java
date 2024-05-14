/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.util.Stack;

/**
 *
 * @author nicop
 */
public class Modelo {
       private String expresion;

    public Modelo(String expresion) {
        this.expresion = expresion;
    }

    public double evaluar() {
        Stack<Double> pila = new Stack<>();
        String[] tokens = expresion.split(" ");

        for (String token : tokens) {
            if (esOperando(token)) {
                pila.push(Double.parseDouble(token));
            } else {
                if (pila.size() < 2) {
                    throw new IllegalArgumentException("Expresión inválida");
                }
                double operando2 = pila.pop();
                double operando1 = pila.pop();
                double resultado = realizarOperacion(token, operando1, operando2);
                pila.push(resultado);
            }
        }

        if (pila.size() != 1) {
            throw new IllegalArgumentException("Expresión inválida");
        }

        return pila.pop();
    }

    private boolean esOperando(String token) {
        return token.matches("\\d+(\\.\\d+)?");
    }

    private double realizarOperacion(String operador, double operando1, double operando2) {
        switch (operador) {
            case "+":
                return operando1 + operando2;
            case "-":
                return operando1 - operando2;
            case "*":
                return operando1 * operando2;
            case "/":
                return operando1 / operando2;
            default:
                throw new IllegalArgumentException("Operador inválido: " + operador);
        }
    }
}
