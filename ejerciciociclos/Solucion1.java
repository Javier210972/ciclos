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
public class Solucion1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner Solucion = new Scanner(System.in);
        int vf;
        System.out.println("Ingrese valor");
        vf = Solucion.nextInt();
        for (int i = 1; i <= vf; i++) {

            System.out.print(i);
            if (i < vf) {
                System.out.print(",");
            }
        }

    }
}
