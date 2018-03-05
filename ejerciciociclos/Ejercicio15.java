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

        int ingresado;
        int acumulador = 0;
       String cero ="1";
        int numero2 = 1;
        int numero1=0;
        System.out.println("Ingrese un entero");
        ingresado = fibo.nextInt();
        
        if (ingresado>=1) {
            System.out.println("0");
            System.out.println("1");
        }
        for (int i = 0; i <= ingresado; i++) {
            
           acumulador=numero1;
           numero1=numero2;
           numero2=acumulador+numero1;
           
            
            
        if(numero2<=ingresado)
        {
            
            System.out.println(numero2);
        }
        
        if (numero2>=ingresado) {
            i=numero2;
        }
        
        
        }
    
    
    
    
    
    }}


