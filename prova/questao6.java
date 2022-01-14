/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.prova;

/**
 *
 * @author daniela
 */
import java.util.Scanner;
public class questao6 {
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);
       
        int[] vetor = new int[50];
        int i = 0;
        for(int n = 41; n <= 90; n++) {
            vetor[i] = n;
        i++;}
       
        for(int a = 0; a <= vetor.length - 1; a++){
            if(vetor[a] %2 != 0){
                System.out.println(vetor[a]);
            }

        }
    }
}
     