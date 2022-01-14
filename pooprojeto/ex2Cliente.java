/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.pooprojeto;

import java.util.Scanner;

/**Crie uma classe Cliente, considerando que esta deva possuir :
Construtor: O Construtor da classe deve possuir como parâmetro somente o
código do Cliente
Atributos
• Código do Cliente
• Nome Completo
Métodos
• Inserção do nome do cliente
• Retorna do nome do cliente
• Retorna Código do Cliente
* Crie um programa que instancie dois objetos Cliente, atribua o valor ao
atributo Nome do Cliente. Antes e após a atribuição, imprima o Nome do
Cliente utilizando a função de retorno..
 *
 * @author daniela
 */
public class ex2Cliente {
      
      int codigo;
      String nome;

   
    public ex2Cliente() {

    }
    public ex2Cliente(int codigo) {
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
        System.out.println("Insira o nome: " );
          String nome = input.nextLine();

        System.out.println("Seu nome é: " + nome);
        ex2Cliente cliente = new ex2Cliente();
        cliente.setNome(nome);
    }

    private void setNome(int nome) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    
}
