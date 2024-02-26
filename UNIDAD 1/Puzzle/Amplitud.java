/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Puzzle;
import Puzzle.Nodo;
import java.util.ArrayList;
import java.util.List;
import java.util.HashSet;
import java.util.Set;
import java.util.LinkedList;
import java.util.Queue;

public class Amplitud {

    //Base del juego
    String numero;
    Nodo nodo;
    int contador=1;
    // Cola para almacenar nodos hijo
    Queue<Nodo> colaHijos = new LinkedList<>();
    
     Set<String> estadosVisitados = new HashSet<>();
 //////////////////////////////////////////////////////////
       public void GenerarSucesores(Nodo nodo, String Base) {
     
    colaHijos.add(nodo );
  System.out.println("Fuera del ciclo");
    while (!colaHijos.isEmpty()){
        
        numero = nodo.getNumero();
        //nodo=nodo;
         int indice = numero.indexOf('0');
          int fila = indice / 3;
          int columna = indice % 3;
     
        System.out.println("Numero de Nodo="+nodo.getNumero());
    if (fila > 0) {
        String nuevoNumero = intercambiarCaracteres(numero, indice, indice - 3);
        Nodo sucesorArriba = new Nodo(nuevoNumero, nodo );
          agregarSiNoVisitado(estadosVisitados,  sucesorArriba);
    }

    if (fila < 2) {
        String nuevoNumero = intercambiarCaracteres(numero, indice, indice + 3);
        Nodo sucesorAbajo = new Nodo(nuevoNumero, nodo );
        agregarSiNoVisitado(estadosVisitados,  sucesorAbajo);
    }

    if (columna > 0) {
        String nuevoNumero = intercambiarCaracteres(numero, indice, indice - 1);
        Nodo sucesorIzquierda = new Nodo(nuevoNumero, nodo );
        agregarSiNoVisitado(estadosVisitados,  sucesorIzquierda);
    }

    if (columna < 2) {
        String nuevoNumero = intercambiarCaracteres(numero, indice, indice + 1);
        Nodo sucesorDerecha = new Nodo(nuevoNumero, nodo );
         agregarSiNoVisitado(estadosVisitados,  sucesorDerecha);
    }

if(esObjetivo(Base)) {
                System.out.println("¡Encontrado el nodo objetivo!");
                contador--;
                System.out.println("Numero de Nodos Recorridos:"+contador);
                System.out.println("Numero de Nodos que quedaron en la cola:"+colaHijos.size());
                break;
               }
           contador++;
   nodo = colaHijos.poll();
}
    
     }
private String intercambiarCaracteres(String s, int i, int j) {
    char[] chars = s.toCharArray();
    char temp = chars[i];
    chars[i] = chars[j];
    chars[j] = temp;
    return new String(chars);
}

     //////////////////////////////////////////////////////
    public boolean esObjetivo(String Base) {
       
        if(Base.equals(numero))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
  
    private void agregarSiNoVisitado(Set<String> estadosVisitados, Nodo nodo) {
    if (!estadosVisitados.contains(nodo.getNumero())) {
        colaHijos.add(nodo);
        estadosVisitados.add(nodo.getNumero());
    }
}
    
}
