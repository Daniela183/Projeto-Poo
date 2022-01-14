/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.prova;

import java.util.Scanner;

/**
 *
 * @author daniela
 */
public class TestePessoa {
     public static void main( String[] args ) {
        int dia = 0;
        int mes = 0;
        int ano = 0;
        double altura = 0;
        int idade = 0;
        
        Scanner in = new Scanner( System.in );
        System.out.println( "Informe o dia: " );        
        dia = in.nextInt();
        System.out.println( "Informe o mês: " );
        mes = in.nextInt();
        System.out.println( "Informe o ano: " );
        ano = in.nextInt();
        System.out.println( "Informe a altura: " );
        altura = in.nextDouble();

        Pessoa p = new Pessoa(dia,mes,ano,altura);
        System.out.println( "A idade é: " + ano );
    }

}
