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
        String Binario;
        int largo;
        int acumulador = 1;
        int i;
        int uno=1;
        int exp=0;
        double operacion;
        double suma = 0;
          String digito;
     
// i es posicion de la cadena
        System.out.println("ingrese un numero binario");
        Binario = decimal.nextLine();
        largo = Binario.length();
           exp=largo;
        for (int j = 0; j < largo; j++) {
            exp = exp-1;
            digito=Binario.substring(j,j+1);
            System.out.println(digito);
            if (digito.equals("1")) {
                operacion =Math.pow(2, exp);
                suma = operacion + suma;
            }
            
            
           // System.out.println(j+","+(j+1)+"  Exponente "+exp);
        
           
            }
        System.out.println(Binario+" Es igual a: "+suma);            
//cadena = String.valueOf(residuo);
      
    }
}
