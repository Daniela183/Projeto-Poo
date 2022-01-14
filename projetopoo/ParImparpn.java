/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.projetopoo;

import java.util.Scanner;

/**
 *
 * @author gearl
 */
public class ParImparpn {
     public static void main (String[] args){
        Scanner scan = new Scanner(System.in);
        
        System.out. println("Digite um número: ");
        int n = scan.nextInt();
        
        if(n >= 0){
          System.out. println("O número que foi digitado é positivo! " + n);
        }else { 
            System.out. println("O número que foi digitado é negativo! " + n);             
        }  
         if (n % 2==1){
            System.out. println("O valor é ímpar! "  + n);
        }else {
            System.out. println("O valor é par! "  + n);
        }  
     }
}
