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



public class Ipi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite a porcentagem doIPI:\n");
        int IPI = input.nextInt();
        System.out.println("Digite o codigo:\n");
        int codigo01 = input.nextInt();
        System.out.println("Digite o valor:\n");
        int valor01 = input.nextInt();
        System.out.println("Digite a quantidade:\n");
        int quant01 = input.nextInt();
      
System.out.println("Digite o codigo:\n");
        int codigo02 = input.nextInt();
        System.out.println("Digite o valor:\n");
        int valor02 = input.nextInt();
        System.out.println("Digite a quantidade:\n");
        int quant02 = input.nextInt();

        int resultado = (valor01*quant01 + valor02*quant02)*(IPI/100 + 1);

        System.out.println(resultado);
    }
}
