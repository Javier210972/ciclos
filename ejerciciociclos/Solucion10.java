/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciociclos;

import java.util.Scanner;

/**
 *
 * @author redes
 */
public class Solucion10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner Mostrar = new Scanner(System.in);
        String texto;
        int largo;
        int letras;
      
       
        String C;
        String C2;
        String C3;

        System.out.println("1Escriba un texto");
        texto = Mostrar.nextLine();
        largo = texto.length();
        

        int i;
          for (i = largo-2; i>= 0; i-=2) {
             
           C=texto.substring(i,i+2);
              System.out.println(C);
              
           
          }
       
     letras =largo%2;
//        if (letras==0) {
//            System.out.println("");
//        }
          if (largo!=0){
            C=texto.substring(0,1);
              System.out.println(C);
        
          }
        
    }
    
}
