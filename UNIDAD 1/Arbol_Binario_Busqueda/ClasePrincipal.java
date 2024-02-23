/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Arbol_Binario_Busqueda;

import javax.swing.JOptionPane;

/**
 *
 * @author 52667
 */
public class ClasePrincipal {
    
public static void main(String[]args){

    int opcion =0,elemento;
    String nombre;
    ArbolBinario arbolito = new ArbolBinario();
    do{
        try{
           opcion =  Integer.parseInt(JOptionPane.showInputDialog(null, "1, Agregar un Nodo\n"
           +"2.Recorrer el Arbol inOrden\n"
           +"3.Salir\n"
           +"Elige una Opcion....","Aroboles Bianrios"
           ,JOptionPane.QUESTION_MESSAGE));
           switch(opcion){
               case 1:
                   elemento = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingresa el Numero del Nodo...","Agreando Nodo",JOptionPane.QUESTION_MESSAGE));
                   nombre = JOptionPane.showInputDialog(null, "Ingresa el Nombre del Nodo","Agregando Nodo", JOptionPane.QUESTION_MESSAGE);
                   arbolito.agregarNodo(elemento,nombre);
                   break;
               case 2:
                   if(!arbolito.estaVacio()){
                       arbolito.inOrden(arbolito.raiz);
                   }else{
                       JOptionPane.showMessageDialog(null, "El Arbol esta Vacio","Cuidado",JOptionPane.INFORMATION_MESSAGE);
                   }
                   break;
               case 3:
                   JOptionPane.showMessageDialog(null, "Aplicacion finalizada","Fin",JOptionPane.INFORMATION_MESSAGE);
                   break;
               default:
                   JOptionPane.showMessageDialog(null, "Opcion Incorrecta","Cuidado!",JOptionPane.INFORMATION_MESSAGE);

           }
        }catch(NumberFormatException n){
            JOptionPane.showMessageDialog(null, "Error" + n.getMessage());
           
            
        }
    }while(opcion!=2);
}
}


