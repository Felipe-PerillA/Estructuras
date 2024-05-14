/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista;

import Modelo.modelo;
import java.util.Scanner;

/**
 *
 * @author juanFelipe
 */
public class vista {
    // se declara la variable leer
    private Scanner leer;
    
public vista(){
    this.leer=new Scanner (System.in);
    // metodo para mostrar el menu
    }
    public int mostrarMenuYobtenerOpcion(){
    System.out.println("\n Gestion de banco Avv pradas");
    System.out.println("1. Crear tu cuenta de banco Avv pradas");
    System.out.println("2. Ingresar a la cuenta");
    System.out.println("3. Salir");
    System.out.println("Porfavor Selecione una opcion:");
    int opcion = leer.nextInt();
    leer.nextLine(); 
    return opcion;
    
   }
// metodo para obtener los datos
    public modelo metodoParaObtenerdatos(){
        System.out.print("Digite su Nombre Completo");
        String NombreU = leer.nextLine();
        System.out.print("Digite su Numero de Documento");
        String NumeroI = leer.nextLine();
        System.out.print("Monto con el cual desea Iniciar");
        int NumeroM = leer.nextInt();
        leer.nextLine();
        return new  modelo (NombreU, NumeroI, NumeroM);
    }
// metodo para mostrar datos y monto 
        public void mostrarDatos(modelo modelo){
            if(modelo == null){
                System.out.println("No hay cuentas registradas");
            } else {
                System.out.println("\n Informacion del Usuario");
                System.out.println("Su Nombre es: "+ modelo.getNombreU());
                System.out.println("No-Documento: "+ modelo.getNumeroI());
                System.out.println("Su monto es: "+ modelo.getNumeroM());
                System.out.println("Que desea?");
                System.out.println("1.Desea retirar?");
                System.out.println("2. Desea depositar?");
                int opcion = leer.nextInt();
            if (opcion == 1) {
                System.out.print("Cuanto desea retirar?: ");
                int cantidadRetiro = leer.nextInt();
                modelo.retirarDinero(cantidadRetiro); // Llama al método para retirar dinero
            } else {
                System.out.println("Cuanto desea depositar?: ");
                int cantidadDeposito = leer.nextInt();
                modelo.depositarDinero(cantidadDeposito);
                
            }
        }
    }
        public void mostrarMensaje(String mensaje){
            System.out.println(mensaje);
        }    
}
