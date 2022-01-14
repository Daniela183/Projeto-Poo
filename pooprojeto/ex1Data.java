/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.pooprojeto;

import java.util.Scanner;

/**Crie uma classe em Java chamada Data que inclui três informações
como variáveis de instância:
• mês (int),
• dia (int) e
• ano (int).
A classe deve ter métodos get e set para cada variável e um construtor
que inicializa as variáveis e assume que os valores fornecidos são
corretos. Forneça um método displayData que exibe o dia, o mês e o ano
separados por barras normais ( / ). Escreva um aplicativo de teste
chamado DataTeste que demonstra as capacidades da classe Data.
 *
 * @author daniela
 */
public class ex1Data {
     public static void main( String[] args ) {
         
        int dia = 0;
        int mes = 0;
        int ano = 0;
        
        Scanner scan = new Scanner( System.in );
        System.out.println( "Informe o dia: " );        
        dia = scan.nextInt();
        
        System.out.println( "Informe o mês: " );
        mes = scan.nextInt();
        
        System.out.println( "Informe o ano: " );
        ano = scan.nextInt();

        dataTeste d = new dataTeste(dia,mes,ano);
        System.out.println( "Sua data é: " + d.displayData() );
    }

}
