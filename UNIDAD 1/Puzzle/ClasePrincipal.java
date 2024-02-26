/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Puzzle;
import java.util.Scanner;
/**
 *
 * @author 52667
 */
public class ClasePrincipal {
    
    //724506831
    public static void main(String []args){
        
         Amplitud Anchura= new Amplitud();
        Profundidad profundidad = new Profundidad();

         Scanner scanner = new Scanner(System.in);
        
        int opcion=0;
        String objectivo,base;
        System.out.println("Introduzca la base del juego");
         base =scanner.nextLine();
         System.out.println("Introduzca el objectivo del juego");
        objectivo =scanner.nextLine();
        while(opcion!=3){
         
        System.out.println("Como quieres hacer la busqueda");
        System.out.println("1.Amplitud");
        System.out.println("2.profundidad");
        System.out.println("3.Salir");
         opcion = scanner.nextInt();
        Nodo actualpadre = new Nodo(base,null);
        switch(opcion){
                case 1:
                     System.out.println("Busqueda por Anchura");
                     long inicio = System.currentTimeMillis();
                    Anchura.GenerarSucesores(actualpadre,objectivo);
                    long fin = System.currentTimeMillis();
                    long tiempoTotal = fin - inicio;
                    System.out.println("Tiempo total de ejecución en milisegundos: " + tiempoTotal);
                    break;
                case 2:
                     System.out.println("Busqueda por profundidad");
                    long inicio1 = System.currentTimeMillis();
                    profundidad.GenerarSucesores(actualpadre,objectivo);
                    long fin1 = System.currentTimeMillis();
                    long tiempoTotal1 = fin1 - inicio1;
                    System.out.println("Tiempo total de ejecución en milisegundos: " + tiempoTotal1);
        
                    break;
                case 3:
                    
        }   
        }
        System.out.println("Programa Terminado");
    }
    
}
