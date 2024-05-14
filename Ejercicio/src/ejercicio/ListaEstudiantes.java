/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio;

/**
 *
 * @author nicop
 */
public class ListaEstudiantes {
    Nodo inicio;
    Nodo fin;
    public Estudiante estudiante;
    public Estudiante Estudiante;
    private int edad;

public ListaEstudiantes(){
    inicio = null;
    fin = null;
    
}  
public void agregarAlInicio(String nombre,int estudiante){
    Estudiante = Estudiante = new Estudiante (nombre,edad);
    Nodo nuevo = new  Nodo(estudiante);
    if (inicio == null){
        inicio = nuevo;
        fin = nuevo;
    }else{
        nuevo.siguiente = inicio;
        inicio.anterior = nuevo;
        inicio = nuevo;
        
    }   
                
    }
public void agregarAlFinal(String nombre, int edad){
    Estudiante = estudiante = new Estudiante (nombre,edad);
    Nodo nuevo = new Nodo(estudiante);
    if(inicio == null){
       inicio = nuevo;
       fin = nuevo;
    }else{
        nuevo.anterior = fin;
        fin.siguiente = nuevo;
        fin =nuevo; 
    }
    
    }
public void eliminarAlInicio(){
    if (inicio != null ){
        inicio = inicio.siguiente;
        if(inicio != null){
        inicio.anterior = null;
        }else{
            fin = null;
        }
    } 
}
public void eliminarAlFinal(){
    if (fin != null){}
    fin = fin.anterior;
    if (fin != null){
        fin.siguiente = null;
    }else{
        inicio = null;
    }
    
}
public void MostrarEstudiantes (){
    Nodo actual =inicio;
    while (actual != null){
        System.out.println("Nombre:" + actual.getEstudiante().nombre + ",Edad "+ actual.getEstudiante().edad);
        actual = actual.siguiente;
    
        }
    }    

    void agregarAlInicio(Estudiante estudiante) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    void agregarAlFinal(Estudiante estudiante) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}    


    
                
        
    

  

            
    

    


