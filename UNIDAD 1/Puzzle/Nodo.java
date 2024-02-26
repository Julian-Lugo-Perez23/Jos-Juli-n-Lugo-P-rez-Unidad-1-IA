/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Puzzle;

/**
 *
 * @author 52667
 */
public class Nodo {
    
    String Numero;
    Nodo Padre;
    public Nodo(String Numero, Nodo padre){
        this.Numero = Numero;
        this.Padre = padre;
              
    };

    public String getNumero() {
        return Numero;
    }

    public void setNumero(String Numero) {
        this.Numero = Numero;
    }

    public Nodo getPadre() {
        return Padre;
    }

    public void setPadre(Nodo Padre) {
        this.Padre = Padre;
    }
    
    
}
