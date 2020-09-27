/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ejemplos;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class EcuacionRecurrente {

     
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.println("Bienvenido al programa de soluciòn "
                + "de ecuaciones recurrentes.");
        System.out.println("----------------------------------------------");
        System.out.println("Digite la constante :");
        Double constante = scanner.nextDouble();
        System.out.println("----------------------------------------------");
        System.out.println("Digite el número de iteraciones que desea realizar");
        Integer iteraciones = scanner.nextInt();
        System.out.println("----------------------------------------------");
        System.out.println("Digite el valor de a sub0");
        Double a0 = scanner.nextDouble();
        
        ecuacionRecurrente(a0, constante, iteraciones);
        

        
    }
    
    
        public static void ecuacionRecurrente(final Double a0, final Double constante, final Integer iteraciones){
          
        for (int it = 0; it <= iteraciones; it++) {
           
            Double an =  (a0 * Math.pow(constante, it));
                     
            System.out.println("-----------------------------------------");
            System.out.println("El valor de a"+it + " es = "+an);
            
            if(it == iteraciones){
                System.out.println("------------------------------------------------------------------------------------------");
                System.out.println("El valor final de la iteración utilizando la ecuaciòn general an= a0*C^n es: " + an);
                System.out.println("------------------------------------------------------------------------------------------");
            }
        }
                
    }
}
