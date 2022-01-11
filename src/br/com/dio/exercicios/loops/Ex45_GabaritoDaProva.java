package br.com.dio.exercicios.loops;

import java.util.Scanner;

/**
 * Desenvolver um programa para verificar a nota do aluno em uma prova com 10 questões,
 * o programa deve perguntar ao aluno a resposta de cada questão e ao final comparar
 * com o gabarito da prova e assim calcular o total de acertos e a nota (atribuir 1 ponto
 * por resposta certa). Após cada aluno utilizar o sistema deve ser feita uma pergunta se
 * outro aluno vai utilizar o sistema. Após todos os alunos terem respondido informar:
 * Maior e Menor Acerto;
 * Total de Alunos que utilizaram o sistema;
 * A Média das Notas da Turma.
 * Gabarito da Prova:
 *
 * 01 - A
 * 02 - B
 * 03 - C
 * 04 - D
 * 05 - E
 * 06 - E
 * 07 - D
 * 08 - C
 * 09 - B
 * 10 - A
 * Após concluir isto você poderia incrementar o programa permitindo que o professor digite o gabarito da prova antes dos alunos usarem o programa.
 *
 *  @author Victor S. S. Barros
 *  @version 1.0
 */

public class Ex45_GabaritoDaProva {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        final int NUMERO_DE_QUESTOES=3;
        int maiorAcerto=0,menorAcerto=NUMERO_DE_QUESTOES+10;//inciado com valores extremos
        int totalAlunos=0;
        double mediaTurma=0;
        char []gabarito=new char[NUMERO_DE_QUESTOES];


        System.out.println("Programa para verificar a nota do aluno em uma prova com 10 questões,\n" +
                "o programa deve perguntar ao aluno a resposta de cada questão e ao final comparar\n" +
                "com o gabarito da prova e assim calcular o total de acertos e a nota (atribuir 1 ponto\n" +
                "por resposta certa). Após cada aluno utilizar o sistema deve ser feita uma pergunta se\n" +
                "outro aluno vai utilizar o sistema. Após todos os alunos terem respondido informar:\n" +
                " * Maior e Menor Acerto;\n" +
                " * Total de Alunos que utilizaram o sistema;\n" +
                " * A Média das Notas da Turma.\n");

        System.out.println("Digite o gabarito da prova: ");
        for (int i=0;i<NUMERO_DE_QUESTOES;i++){
            System.out.println("Qual a resposta da "+(i+1)+"ª questão?");
            gabarito[i]=Character.toUpperCase(scan.next().charAt(0));
        }



        //====================== RESPOSTA ========================
        System.out.println("Gabarito da prova");
        for (int i=0;i<NUMERO_DE_QUESTOES;i++) {
            System.out.println("Quetão "+(i+1)+": "+gabarito[i]);
        }


            System.out.println("\n\nFim do programa.");
    }
}
