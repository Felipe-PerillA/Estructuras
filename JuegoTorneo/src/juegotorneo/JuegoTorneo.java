/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package juegotorneo;

/**
 *
 * @author nicop
 */
public class JuegoTorneo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Torneo torneo = new Torneo();
        torneo.agregarParticipantesDesdeInput();

        int numeroRondas = 5;
        torneo.simularTorneo(numeroRondas);
    }
}
    

