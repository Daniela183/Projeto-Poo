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

public class altura {
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        
        System.out.println("Informe a altura:");
        double altura = in.nextDouble(); 
        double pesoIdeal = (72.2 * altura) - 58;
        
        System.out.println("O peso ideal para a pessoa é: " + pesoIdeal);
        
    } 
}
