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
public class Solucion14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner Valor = new Scanner(System.in);
          int i, suma = 0, n;
       
        System.out.println("Introduce un número: ");
        n = Valor.nextInt();
        for (i = 1; i < n; i++) {  // i son los divisores. Se divide desde 1 hasta n-1 
            if (n % i == 0) {
                suma = suma + i;     // si es divisor se suma
            }
        }
        if (suma == n) {  // si el numero es igual a la suma de sus divisores es perfecto
            System.out.println("Perfecto");
        } else {
            System.out.println("No es perfecto");
        }
        }
        
        
    }
    

