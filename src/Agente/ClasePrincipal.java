/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Agente;

/**
 *
 * @author 52667
 */
public class ClasePrincipal {
    
    public static void main(String []Args){
        
        Reactivo matriz =new Reactivo();
        
        System.out.println("Juego Base");
        matriz.ImprimirJuego();
        
        System.out.println("Juego Creado Aleatorio");
        matriz.ImprimirJuegoAleatorio();
      
        matriz.EncontrarCero();
        //matriz.Mover();
        System.out.println("Nueva matriz");
       matriz.ImprimirJuegoAleatorio();
        
    }
}
