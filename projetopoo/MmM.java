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
public class MmM {
      public static void main (String[] args){
        Scanner scan = new Scanner(System.in);
         
       System.out .println("Digite o primeiro número: ");
        int num1 = scan.nextInt();
        
        System.out .println("Digite o segundo número: ");
        int num2 = scan.nextInt();
 
        System.out .println("Digite o terceiro número: ");
         int num3 = scan.nextInt();
         
        if (num1 <= num2 && num1 <= num3 && num2 <= num3){
            System.out.println("Menor: " + num1);
            System.out.println("Meio: " + num2);
            System.out.println("Maior: " + num3);
            
        }else if (num1 >= num2 && num1 >= num3 && num2 >= num3){
            System.out.println("Menor: " + num1);
            System.out.println("Meio: " + num2);
            System.out.println("Maior: " + num3);
        }
        
       
        }
    }

