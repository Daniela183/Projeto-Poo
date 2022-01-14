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
public class DateTest {
    public static void main( String[] args ) {
        int dia = 0;
        int mes = 0;
        int ano = 0;
        Scanner s = new Scanner( System.in );
        System.out.println( "Digite o dia: " );        
        dia = s.nextInt();
        System.out.println( "Digite o mês: " );
        mes = s.nextInt();
        System.out.println( "Digite o ano: " );
        ano = s.nextInt();

        Date d = new Date(dia,mes,ano);
        System.out.println( "A data é: " + d.displayDate() );
    }

}

