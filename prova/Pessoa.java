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
public class Pessoa {
     private int dia;  

    private int mes;  

    private int ano; 
    
    private double altura;

    public Pessoa(int d, int m, int a, double al)  
    {  
        this.dia = d;
        this.mes = m;
        this.ano = a;
        this.altura = al;
    }  
    public void setDia(int d)  
    {  
        this.dia = d;  
    }  
    public int getDia()  
    {  
        return this.dia;  
    }  
    public void setMes(int m)  
    {  
        this.mes = m;  
    }  
    public int getMes()  
    {  
        return this.mes;  
    }  
    public void setAno(int a)  
    {  
        this.ano = a;  
    }  
    public int getAno()  
    {  
        return this.ano;  
    }  
    public void setAltura(double al)
    {
        this.altura = al;  
    }       
    public double getAltura()
    {
        return this.altura;
    }
    public void displayIdade()       
    {  
      int resultado = 2021 - this.ano;
         System.out.println(resultado);
    }     

    }  
