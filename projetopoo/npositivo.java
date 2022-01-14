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

public class npositivo {
     public static void main (String[] args){
        Scanner scan = new Scanner(System.in);
        
        System.out. println("Digite um número: ");
        int n = scan.nextInt();
        
        if(n >= 0){
          System.out. println("O número que foi digitado é positivo!");
        }else { 
              System.out. println("O número que foi digitado é negativo!");   
                    
        }  
 
     }
}
