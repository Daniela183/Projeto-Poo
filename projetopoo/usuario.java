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
public class usuario {
     public static void main (String[] args){
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Informe a quantidade de números: ");
        int usuario = scan.nextInt();
        
        int valor;
        int soma = 0;
        
         for(int i=0; i<usuario; i++){
            
            System.out.println("Informe o número: " + (i+1));
            usuario = scan.nextInt();
            
            soma += usuario;
        }
        
        double resultado = (soma);
        
        System.out.println("A soma é: " + soma);
        
 }
}
        