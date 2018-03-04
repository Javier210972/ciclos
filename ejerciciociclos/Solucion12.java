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
public class Solucion12 {

    public static void main(String[] args) {

        Scanner decimal = new Scanner(System.in);
        String cadena;
        String ingreso;
        int largo;
        int suma = 0;
        int i;
        int cero = 0;
        int cero2 = 0;

        System.out.println("ingrese un numero binario");
        ingreso = decimal.nextLine();
        largo = ingreso.length();

        for (i = 1; i <= ingreso.length(); i+=2) {

            cadena = ingreso.substring(0,1);
                 suma=suma+i;
            if ("1".equals(cadena)) {
                System.out.println(suma);
            } 
            if ("0".equals(cadena)) {
                suma=cero+cero2;
                   
                

            }
        }
    }
}
