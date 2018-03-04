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
public class Solucion8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner Mostra = new Scanner(System.in);
        String texto;
        int largo;
        int i;
        String C;

        System.out.println("Escriba un texto");
        texto = Mostra.nextLine();
        largo = texto.length();
        

        for (i = 1; i <= texto.length(); i++) {
            C = texto.substring(i-1, i);
            System.out.print("(" + C + ")");

        }
        System.out.println("");
        
       
    }
}
