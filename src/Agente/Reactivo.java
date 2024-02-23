/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Agente;

import java.util.Random;
/**
 *
 * @author 52667
 */
public class Reactivo {
 
 int fila = -1;
 int columna = -1;
 Juego Juegomatriz = new Juego();
 
 /*public Reactivo(){
    this.raiz = ;
}*/
 
 
 //Aqui estoy econtrando el cero para de ahi usar la i y la j que me da de coordenada donde se ubica el cero para moverlos en el metodo Mover
public void EncontrarCero() {
    String[][] matriz = Juegomatriz.matrizAleatoria;
    
    boolean encontrado = false;
    /*int fila = -1;
    int columna = -1;
*/

    for (int i = 0; i < matriz.length && !encontrado; i++) {
        for (int j = 0; j < matriz[i].length && !encontrado; j++) {
            if (matriz[i][j].equals("0")) {
                encontrado = true;
                fila = i;
                columna = j;
            }
        }
    }

    
    if (encontrado) {
        System.out.println("0 encontrado en fila " + fila + ", columna " + columna);
    } else {
        System.out.println("0 no encontrado en la matriz");
    }
    
    //Posiciones donde se puede mover la pieza dependiendo donde se encuentre el 0
}
 
 public void Mover(){
 
     String[][] matriz = Juegomatriz.matrizAleatoria;
     String auxiliar;    
    Random random=new Random();
     //este ciclo se hara hasta que la los 2 arrayList sean iguales
     while(!Juegomatriz.matriz.equals(matriz)){
     //Recorrar que agarre los movimientos de izquierda a derecha empezando de la primera fila y teminando y siguiendo con la segunda y asi hasta terminar
      System.out.println("fila="+fila+ "columna="+columna);
     if(fila == 0 && columna==0){
            System.out.println("2 movimientos");
            if(!Juegomatriz.matriz.equals(matriz)){
             //Auxiliar
              auxiliar = matriz[0][1];        
             // alli mover los valores en la matriz
             //Modificar
             matriz[0][1]=matriz[0][0];
             matriz[0][0]=auxiliar;
             //Actualizar fila y columna despues del movimiento
             //fila = 0;
             //columna =1;
            }
            if(!Juegomatriz.matriz.equals(matriz)){
             //Auxiliar
              auxiliar = matriz[1][0];        
             // alli mover los valores en la matriz
             //Modificar
             matriz[1][0]=matriz[0][0];
             matriz[0][0]=auxiliar;
             //fila = 1;
             //columna =0;
            
            }
            if(!Juegomatriz.matriz.equals(matriz))
            fila = 0;
             columna =1;
     }
     if(fila == 0 && columna==1){
          System.out.println("3 movimientos");
          
          if(!Juegomatriz.matriz.equals(matriz)){
             //Auxiliar
              auxiliar = matriz[0][0];        
             // alli mover los valores en la matriz
             //Modificar
             matriz[0][0]=matriz[0][1];
             matriz[0][1]=auxiliar;
             //fila = 0;
             //columna =0;
          }
           if(!Juegomatriz.matriz.equals(matriz)){
             //Auxiliar
              auxiliar = matriz[0][2];        
             // alli mover los valores en la matriz
             //Modificar
             matriz[0][2]=matriz[0][1];
             matriz[0][1]=auxiliar;
             //fila = 0;
             //columna =2;
           }
           
           if(!Juegomatriz.matriz.equals(matriz)){
             //Auxiliar
              auxiliar = matriz[1][1];        
             // alli mover los valores en la matriz
             //Modificar
             matriz[1][1]=matriz[0][1];
             matriz[0][1]=auxiliar;
            // fila = 1;
            //columna =1;
           }
           if(!Juegomatriz.matriz.equals(matriz))
           fila = 0;
             columna =2;
     }
     
     if(fila == 0 && columna==2){
          System.out.println("2 movimientos");
         if(!Juegomatriz.matriz.equals(matriz)){
             //Auxiliar
              auxiliar = matriz[0][1];        
             // alli mover los valores en la matriz
             //Modificar
             matriz[0][1]=matriz[0][2];
             matriz[0][2]=auxiliar;
             //fila = 0;
             //columna =1;
         }
             if(!Juegomatriz.matriz.equals(matriz)){
             //Auxiliar
             auxiliar = matriz[1][2];        
             // alli mover los valores en la matriz
             //Modificar
             matriz[1][2]=matriz[0][2];
             matriz[0][2]=auxiliar;
             //fila = 1;
             //columna =2;
             
     }
             if(!Juegomatriz.matriz.equals(matriz))
             fila = 1;
             columna =0;
     }
     if(fila == 1 && columna==0){
          System.out.println("3 movimientos");
          if(!Juegomatriz.matriz.equals(matriz)){
             //Auxiliar
              auxiliar = matriz[0][0];        
             // alli mover los valores en la matriz
             //Modificar
             matriz[0][0]=matriz[1][0];
             matriz[1][0]=auxiliar;
             //fila = 0;
             //columna =0;
          }
           if(!Juegomatriz.matriz.equals(matriz)){
             //Auxiliar
              auxiliar = matriz[1][1];        
             // alli mover los valores en la matriz
             //Modificar
             matriz[1][1]=matriz[1][0];
             matriz[1][0]=auxiliar;
             //fila = 1;
             //columna =1;
           }
              if(!Juegomatriz.matriz.equals(matriz)){
             //Auxiliar
              auxiliar = matriz[2][0];        
             // alli mover los valores en la matriz
             //Modificar
             matriz[2][0]=matriz[1][0];
             matriz[1][0]=auxiliar;
            // fila = 2;
            //columna =0;
              }
              if(!Juegomatriz.matriz.equals(matriz))
              fila = 1;
             columna =1;
     
     }
     if(fila == 1 && columna==1){
          System.out.println("4 movimientos");
          if(!Juegomatriz.matriz.equals(matriz)){
             //Auxiliar
              auxiliar = matriz[0][1];        
             // alli mover los valores en la matriz
             //Modificar
             matriz[0][1]=matriz[1][1];
             matriz[1][1]=auxiliar;
             //fila = 0;
             //columna =1;
          }
              if(!Juegomatriz.matriz.equals(matriz)){
              auxiliar = matriz[1][0];
             matriz[1][0]=matriz[1][1]; 
             matriz[1][1]=auxiliar;
             //fila = 1;
             //columna =0;
              }
              if(!Juegomatriz.matriz.equals(matriz)){
              auxiliar = matriz[1][2];
             matriz[1][2]=matriz[1][1];  
             matriz[1][1]=auxiliar;
             //fila = 1;
             //columna =2;
              }
              if(!Juegomatriz.matriz.equals(matriz)){
               auxiliar = matriz[2][1];
               matriz[2][1]=matriz[1][1]; 
               matriz[1][1]=auxiliar;
               
            // fila = 2;
             //columna =1;
              }
              if(!Juegomatriz.matriz.equals(matriz))
              fila = 1;
             columna =2;
     }
     if(fila == 1 && columna==2){
          System.out.println("3 movimientos");
          if(!Juegomatriz.matriz.equals(matriz)){
             //Auxiliar
              auxiliar = matriz[0][2];        
             // alli mover los valores en la matriz
             //Modificar
             matriz[0][2]=matriz[1][2];
             matriz[1][2]=auxiliar;
             //fila = 0;
             //columna =2;
          }
              if(!Juegomatriz.matriz.equals(matriz)){
             //Auxiliar
              auxiliar = matriz[1][1];        
             // alli mover los valores en la matriz
             //Modificar
             matriz[1][1]=matriz[1][2];
             matriz[1][2]=auxiliar;
             //fila = 1;
             //columna =1;
              }
              if(!Juegomatriz.matriz.equals(matriz)){
             //Auxiliar
              auxiliar = matriz[2][2];        
             // alli mover los valores en la matriz
             //Modificar
             matriz[2][2]=matriz[1][2];
             matriz[1][2]=auxiliar;
             //fila = 2;
             //columna =2;
              }
              if(!Juegomatriz.matriz.equals(matriz))
              fila = 2;
             columna =0;
     }
     if(fila == 2 && columna==0){
            System.out.println("2 movimientos");
          if(!Juegomatriz.matriz.equals(matriz)){
             //Auxiliar
              auxiliar = matriz[1][0];        
             // alli mover los valores en la matriz
             //Modificar
             matriz[1][0]=matriz[2][0];
             matriz[2][0]=auxiliar;
            // fila = 1;
             //columna =0;
          }
              if(!Juegomatriz.matriz.equals(matriz)){
             //Auxiliar
             auxiliar = matriz[2][1];        
             // alli mover los valores en la matriz
             //Modificar
             matriz[2][1]=matriz[2][0];
             matriz[2][0]=auxiliar;
             //fila = 2;
             //columna =1;
              }
              if(!Juegomatriz.matriz.equals(matriz))
              fila = 2;
             columna =1;
     }
     if(fila == 2 && columna==1){
          System.out.println("3 movimientos");
          if(!Juegomatriz.matriz.equals(matriz)){
             //Auxiliar
              auxiliar = matriz[1][1];        
             // alli mover los valores en la matriz
             //Modificar
             matriz[1][1]=matriz[2][1];
             matriz[2][1]=auxiliar;
             //fila = 1;
             //columna =1;
          }
              if(!Juegomatriz.matriz.equals(matriz)){
             //Auxiliar
              auxiliar = matriz[2][0];        
             // alli mover los valores en la matriz
             //Modificar
             matriz[2][0]=matriz[2][1];
             matriz[2][1]=auxiliar;
            // fila = 2;
             //columna =0;
              }
            if(!Juegomatriz.matriz.equals(matriz)){
             //Auxiliar
              auxiliar = matriz[2][2];        
             // alli mover los valores en la matriz
             //Modificar
             matriz[2][2]=matriz[2][1];
             matriz[2][1]=auxiliar;
             //fila = 2;
             //columna =2;
            }
            if(!Juegomatriz.matriz.equals(matriz))
            fila = 2;
             columna =2;
     }
     if(fila == 2 && columna==2){
          System.out.println("2 movimientos");
          if(!Juegomatriz.matriz.equals(matriz)){
             //Auxiliar
              auxiliar = matriz[1][2];        
             // alli mover los valores en la matriz
             //Modificar
             matriz[1][2]=matriz[2][2];
             matriz[2][2]=auxiliar;
            // fila = 1;
            //columna =2;
          }
              if(!Juegomatriz.matriz.equals(matriz)){
             //Auxiliar
              auxiliar = matriz[2][1];        
             // alli mover los valores en la matriz
             //Modificar
             matriz[2][1]=matriz[2][2];
             matriz[2][2]=auxiliar;
             //fila = 2;
             //columna =1;
              }
              if(!Juegomatriz.matriz.equals(matriz))
              fila = 0;
             columna =0;
     }
 }
 }
 
 //Base
 public void ImprimirJuego(){
     String [][] matriz =Juegomatriz.matriz;
     
    for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
    
}
 }

  public void ImprimirJuegoAleatorio(){
     String [][] matriz =Juegomatriz.matrizAleatoria;
     
    for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
    
}
 }

}