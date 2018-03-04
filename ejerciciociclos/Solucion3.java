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
public class Solucion3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner tabla = new Scanner(System.in);
        int numero;

        System.out.println("Ingrese un numero para multiplicarlo");
        numero = tabla.nextInt();
        for (int i = 1; i <= 10; i++) {

            System.out.println(i + "x" + numero + "=" + i * numero);

        }
    }

}
