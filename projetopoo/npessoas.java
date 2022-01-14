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

public class npessoas {
    
  public static void main (String[] args){
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Informe a quantidade de pessoas: ");
        var pessoa = scan.nextInt();
        
        int idades = 0;
        int idade;
        int soma = 0;
        
        for(int i=0; i<idades; i++){
            
            System.out.println("Informe a idade da pessoa:" + (i+1));
            idade = scan.nextInt();
            
            soma += idade;
        }
        
        double media = soma/idades;
        
        System.out.println("A média da idade é: " + media);
        
        if (media >= 0 && media <=25){
            System.out.println("É uma turma jovem!");
        }else if (media >= 26 && media <=60) {
            System.out.println("É uma turma adulta!");
        } else if (media > 60){
             System.out.println("É uma turma idosa!");
    }  
 }
}
