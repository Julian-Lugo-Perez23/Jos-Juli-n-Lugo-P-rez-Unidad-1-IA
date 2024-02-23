/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Arbol_Binario_Busqueda;

/**
 *
 * @author 52667
 */
public class NodoArbol {
    int dato;
    String nombre;
    //Punteros
    NodoArbol hijoIzquierdo, hijoDerecho;
    
    public NodoArbol (int dato, String nom){
        this.dato = dato;
        this.nombre = nom;
        //Los hijos son null porque no apuntan a nada
        this.hijoDerecho = null;
        this.hijoIzquierdo =  null;
    }
    
    public String toString(){
        return nombre + " Su dato es" + dato;
    }
}
