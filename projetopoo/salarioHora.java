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

public class salarioHora {
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        
        System.out.println("valor/hora");
        double valorHora = in.nextDouble();
        
        System.out.println("horas no mês");
        double horas = in.nextDouble();
        
        double salarioBruto = valorHora * horas;
        double inss = (salarioBruto/100)* 6;
        double sindicato = (salarioBruto/100)*5;
        double ir = (salarioBruto/100)*11;
        
        double totalDescontos = inss+ sindicato +ir;
        
        double salarioLiquido = salarioBruto = totalDescontos;
        
        
}  
}
