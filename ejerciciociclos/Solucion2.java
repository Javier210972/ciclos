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
public class Solucion2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* Solicitar dos valores numéricos enteros, calcular el promedio y mostrar de
forma inversa los números (del mayor al menor) desde el promedio hasta el
número 1.*/

        Scanner Inverso = new Scanner(System.in);
        int numero;
        int numeroDos;
        double Pro;

        System.out.println("Ingrese dos numeros");
        numero = Inverso.nextInt();
        numeroDos = Inverso.nextInt();
        Pro = (double) (numero + numeroDos) / 2;

        int i;

        System.out.println("");
        System.out.println("Promedio: " + Pro);
        for (i = numero; i >= numeroDos; i--) {

            System.out.println(i);

        }
        for (i = numeroDos; i >= numero; i--) {

            System.out.println(i);

        }

    }
}
