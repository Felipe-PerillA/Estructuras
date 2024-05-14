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
public class HistorialNavegacion {
    private Stack<paginaWeb> haciaAtras = new Stack<paginaWeb>();
    private Stack<paginaWeb> haciaAdelante = new Stack<paginaWeb>();
    private paginaWeb paginaActual;
 
    
    public void visitarPagina(paginaWeb pagina ){
    haciaAtras.push(paginaActual);
    haciaAdelante.clear();
    paginaActual = pagina;
    }
    public void Adelante (){
        if (!haciaAdelante.isEmpty()){
            haciaAtras.push(paginaActual);
            paginaActual = haciaAdelante.pop();
        }
    }
    public void Retroceder (){
        if(!haciaAtras.isEmpty()){
            haciaAtras.push(paginaActual);
            paginaActual = haciaAtras.pop();
        }
        
    } 
    public paginaWeb getpaginaActual(){
        if(!haciaAtras.isEmpty()){
            return haciaAtras.peek();
        }else if (!haciaAdelante.isEmpty()){
            return haciaAdelante.peek();
        }else{
        return null;
        
        }
    }
}


