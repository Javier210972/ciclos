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
        int i;
        String letra;

        System.out.println("Escriba un texto");
        texto = Mostrar.nextLine();
        largo = texto.length();
        

        for (i = 0; i < largo; i++) {
            letra = texto.substring(i,i+1);
            System.out.println(letra);
        }
        
        System.out.println("decreciente ");
        for (int j = texto.length()-1; j >= 0; j--) {
         letra=texto.substring(j,j+1);
            System.out.println(letra);
        }
        
    }
    
}
