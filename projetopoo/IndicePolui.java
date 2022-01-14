/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.projetopoo;

import java.util.Scanner;
/**

* secretaria de Meio Ambiente que controla o índice de poluição mantém 03 grupos que 
* são altamente poluentes do meio ambiente. O índice de poluição aceitável varia de 
* 0,30 até 0,70. Se o índice sobe para 0,80 as indústrias do 1° grupo são intimadas 
* a suspenderem suas atividades, se o índice crescer para 1,0 as indústrias do 1° e 2°
* grupo são intimadas a suspenderem suas atividades, se o índice atingir 1,4 todos 
* os grupos devem ser notificados a paralisarem suas atividades. Faça um algoritmo 
* que leia o índice de poluição médio e emita a notificação adequada aos diferentes grupos de empresas. */
/**
 *
 * @author gearl
 */
public class IndicePolui {
     public static void main (String[] args){
        Scanner scan = new Scanner(System.in);
       
          System.out. println("Informe o índice de poluição: ");
          float indice = scan.nextFloat();
          
          
       if (indice >= 0.3 && indice <=0.7){
            System.out.println("O índice é aceitável!");
        }else if (indice >= 0.8 && indice <=0.9) {
            System.out.println("Indústrias do 1° grupo teram de suspenderem suas atividades!");
        } else if (indice >= 1.0 && indice <= 1.3){
             System.out.println("Indústrias do 1° e 2º grupo teram de suspenderem suas atividades!");
        } else if (indice > 1.3){
             System.out.println("Todos os grupos teram de suspenderem suas atividades!");
        }
    } 
}

