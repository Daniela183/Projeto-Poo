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
public class Velha {
    
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        
        char[][] jogoVelha = new char[3][3];
        
        System.out.println("Jogador 1 = X");
        System.out.println("Jogador 2 = O");
        
        boolean ganhou = false;
        int jogada = 1;
        char sinal;
        int linha = 0, coluna = 0;
        
        while(!ganhou){
        
            if(jogada % 2 == 1){
                
                System.out.println("Vez jogador 1. Selecione linha e coluna(1-3).");
                sinal = 'X';
            }else{
                System.out.println("Vez jogador 2. Selecione linha e coluna(1-3)."); 
                sinal = 'O';
            }
            
            boolean linhaValida = false;
            while(!linhaValida){
                System.out.println("Digite a linha(1,2 ou 3)");
                linha = scan.nextInt();
                if(linha >=1 && linha <=3){
                    linhaValida = true;
                }else{
                    System.out.println("Digito inválido, tente outra vez!");
                }
            }
            
            boolean colunaValida = false;
            while (!colunaValida){
                System.out.println("Digite a coluna(1,2 ou 3)");
                coluna = scan.nextInt();
                if (coluna >=1 && coluna <=3){
                    colunaValida = true;
                }else{
                     System.out.println("Digito inválido, tente outra vez!");
                }
            }
            
            linha--;
            coluna--;
            if (jogoVelha [linha][coluna] == 'X' || jogoVelha [linha][coluna] == 'O' ){
                System.out.println("Posição já utilizada, tente outra vez");
            }else{
                jogoVelha[linha][coluna] = sinal;
                jogada++;
            }
            
            for (int y=0; y<jogoVelha.length; y++){
                for(int j=0; j<jogoVelha[y].length; j++){
                    System.out.print(jogoVelha[y][j] + "|");
                }
                System.out.println("");
            }
            
            if((jogoVelha[0][0] == 'X' && jogoVelha[0][1] == 'X' && jogoVelha[0][2] == 'X')||
                    (jogoVelha[1][0] == 'X' && jogoVelha[1][1] == 'X' && jogoVelha[1][2] == 'X')||
                    (jogoVelha[2][0] == 'X' && jogoVelha[2][1] == 'X' && jogoVelha[2][2] == 'X')||
                    (jogoVelha[0][0] == 'X' && jogoVelha[1][0] == 'X' && jogoVelha[2][0] == 'X')||
                    (jogoVelha[0][1] == 'X' && jogoVelha[1][1] == 'X' && jogoVelha[2][1] == 'X')||
                    (jogoVelha[0][2] == 'X' && jogoVelha[1][2] == 'X' && jogoVelha[2][2] == 'X')||
                    (jogoVelha[0][0] == 'X' && jogoVelha[1][1] == 'X' && jogoVelha[2][2] == 'X')){
                ganhou = true;
                System.out.println("Parabéns, jogador 1 venceu!");
            }else if((jogoVelha[0][0] == 'O' && jogoVelha[0][1] == 'O' && jogoVelha[0][2] == 'O')||
                    (jogoVelha[1][0] == 'O' && jogoVelha[1][1] == 'O' && jogoVelha[1][2] == 'O')||
                    (jogoVelha[2][0] == 'O' && jogoVelha[2][1] == 'O' && jogoVelha[2][2] == 'O')||
                    (jogoVelha[0][0] == 'O' && jogoVelha[1][0] == 'O' && jogoVelha[2][0] == 'O')||
                    (jogoVelha[0][1] == 'O' && jogoVelha[1][1] == 'O' && jogoVelha[2][1] == 'O')||
                    (jogoVelha[0][2] == 'O' && jogoVelha[1][2] == 'O' && jogoVelha[2][2] == 'O')||
                    (jogoVelha[0][0] == 'O' && jogoVelha[1][1] == 'O' && jogoVelha[2][2] == 'O')){
                ganhou = true;
                System.out.println("Parabéns, jogador 2 venceu!");
            }else if(jogada > 9){
                ganhou = true; 
                System.out.println("Nenhum dos dois ganhou a partida");
            }
        }
    }
}