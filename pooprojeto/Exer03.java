/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.pooprojeto;

import java.util.Scanner;

/**
 *
 * @author daniela 
 */
public class Exer03 {
    
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        Aluno aluno = new Aluno();
        
        System.out.println("Digite o nome do aluno:");
        aluno.nome = scan.next();
        
        System.out.println("Digite o nome do curso:");
        aluno.nomeCurso = scan.next();
        
        System.out.println("Digite a matricula:");
        aluno.matricula = scan.next();
        
        //aluno.nomeDisciplinas = new String[3];
        for (int x=0; x<aluno.nomeDisciplinas.length; x++){
            System.out.println("Digite o nome da disciplina:" +x);
            aluno.nomeDisciplinas[x] = scan.next();
        }
        for (int x=0; x<aluno.notasDisciplinas.length; x++){
              System.out.println("Buscando notas da disciplina" +aluno.nomeDisciplinas[x]);
              for (int y=0; y<aluno.notasDisciplinas[x].length; y++){
                  System.out.println("Digite a nota:" + (y+1));
                  aluno.notasDisciplinas[x][y] = scan.nextDouble();
              }
        }
        aluno.mostrarInfo();
        
        for (int x=0; x<aluno.nomeDisciplinas.length; x++){
            if (aluno.verificarAprovado(x)){
                System.out.println("Disciplina" + aluno.nomeDisciplinas[x] + " - Foi aprovado!" );
            }else{
                 System.out.println("Disciplina" + aluno.nomeDisciplinas[x] + " - Foi reprovado!" );
            }
        }
    }
    
}
