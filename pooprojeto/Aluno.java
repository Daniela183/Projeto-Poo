/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.pooprojeto;
import java.util.Scanner;
/**
 *
 * @author Daniela
 */
public class Aluno {
    public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    }
    String nome;
    String matricula;
    String nomeCurso;
    String[] nomeDisciplinas = new String[3];
    double[][] notasDisciplinas = new double [3][4];
    
    void mostrarInfo(){
        System.out.println("Nome:" + nome);
        System.out.println("Matricula:" + matricula);
        System.out.println("Nome do curso:" + nomeCurso);
        
        for (int x=0; x<notasDisciplinas.length; x++);
        int x = 0;
            System.out.println("Notas da disciplina" + nomeDisciplinas[x]);
            for (int y=0; y<notasDisciplinas.length; y++){
                 System.out.print(notasDisciplinas[x][y] + " ");
            }
              System.out.println();
        }
    
    boolean verificarAprovado(int indice){
         double soma = 0;
         for (int x=0; x<notasDisciplinas[indice].length; x++){
              soma += notasDisciplinas[indice][x];
        }
         double media = soma/4;
         if (media>= 7){
             return true;
         }else{
             return false;
         }
      
    }
}
