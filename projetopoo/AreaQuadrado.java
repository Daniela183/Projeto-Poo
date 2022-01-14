/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.projetoPoo;

/**
 *
 * @author daniela
 */
import java.util.Scanner;

public class AreaQuadrado {
    public static void main(String[]args){
        Scanner scan = new Scanner (System.in);
        
        System.out.print("Digite o lado do quadrado:");
        double lado = scan.nextDouble();
        
        double area = Math.pow(lado, 2);
        
        System.out.println("A área do quadrado:" + area);
        
        System.out.println("O dobro da area do quadrado:" + 1);
    }  
}
