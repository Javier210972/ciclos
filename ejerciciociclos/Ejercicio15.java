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
public class Ejercicio15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner fibo = new Scanner(System.in);

        double ingresado;
        double resultado=1;

        double numero2 = 0;
        double resultado2=1;
        System.out.println("Ingrese un entero");
        ingresado = fibo.nextInt();
        
        for (resultado = 1; resultado < resultado2; resultado++) {
            
             
            for (resultado2 = 1; resultado2 < ingresado; resultado2++) {
                
                
                resultado = numero2 + resultado;
            resultado2 = numero2 + resultado;
             resultado2 = numero2;
        System.out.println(resultado2);
             System.out.println(resultado);
                
           
            
            }
        
        
        
        }}}


