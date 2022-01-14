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
public class questao5 {
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);
         
        int[] vetor = new int[1000];
        int i = 0;
        for (int x = 1000; x < 2000; x++) {
            vetor[i] = x;
            i++;}
       
        for (int y = 0; y <= vetor.length - 1; y++) {
            if (vetor[y] % 2 == 0) {
                System.out.println(vetor[y]);
            }
        }
    }
}