package com.mycompany.prova;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author daniela
 */
public class Aluno {
    
    String nome;
    String matricula;
    String nomeCurso;
    String[] nomeDisciplina;
    double[][] notasDisciplinas = new double [3][4] ;
    
    
    void mostrarInformacoes(){
        System.out.println("Nome: " + nome);
        System.out.println("Matrícula: " + matricula);
        System.out.println("Nome do curso: " + nomeCurso);
        
        for (int i=0; i<notasDisciplinas.length; i++){
            System.out.println("Notas das disciplinas: " + nomeDisciplina[i]);
            for(int j=0; j<notasDisciplinas[i].length; j++){
                System.out.println(notasDisciplinas[i][j] + " ");
            }
            System.out.println();
        }
    }
    boolean verificarAprovacao(int indice){
        double soma = 0;
    for (int i=0; i<notasDisciplinas[indice].length; i++){
      soma += notasDisciplinas[indice][i];  
    }
    double media = soma/4;
     if(media >= 7){
        return true;
     }else{
        return false;
     }
     
  }
}
