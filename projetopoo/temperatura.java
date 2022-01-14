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

public class temperatura {
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        
        System.out.println("Informe a temperatura em Fahrenheit:");
        double f = in.nextDouble();
        
        double c = (5 * (f-32) / 9);
        
        System.out.println("A temperatura " + f + " grau's Fahrenheit é igual a: " +c+ " grau's Celsius.");
    }
}
