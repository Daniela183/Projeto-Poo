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
public class questao4 {
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);
    int a = 3, b = 2, c = 3;
        while(c < a){
            a = a - 2;
            b = b + 1;
            c = c + b;
            System.out.println("");
        }
     }
}
