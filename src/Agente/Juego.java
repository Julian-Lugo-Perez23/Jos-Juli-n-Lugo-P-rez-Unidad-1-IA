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
public class Juego {
    
     /*Juego derecha, izquierda, arriba, abajo;  */
    String SoloUnMovimiento ;
    public String [][] matriz = {
        {"7","2","4"},
        {"5","0","6"},
        {"8","3","1"}
    };
    
     String [][]matrizAleatoria =new String[3][3];
     Random random=new Random();
     boolean[] numerosUsados = new boolean[9];
    
    
    
    public Juego(){
        this.random = new Random();
        this.matriz = matriz;
        this.matrizAleatoria =generarMatrizAleatoria();
    }
 
     
     
     private String[][] generarMatrizAleatoria() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                int num;
                do {
                    num = random.nextInt(9);
                } while (numerosUsados[num]);
                matrizAleatoria[i][j] = String.valueOf(num);
                numerosUsados[num] = true;
            }
        }
        return  matrizAleatoria;
    }
    
    
    
}
