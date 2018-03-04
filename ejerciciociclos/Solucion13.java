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
public class Solucion13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner primo = new Scanner(System.in);
        double numero;
        double numero2;

        System.out.println("Ingrese un numero");
        numero=primo.nextInt();
      /* numero2=numero/2;
        System.out.println(numero2);
        System.out.println(numero2%2);
*/
        
        if(numero==2||numero==5||numero==7||numero==11)
        {
          if(numero/numero==1||numero/numero==1||numero/numero==1||numero/numero==1)
       
           System.out.println("primo");
       }
          else  if (numero%2==0||numero%3==0||numero%4==0||numero%5==0||numero%6==0||numero%7==0||numero%8==0||numero%9==0||numero%10==0) {
            System.out.println("compuesto");
        }
        
        else
        {
        
            System.out.println("primo");
        }
        
    
    }
    }
    

