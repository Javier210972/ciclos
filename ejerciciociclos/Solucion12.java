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
        int acumulador = 1;
        int i;
        int uno=1;

        System.out.println("ingrese un numero binario");
        ingreso = decimal.nextLine();
        largo = ingreso.length();
      if (largo==1) {
                System.out.println(uno);
            }
        for (i = 2; i < ingreso.length(); i=i+2) {

            cadena = ingreso.substring(largo-1,largo);
            
            if (largo==1) {
                if (largo>1)
                {
                acumulador = acumulador + i;
                    System.out.println(acumulador);
                }
            }
            
            if ("0".equals(cadena)) {
                
            }
                    
                    
        }
    }
}
