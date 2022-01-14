/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.projetopoo;

/**
 *
 * @author daniela
 */
import java.util.Scanner;

public class numero {
    public static void main(String[]args){ 
        Scanner in = new Scanner(System.in);
        
        System.out.println("Digite um número inteiro: ");
        int n1 = in.nextInt();
        
        System.out.println("Digite um número inteiro: ");
        int n2 = in.nextInt();
        
        System.out.println("Digite um número real: ");
        double n3 = in.nextDouble();
      
        int resultado1 = (n1 * 2) * (n2/2);
        double resultado2 = (n1 * 3) + 3;
        double resultado3 = Math.pow(n3, 3);
        
        System.out.println("Resultado1: " + resultado1);
        System.out.println("Resultado2: " + resultado2);
        System.out.println("Resultado3: " + resultado3);
        
       
    }  
}
