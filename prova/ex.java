package com.mycompany.prova;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;

/**
 *
 * @author daniela
 */
public class ex {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Aluno aluno = new Aluno();

        System.out.println("Informe o nome do aluno: ");
        aluno.nome = scan.next();

        System.out.println("Informe o nome do curso: ");
        aluno.nomeCurso = scan.next();

        System.out.println("Informe a matricula: ");
        aluno.matricula = scan.next();

        aluno.nomeDisciplina = new String[3];
        for (int i = 0; i < aluno.nomeDisciplina.length; i++) {
            System.out.println("Informe o nome da disciplina: " + i);
            aluno.nomeDisciplina[i] = scan.next();
        }
        
        for (int i = 0; i < aluno.notasDisciplinas.length; i++) {
            System.out.println("Informando as notas da disciplina " + aluno.nomeDisciplina[i]);
            for (int j = 0; j < aluno.notasDisciplinas[i].length; j++) {
                System.out.println("Informe a nota: " + (j + i));
                aluno.notasDisciplinas[i][j] = scan.nextDouble();

            }
        }
        aluno.mostrarInformacoes();

        for (int i = 0; i < aluno.nomeDisciplina.length; i++) {
            if (aluno.verificarAprovacao(i)) {
                System.out.println("Disciplina: " + aluno.nomeDisciplina[i] + "Foi aprovado");
            } else {
                System.out.println("Disciplina: " + aluno.nomeDisciplina[i] + "Foi reprovado");

            }

        }

    }
}
