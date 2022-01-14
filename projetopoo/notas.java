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

public class notas {
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        
        System.out.println("primeira nota:");
        double primeiraNota = in.nextDouble();
        
        System.out.println("segunda nota:");
        double segundaNota = in.nextDouble();
        
        System.out.println("terceira nota:");
        double terceiraNota = in.nextDouble();

        System.out.println("quarta nota:");
        double quartaNota = in.nextDouble();
        
         double resultado = (primeiraNota + segundaNota  + terceiraNota + quartaNota )/(4);

       System.out.println("A media é: " + resultado);
    
    } 
}
