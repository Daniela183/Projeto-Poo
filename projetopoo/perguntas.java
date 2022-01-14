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

public class perguntas {
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);
    
        System.out .println("Telefonou para a vítima?");
        String r1 = scan.next();
        
        System.out .println("Esteve no local do crime?");
        String r2 = scan.next();
        
        System.out .println("Mora perto da vítima?");
        String r3 = scan.next();
        
        System.out .println("Devia para a vítima?");
        String r4 = scan.next();
        
        System.out .println("Já trabalhou com a vítima?");
        String r5 = scan.next();
        
        int cont = 0;
        
        if(r1.equalsIgnoreCase("S")){
            cont++;
        }
        if(r2.equalsIgnoreCase("S")){
            cont++;
        }
        if(r3.equalsIgnoreCase("S")){
            cont++;
        }
        if(r4.equalsIgnoreCase("S")){
            cont++;
        }
        if(r5.equalsIgnoreCase("S")){
            cont++;
        }
        
        if(cont == 2){
            System.out. println("Suspeito");
        }else if (cont == 3 || cont == 4){
            System.out. println("Cúmplice");
        }else if (cont == 5){
            System.out. println("Assassino");
        }else if (cont == 0){
            System.out. println("Inocente");
        }   
    }
}
