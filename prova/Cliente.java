/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.listadeexercicio5;

import java.util.Scanner;

/**
 *
 * @author Vítor Moreira
 */
public class Cliente {
   
    Integer codigo;
    String nome;

    //Quando se tem um contrutor sem ser vazio, precisa criar um vazio, para poder diferenciar
    public Cliente() {

    }

    // contrutor com o parâmetro código
    public Cliente(Integer codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCodigo() {
        return codigo;

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Insira um nome: " );
        String nome = input.nextLine();

        System.out.println("Seu nome é:" + nome);
        Cliente c1 = new Cliente();
        c1.setNome(nome);
    }
}

