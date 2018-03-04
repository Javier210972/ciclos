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
public class Solucion4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* Solicitar 5 números enteros y mostrar únicamente los números pares desde
el 2 hasta el valor del promedio.*/

        Scanner Inverso = new Scanner(System.in);
        int numero;
        int numeroDos;
        int numeroTres;
        int numeroCuatro;
        int numeroCinco;
        int pro;
        int Numero;
        int igual;

        System.out.println("Ingrese cinco numeros numeros");
        numero = Inverso.nextInt();
        numeroDos = Inverso.nextInt();
        numeroTres = Inverso.nextInt();
        numeroCuatro = Inverso.nextInt();
        numeroCinco = Inverso.nextInt();
        pro = (numero + numeroDos + numeroTres + numeroCuatro + numeroCinco) / 5;

        //Ultimo = Numero%10;
        int i;

        System.out.println("");

        for (i = 2; i <= pro; i++) {

            if (i % 2 == 0) {

                System.out.println(i);
            }

        }

    }

}
