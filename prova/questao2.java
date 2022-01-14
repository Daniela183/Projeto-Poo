/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.prova;

/**
 *
 * @author daniela
 */
import java.util.Scanner;
public class questao2 {
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);
         
        System.out.println("Digite a velocidade:");
        double velocidade = scan.nextDouble();
        String msg;
       int multa;
        if (velocidade <=15){
            multa = 0;
            System.out.println("Velocidade permitida pela via! " + multa);
        }else if (velocidade == 15){
          multa = 70; 
          System.out.println("Você ultrapassou a velocidade maxima da via! " + multa);
        }else if (velocidade >15 && velocidade <=40){
          multa = 110;
          System.out.println("Velocidade acima do permitido pela via! " + multa);
        }else if ( velocidade >41){
         multa = 350;
          System.out.println("Velocidade acima do permitido pela via! " + multa);
 
 }    

    }
}
