/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ed;
import java.util.Scanner;
/*
* Materia: Estructuras de Datos
* Autor: Juan Felipe 
* Docente: Viviana
* Fecha: 8/02/2024
* Descripcion: Crear una matriz de 5 filas y n columnas (se pide al usuario). 
  Rellenarlo con números aleatorios entre 0 y 10
*/

public class ED {
 
    
    public static void main(String[] args) {
         
        Scanner sn=new Scanner(System.in);
         
        System.out.println("Escriba el numero de columnas que desea");
        int columnas=sn.nextInt();
         
        int matriz[][]=new int[5][columnas];
         
        for(int n =0;n<matriz.length;n++){
            for(int i=0;i<matriz[0].length;i++){
                matriz[n][i]=generaNumAleatorio(0,10);
                System.out.print(matriz[n][i]+" ");
            }
            System.out.println("");
             
        }
         
    }
     
    public static int generaNumAleatorio(int minimo,int maximo){
         
        return (int)Math.floor(Math.random()*(minimo-(maximo+1))+(maximo+1));
         
    }
     
}
    
    

