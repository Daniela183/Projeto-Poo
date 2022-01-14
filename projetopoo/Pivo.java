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
public class Pivo {
     public static void main (String[] args){
        Scanner scan = new Scanner(System.in);
        
        System.out .println("Digite a porcentagem do IURA: ");
        int umi = scan.nextInt();
        
         if (umi == 25){
            System.out. println("Ligar automaticamente por 04 horas! ");
        }
         if (umi >= 26 && umi <= 39){
            System.out. println("Ligar automaticamente por 02 horas! ");
        }
         if (umi >= 40){
            System.out. println("Permanecer desligado! ");
        }
    }
}
