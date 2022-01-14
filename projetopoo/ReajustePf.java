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
public class ReajustePf {
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);
       
        System.out .println("Digite seu salário:");
        float salario = scan.nextFloat();
        
        int percentual = 0;
        if (salario <= 3.000){
            percentual = 50;   
        }else if (salario > 3.000 && salario <= 11.000){
            percentual = 20;
        }else if (salario >= 11.000 && salario < 22.000){
            percentual = 15;
        }else if (salario >= 1.100){
            percentual = 10;
        }
        float aumento = (salario/100) * percentual;
        float ajusteSalarial = salario + aumento;
        
        System.out .println("Salário: " + salario);
        System.out .println("Percentual: " + percentual);
        System.out .println("Aumento: " + aumento);
        System.out .println("Ajuste Salarial: " + ajusteSalarial);
    }
}
