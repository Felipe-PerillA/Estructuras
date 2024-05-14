/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestiontarease;

/**
 * Materia: Estructura de datos
 * @author juanFelipe
 */
public class ListaTareas {
 
    private Nodos inicio;

    public ListaTareas() {
        inicio = null;
    }

    public void agregarTarea(String tarea) {
        if (inicio == null) {
            inicio = new Nodos(tarea);
        } else {
            Nodos temp = inicio;
            while (temp.getSiguiente() != null) {
                temp = temp.getSiguiente();
            }
            temp.setSiguiente(new Nodos(tarea));
        }
        System.out.println("Tarea agregada correctamente.");
    }

    public void completarTarea(String tarea) {
        Nodos temp = inicio;
        while (temp != null) {
            if (temp.getTarea().equals(tarea)) {
                temp.setCompletada(true);
                System.out.println("Tarea completada correctamente.");
                return;
            }
            temp = temp.getSiguiente();
        }
        System.out.println("La tarea especificada no se encontró en la lista.");
    }

    public void listarTareas() {
        Nodos temp = inicio;
        System.out.println("----- Lista de tareas -----");
        while (temp != null) {
            System.out.println(temp.getTarea() + (temp.isCompletada() ? " - Completada" : " - Pendiente"));
            temp = temp.getSiguiente();
        }
    }

    public void eliminarTarea(String tarea) {
        if (inicio == null) {
            System.out.println("La lista de tareas está vacía.");
            return;
        }

        if (inicio.getTarea().equals(tarea)) {
            inicio = inicio.getSiguiente();
            System.out.println("Tarea eliminada correctamente.");
            return;
        }

        Nodos anterior = inicio;
        Nodos actual = inicio.getSiguiente();
        while (actual != null) {
            if (actual.getTarea().equals(tarea)) {
                anterior.setSiguiente(actual.getSiguiente());
                System.out.println("Tarea eliminada correctamente.");
                return;
            }
            anterior = actual;
            actual = actual.getSiguiente();
        }

        System.out.println("La tarea especificada no se encontró en la lista.");
    }
    //MetodocontarTareasPendientes
    public int contarTareasPendientes() {
        int contador = 0;
        Nodos temp = inicio;
        while (temp != null) {
            if (!temp.isCompletada()) {
                contador++;
            }
            temp = temp.getSiguiente();
        }
        return contador;
    }
    // Metodo RemoverDuplicads
    public void removerDuplicados() {
        Nodos actual = inicio;

        while (actual != null && actual.getSiguiente() != null) {
            if (actual.getTarea().equals(actual.getSiguiente().getTarea())) {
                actual.setSiguiente(actual.getSiguiente().getSiguiente());
            } else {
                actual = actual.getSiguiente();
            }
        }
    }
}


