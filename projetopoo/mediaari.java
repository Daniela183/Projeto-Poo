/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.projetopoo;
import java.util.Scanner;
/**
 *
 * @author daniela
 */
public class mediaari {
        public static void main (String[] args){
        Scanner scan = new Scanner (System.in);
        
        System.out.println("Digite a quantidade de notas:");
        double notas = scan.nextDouble();
        
        double soma = 0; 
        double media;   
        double nota;
        
        for(double i=0; i<notas; i++){
            System.out.println("Digite a nota:" + (i+1));
            nota = scan.nextDouble();
            
            soma += nota;
        }
        
        media = soma/notas;
        
        System.out.println("A soma das notas são: " + soma);
        System.out.println("A média é: " + media);
        }
}
