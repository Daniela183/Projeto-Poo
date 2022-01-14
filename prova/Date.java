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
public class Date {

    private int dia;  

    private int mes;  

    private int ano;  

    public Date(int d, int m, int a)  
    {  
        this.dia=d;
        this.mes=m;
        this.ano=a;
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
    public String displayDate()  
    {  
       
       return String.format("%d/%d/%d", this.dia, this.mes, this.ano);  
    }  
} 
