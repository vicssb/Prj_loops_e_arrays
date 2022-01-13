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

//********* PODERIA UTILIZAR FUNÇÕES, FICARIA MUITO MAIS SIMPLES *************
//********* SERÁ ENSINADO EM ORIENTAÇÃO A OBJETO ****************************

public class Ex45_GabaritoDaProva {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        final int NUMERO_DE_QUESTOES=10;
        int  maiorAcerto=0,menorAcerto=NUMERO_DE_QUESTOES+10;//inciado com valores extremos
        int numeroAcertos=0, totalAlunos=0;
        double mediaTurma=0;
        char []gabarito=new char[NUMERO_DE_QUESTOES];
        char []respostaAluno=new char[NUMERO_DE_QUESTOES];
        char continuar;


        System.out.println("Programa para verificar a nota do aluno em uma prova com 10 questões,\n" +
                "o programa deve perguntar ao aluno a resposta de cada questão e ao final comparar\n" +
                "com o gabarito da prova e assim calcular o total de acertos e a nota (atribuir 1 ponto\n" +
                "por resposta certa). Após cada aluno utilizar o sistema deve ser feita uma pergunta se\n" +
                "outro aluno vai utilizar o sistema. Após todos os alunos terem respondido informar:\n" +
                " * Maior e Menor Acerto;\n" +
                " * Total de Alunos que utilizaram o sistema;\n" +
                " * A Média das Notas da Turma.\n");

        //=============== ENTRADA DOS DADOS ==============================
        //******* NÃO HÁ VALIDAÇÃO DAS OPÇÕES, POIS PODE HAVER MAIS DE CINCO OPÇÕES ******
        System.out.println("Professor digite o gabarito da prova: ");
        for (int i=0;i<NUMERO_DE_QUESTOES;i++){
            System.out.println("Qual a resposta da "+(i+1)+"ª questão?");
            gabarito[i]=Character.toUpperCase(scan.next().charAt(0));
        }

        do {
            System.out.println("Aluno digite suas respostas.");
            for (int i=0;i<NUMERO_DE_QUESTOES;i++){
                System.out.println("Qual a resposta da "+(i+1)+"ª questão?");
                respostaAluno[i]=Character.toUpperCase(scan.next().charAt(0));
            }
            //===================== CORREÇÃO ==========================
            for (int i=0;i<NUMERO_DE_QUESTOES;i++) {
                if (respostaAluno[i]==gabarito[i])
                    numeroAcertos++;
            }
            System.out.println("Você acertou "+numeroAcertos+" questões.");
            if (numeroAcertos>maiorAcerto)
                maiorAcerto=numeroAcertos;
            if (numeroAcertos<menorAcerto)
                menorAcerto=numeroAcertos;
            mediaTurma+=numeroAcertos;
            totalAlunos++;
            numeroAcertos=0;


                System.out.println("Haverá outro aluno? S/N");
            continuar = Character.toUpperCase(scan.next().charAt(0));
        }while(continuar=='S');





        //====================== RESPOSTA ========================
        System.out.println("Gabarito da prova");
        for (int i=0;i<NUMERO_DE_QUESTOES;i++) {
            System.out.println("Quetão "+(i+1)+": "+gabarito[i]);
        }

        System.out.println("Total de alunos: "+totalAlunos);
        System.out.println("Menor número de acertos: "+menorAcerto);
        System.out.println("Maior número de acertos: "+maiorAcerto);
        System.out.println("Média das Notas: "+(mediaTurma/totalAlunos));

        System.out.println("\n\nFim do programa.");
    }
}
