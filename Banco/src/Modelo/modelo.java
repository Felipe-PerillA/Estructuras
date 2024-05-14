/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author juanFelipe
 */
public class modelo {
    // se declaran las variables
    private String NombreU;
    private String NumeroI;
    private int NumeroM;
    
    // constructor
    
    public modelo(String NombreU,String NumeroI,int NumeroM){
        this.NombreU=NombreU;
        this.NumeroI=NumeroI;
        this.NumeroM=NumeroM;
    }

    public String getNombreU() {
        return NombreU;
    }

    public void setNombreU(String NombreU) {
        this.NombreU = NombreU;
    }

    public String getNumeroI() {
        return NumeroI;
    }

    public void setNumeroI(String NumeroI) {
        this.NumeroI = NumeroI;
    }

    public int getNumeroM() {
        return NumeroM;
    }

    public void setNumeroM(int NumeroM) {
        this.NumeroM = NumeroM;
    }
    public void retirarDinero(int cantidad) {
        if (cantidad <= NumeroM) {
            NumeroM -= cantidad; // Restar la cantidad del saldo
            System.out.println("Se ha retirado $" + cantidad + " de su cuenta.");
        } else {
            System.out.println("Saldo insuficientes.");
        }
    
    }
    public void depositarDinero(int cantidad){
        if(cantidad <= NumeroM){
            NumeroM += cantidad;
            System.out.println("Se ha depositado $:"+cantidad+"a su cuenta");
        }
    }
}
