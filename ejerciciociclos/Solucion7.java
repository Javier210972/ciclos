/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciociclos;

import java.util.Scanner;

/**
 *
 * @author toshiba2
 */
public class Solucion7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner Caracter = new Scanner(System.in);
        String texto;
        String C;
        String C2;
        int largo;

        System.out.println("Escriba un texto");
        texto=Caracter.nextLine();
        largo = texto.length();
        C=texto.substring(largo-1, largo);
        C2=texto.substring(0,1);
       
        if (C2.equals(C)) {
            System.out.println("el primer caracter ("+C2+") es igual al ultimo caracter("+C+")");
            
        }
        else    
        {
            System.out.println("el primero y el ultimo NO son iguales");
        }
                

    }

}
