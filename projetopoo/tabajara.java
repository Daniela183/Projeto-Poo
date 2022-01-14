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

public class tabajara {
      public static void main (String[] args){
        Scanner scan = new Scanner(System.in);
       
        System.out .println("Digite seu salário:");
        double salario = scan.nextDouble();
        
        int percentual = 0;
        if (salario <= 280){
            percentual =20;   
        }else if (salario > 280 && salario <= 700){
            percentual = 15;
        }else if (salario >= 700 && salario < 1500){
            percentual = 10;
        }else if (salario >= 1500){
            percentual = 5;
        }
        
        double aumento = (salario/100) * percentual;
        double ajusteSalarial = salario + aumento;
        
        System.out .println("Salário:" + salario);
        System.out .println("Percentual:" + percentual);
        System.out .println("Aumento:" + aumento);
        //String ajuste = null;
        System.out .println("Ajuste Salarial:" + ajusteSalarial);
         
 
    }
}
