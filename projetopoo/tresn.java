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

public class tresn {
     public static void main (String[] args){
        Scanner scan = new Scanner(System.in);
        
        System.out .println("Digite o primeiro número: ");
        int n1 = scan.nextInt();
        
        System.out .println("Digite o segundo número: ");
        int n2 = scan.nextInt();
 
        System.out .println("Digite o terceiro número: ");
         int n3 = scan.nextInt();
        
        if (n1 >= n2 && n1 >= n3){
            System.out. println("O primeiro número é maior! "  + n1);
        }else if (n2 >= n1 && n2 >= n3){
            System.out. println("O segundo número é maior! "  + n2);
        }else if (n3 >= n1 && n3 >= n2){
           System.out. println("O terceiro número é maior! "  + n3);
        }
         if (n1 <= n2 && n1 <= n3){
            System.out. println("O primeiro número é menor! "  + n1);
        }else if (n2 <= n1 && n2 <= n3){
            System.out. println("O segundo número é menor! "  + n2);   
        }else if (n3 <= n1 && n3 <= n2){
           System.out. println("O terceiro número é menor! "  + n3);
        }
         if (n1 == n2 && n1 == n3){
            System.out. println("O primeiro número esta ao meio! "  + n1);
        }else if (n2 != n1 && n2 != n3){
            System.out. println("O segundo número esta ao meio! "  + n2);   
        }else if (n3 != n1 && n3 != n2){
           System.out. println("O terceiro número esta ao meio! "  + n3);
        }
    }
}
