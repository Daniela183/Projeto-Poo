/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.projetopoo;
import java.io.IOException;
import java.util.Scanner;  
/**
 *
 * @author Daniela
 */
public class MainDoisv {
   
public static void main(String[] args) throws IOException {
       Scanner in = new Scanner(System.in);
        System.out.println("Informe dois valores:");
        int a = in.nextInt();
        int b = in.nextInt();
        int x = a + b;
        System.out.println("X = " + x);
    }

 
    
} 

