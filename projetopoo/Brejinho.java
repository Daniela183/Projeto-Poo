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
public class Brejinho {
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);
        
        System.out .println("Digite a quantidade do elemento ph: ");
        float ph = scan.nextFloat();
        
        System.out .println("Digite a quantidade do elemento fósforo: ");
        int fosforo = scan.nextInt();
 
        System.out .println("Digite a quantidade do elemento cálcio: ");
        int calcio = scan.nextInt();
         
        System.out .println("Digite a quantidade do elemento pótassio: ");
        float potassio = scan.nextFloat();
        
        System.out .println("Digite a quantidade do elemento zinco: ");
        float zinco = scan.nextFloat();
        
        System.out .println("Digite a quantidade do elemento cobre: ");
        float cobre = scan.nextFloat();
        
        System.out .println("Digite a quantidade do elemento boro: ");
        float boro = scan.nextFloat();
        
         if (ph >= 5.1 && ph <=5.5){
            System.out. println("Pode realizar o cultivo! ");
        }else{
            System.out. println("Não pode realizar o cultivo! Para realizar o cultivo deverá usar Calagem no solo para a correção do pH!");
        }
         if (fosforo >= 13 && fosforo <= 30){
            System.out. println("Pode realizar o cultivo! ");
        }else{
            System.out. println("Não pode realizar o cultivo! Para realizar o cultivo deverá usar Fosfatagem no solo para a correção do Fósforo!");   
        }
         if (calcio >= 4 && calcio <= 7){
            System.out. println("Pode realizar o cultivo! ");
        }else{
            System.out. println("Não pode realizar o cultivo! Para realizar o cultivo deverá usar Gessagem no solo para a correção do Cálcio!");   
        }
         if (potassio >= 1.6 && potassio <= 3){
            System.out. println("Pode realizar o cultivo! ");
        }else{
            System.out. println("Não pode realizar o cultivo! Para realizar o cultivo deverá usar Cloreto de Potássio no solo para a correção do Potássio!");   
        }
         if (zinco == 0.6){
            System.out. println("Pode realizar o cultivo! ");
        }else{
        
            System.out. println("Não pode realizar o cultivo! Para realizar o cultivo deverá usar Sulfado de Zinco no solo para a correção do Zinco!");   
        }
          if (cobre == 0.3){
            System.out. println("Pode realizar o cultivo! ");
        }else{
            System.out. println("Não pode realizar o cultivo! Para realizar o cultivo deverá usar Sulfado de Cobre no solo para a correção do Cobre!");   
        }
          if (boro == 0.2){
            System.out. println("Pode realizar o cultivo! ");
        }else{
            System.out. println("Não pode realizar o cultivo! Para realizar o cultivo deverá usar Ácido bórico no solo  para a correção do Boro!");   
        }
    }
}

