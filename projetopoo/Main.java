
package com.mycompany.projetopoo;

/**
 *
 * @author daniela
 */
import java.io.IOException;
import java.util.Scanner;
 

public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
 
 System.out.println("Informe o primeiro valor:");       
 double A = in.nextDouble();
 
 System.out.println("Informe o segundo valor:"); 
 double B = in.nextDouble();
 
 double resultado = (A + B);
 
 System.out.println("Soma = " + resultado);
   
    }
 }
 
