/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author nicop
 */
public class DoblementeEnlazada {
    //Declaración de variables
    private ModeloCompilador cabeza;
    private NodoPilaDeMemoria pilaDeMemoria;
    private NodoPilaDeVariables pilaDeVariables;
    //Metodo Constructor
    public DoblementeEnlazada {
        cabeza = null;
        pilaDeMemoria = new NodoPilaDeMemoria();
        pilaDeVariables = new NodoPilaDeVariables();
    }
    //Metodo para asignar memoria
    public void asignarMemoria() {
        ModeloCompilador nuevaVariable = new ModeloCompilador("variable_" + (cabeza == null ? 1 : cabeza.getNodoSiguiente().getIndice() + 1));
        agregarVariable(nuevaVariable);
        pilaDeMemoria.push(nuevaVariable);
        pilaDeVariables.push(nuevaVariable);
    }
    //Metodo para liberar memoria
    public void liberarMemoria() {
        if (!pilaDeMemoria.estaVacia()) {
            ModeloCompilador variable = pilaDeMemoria.pop();
            eliminarVariable(variable);
        }
    }
    //Metodo para agregar la variable
    private void agregarVariable(ModeloCompilador variable) {
        if (cabeza == null) {
            cabeza = variable;
        } else {
            ModeloCompilador actual = cabeza;
            while (actual.getNodoSiguiente() != null) {
                actual = actual.getNodoSiguiente();
            }
            actual.setNodoSiguiente(variable);
            variable.setNodoAnterior(actual);
        }
    }
    //Metodo para eliminar la variable
    private void eliminarVariable(ModeloCompilador variable) {
        if (cabeza == variable) {
            cabeza = variable.getNodoSiguiente();
            if (cabeza != null) {
                cabeza.setNodoAnterior(null);
            }
        } else {
            ModeloCompilador anterior = variable.getNodoAnterior();
            ModeloCompilador siguiente = variable.getNodoSiguiente();
            if (anterior != null) {
                anterior.setNodoSiguiente(siguiente);
            }
            if (siguiente != null) {
                siguiente.setNodoAnterior(anterior);
            }
        }
    }
    //Metodo para obtener variables
    public ModeloCompilador[] getVariables() {
        int count = 0;
        ModeloCompilador actual = cabeza;
        while (actual != null) {
            count++;
            actual = actual.getNodoSiguiente();
        }
        ModeloCompilador[] variables = new ModeloCompilador[count];
        actual = cabeza;
        for (int i = 0; i < count; i++) {
            variables[i] = actual;
            actual = actual.getNodoSiguiente();
        }
        return variables;
    }
    //Metodo para obtener variables
    public ModeloCompilador[] getVariablesEnPila() {
        int count = pilaDeVariables.size();
        ModeloCompilador[] variables = new ModeloCompilador[count];
        for (int i = 0; i < count; i++) {
            variables[i] = pilaDeVariables.pop();
        }
        for (int i = count - 1; i >= 0; i--) {
            pilaDeVariables.push(variables[i]);
        }
        return variables;
    }
    //Metodo para obtener variables en memoria
    public ModeloCompilador[] getVariablesEnMemoria() {
        int count = pilaDeMemoria.size();
        ModeloCompilador[] variables = new ModeloCompilador[count];
        for (int i = 0; i < count; i++) {
            variables[i] = pilaDeMemoria.pop();
        }
        for (int i = count - 1; i >= 0; i--) {
            pilaDeMemoria.push(variables[i]);
        }
        return variables;
    }
}

