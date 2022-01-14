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
 * @author Daniela
 */
public class MainInt {
  
  public static void main(String[] args) throws IOException {
      Scanner scan = new Scanner(System.in);
      int A, B,C,D;
      
      System.out.println("Informe os valores:");
      A = scan.nextInt();
      B = scan.nextInt();
      C = scan.nextInt();
      D = scan.nextInt();
     
      if((B>C)&&(D>A)&&(C+D>A+B)&&(C>0)&&(D>0)&&(A%2==0)){
          System.out.println("Valores aceitos!");
    }else{
          System.out.println("Valores não aceitos!");
  }
  }
}
