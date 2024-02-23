/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Arbol_Binario_Busqueda;

/**
 *
 * @author 52667
 */

//Aqui va la logica ( comportamiento y metodo(funcionalidad))
public class ArbolBinario {
    NodoArbol raiz;
    
    public ArbolBinario(){
       raiz=null; 
    }
    
    //Metodo para insertar un nodo en el arbol 
    public void agregarNodo(int d, String nom){
        NodoArbol nuevo = new NodoArbol(d, nom);
        
        if(raiz ==null){
            raiz=nuevo;
        }else{
            NodoArbol auxiliar = raiz;
            NodoArbol padre;
            
            while(true){
                padre=auxiliar;
                //esto es para que si el nodo padre es menor al nodo nuevo que se inserte a la izquierda
                if(d<auxiliar.dato){
                   auxiliar=auxiliar.hijoIzquierdo;
                   if(auxiliar==null){
                       padre.hijoIzquierdo = nuevo;
                       //el return se puso para finalizar el metodo 
                       return;
                   }  
                }else{
                    auxiliar =auxiliar.hijoDerecho;
                    if(auxiliar==null){
                        padre.hijoDerecho = nuevo;
                        return;
                    }
                }
            }
        }
    }
    
    //Metodo para saber cuando el Arbol esta vacio
    public boolean estaVacio(){
        return raiz==null;
    }
    
    //Metodo para recorrer el Arbol inOrden
    //r es raiz
    public void inOrden(NodoArbol r){
        
        if(r!=null){
            inOrden(r.hijoIzquierdo);
            System.out.println(r.dato);
            inOrden(r.hijoDerecho);
        }
    }
}
