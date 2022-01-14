/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.projetopoo;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author gearl
 */
public class ValoresAb {
      public static void main(String[] args) throws IOException {
      Scanner in = new Scanner(System.in);
 
      System.out.println("Informe o primeiro valor:");       
      double A = in.nextDouble();
 
      System.out.println("Informe o segundo valor:"); 
      double B = in.nextDouble();
 
        if(A == B){
        double resultado = (A + B);  
         System.out.println("Soma = " + resultado);
        }else{ 
           double resultado = (A*B);
           System.out.println("Multiplicação = " + resultado);
    }
 }
}
 

