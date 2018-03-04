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
public class Solucion5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner Operacion = new Scanner(System.in);
        double n;
        double i = 1;
        double operacion;
        double acumulador = 0;
        System.out.println("Ingrese un numero");
        n = Operacion.nextDouble();
        operacion = i / n;
        System.out.println("");
        for (i = 1; i <= n; i++) {

            acumulador = acumulador + operacion;
            System.out.println(acumulador);

        }

    }

}
