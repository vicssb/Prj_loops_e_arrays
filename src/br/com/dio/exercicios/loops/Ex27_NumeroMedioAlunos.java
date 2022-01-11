package br.com.dio.exercicios.loops;

import java.util.Scanner;

/**
 * Faça um programa que calcule o número médio de alunos por turma.
 * Para isto, peça a quantidade de turmas e a quantidade de alunos
 * para cada turma. As turmas não podem ter mais de 40 alunos.
 *
 *  @author Victor S. S. Barros
 *  @version 1.0
 */

public class Ex27_NumeroMedioAlunos {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int quantidadeTurmas, numeroAlunos;
        double media=0.0;

        System.out.println("rograma que calcule o número médio de alunos por turma.\n" +
                "Para isto, peça a quantidade de turmas e a quantidade de alunos\n" +
                "para cada turma. As turmas não podem ter mais de 40 alunos.");
        //========= LEITURA E VALIDAÇÃO DA QUANTIDADE DE TURMAS ====================
        do {
            System.out.println("\nDigite quantidade de turmas: ");
            quantidadeTurmas = scan.nextInt();
            if (quantidadeTurmas < 1)
                System.out.println("Erro! A quantidade deve ser maior que 0.\n");
        }while (quantidadeTurmas<1);

        //========= LEITURA E VALIDAÇÃO DA QUANTIDADE DE ALUNOS DE CADA TURMA ====================
        for (int i=1;i<=quantidadeTurmas;i++){
            do {
                System.out.println("Digite quantidade de alunos da "+i+"ª turma: ");
                numeroAlunos = scan.nextInt();
                if (numeroAlunos < 1)
                    System.out.println("Erro! A quantidade deve ser maior que 0.\n");
                if (numeroAlunos > 40)
                    System.out.println("Erro! As turmas não podem ter mais de 40 alunos.\n");
            }while ((numeroAlunos<1)||(numeroAlunos>40));
            media+=numeroAlunos;
        }
        //======================= RESPOSTA ===================
        media=media/quantidadeTurmas;
        System.out.println("O número médio de alunos por turma é "+ media);

        System.out.println("\n\nFim do programa.");
    }
}
