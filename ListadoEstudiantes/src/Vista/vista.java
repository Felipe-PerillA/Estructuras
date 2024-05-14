/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista;


import Controlador.controlador;
import Modelo.Evento;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author nicop
 */
public class vista {
   private controlador controlador;
   private Scanner scanner;

    public vista(controlador controlador) {
        this.controlador = controlador;
        this.scanner = new Scanner(System.in);
    }

    public void mostrarMenu() {
        System.out.println("Bienvenido a la red social");
        System.out.println("1. Agregar evento");
        System.out.println("2. Eliminar evento");
        System.out.println("3. Buscar eventos por tipo");
        System.out.println("4. Buscar eventos por usuario");
        System.out.println("5. Listar todos los eventos");
        System.out.println("6. Salir");
    }

    public void ejecutar() {
        int opcion;
        do {
            mostrarMenu();
            System.out.print("Ingrese una opcion: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); 
            switch (opcion) {
                case 1:
                    agregarEvento();
                    break;
                case 2:
                    eliminarEvento();
                    break;
                case 3:
                    buscarEventosPorTipo();
                    break;
                case 4:
                    buscarEventosPorUsuario();
                    break;
                case 5:
                    listarEventos();
                    break;
                case 6:
                    System.out.println("Hasta luego!");
                    break;
                default:
                    System.out.println("Opción inválida, intente de nuevo.");
            }
        } while (opcion != 6);
    }

    private void agregarEvento() {
        System.out.println("Ingrese los detalles del evento:");
        System.out.print("ID del evento: ");
        int idEvento = scanner.nextInt();
        scanner.nextLine(); 
        System.out.print("Tipo de evento: ");
        String tipo = scanner.nextLine();
        System.out.print("ID del usuario: ");
        int idUsuario = scanner.nextInt();
        scanner.nextLine(); 
        System.out.print("Fecha y hora (Año-Mes-Dia Hora:minutos:segundos): ");
        String fechaHora = scanner.nextLine();
        System.out.print("Contenido: ");
        String contenido = scanner.nextLine();
        controlador.agregarEvento(idEvento, tipo, idUsuario, fechaHora, contenido);
        System.out.println("Evento agregado correctamente.");
    }

    private void eliminarEvento() {
        System.out.print("Ingrese el ID del evento a eliminar: ");
        int idEvento = scanner.nextInt();
        scanner.nextLine(); 
        controlador.eliminarEvento(idEvento);
        System.out.println("Evento eliminado correctamente.");
    }

    private void buscarEventosPorTipo() {
        System.out.print("Ingrese el tipo de evento a buscar: ");
        String tipoEvento = scanner.nextLine();
        List<Evento> eventos = controlador.buscarEventosPorTipo(tipoEvento);
        if (eventos.isEmpty()) {
            System.out.println("No se encontraron eventos con el tipo especificado.");
        } else {
            System.out.println("Eventos encontrados:");
            for (Evento evento : eventos) {
            System.out.println("Su evento es:");    
                System.out.println(evento.toString());
            }
        }
    }

    private void buscarEventosPorUsuario() {
        System.out.print("Ingrese el ID del usuario para buscar eventos: ");
        int idUsuario = scanner.nextInt();
        scanner.nextLine(); 
        List<Evento> eventos = controlador.buscarEventosPorUsuario(idUsuario);
        if (eventos.isEmpty()) {
            System.out.println("No se encontraron eventos para el usuario especificado.");
        } else {
            System.out.println("Eventos encontrados:");
            for (Evento evento : eventos) {
                System.out.println(evento.toString());
            }
        }
    }

    private void listarEventos() {
        System.out.println("Listando todos los eventos:");
        List<Evento> eventos = controlador.listarEventos(null, 0);
        if (eventos.isEmpty()) {
            System.out.println("No hay eventos para mostrar.");
        } else {
            for (Evento evento : eventos) {
                System.out.println(evento.toString());
            }
        }
    }
}

