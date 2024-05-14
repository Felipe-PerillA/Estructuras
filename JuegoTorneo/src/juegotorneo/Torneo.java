/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package juegotorneo;

import java.util.Scanner;

/**
 *
 * @author nicop
 */
public class Torneo {
       ListaCircular listaParticipantes;
    int rondaActual;

    public Torneo() {
        this.listaParticipantes = new ListaCircular();
        this.rondaActual = 1;
    }

    public void agregarParticipante(Participante participante) {
        listaParticipantes.agregarAlFinal(participante);
    }

    public void jugarRonda() {
        System.out.println("Ronda " + rondaActual + ":");
        Nodo temp = listaParticipantes.inicio;
        do {
            System.out.println(temp.participante + " vs " + temp.siguiente.participante);
            temp = temp.siguiente.siguiente;
        } while (temp != listaParticipantes.inicio);
        System.out.println();
        listaParticipantes.reorganizar();
        rondaActual++;
    }

    public void agregarParticipantesDesdeInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bienvenido al Club de la pelea");
        System.out.println("Ingrese los nombres de los participantes que se desean participar (Escribe 'listo' para ver los combates):");
        String nombre;
        while (true) {
            System.out.print("Nombre del participante: ");
            nombre = scanner.nextLine();
            if (nombre.equalsIgnoreCase("listo")) {
                break;
            }
            agregarParticipante(new Participante(nombre));
        }
        scanner.close();
    }

    public void simularTorneo(int numeroRondas) {
        for (int i = 1; i < numeroRondas; i++) {
            jugarRonda();
        }
    }
}

