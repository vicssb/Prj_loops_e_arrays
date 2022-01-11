package br.com.dio.exercicios.loops;

import java.util.Scanner;

/**
 * Em uma eleição presidencial existem quatro candidatos. Os votos são informados por meio de código. Os códigos utilizados são:
 * 1 , 2, 3, 4  - Votos para os respectivos candidatos
 * (você deve montar a tabela ex: 1 - Jose/ 2- João/etc)
 * 5 - Voto Nulo
 * 6 - Voto em Branco
 * Faça um programa que calcule e mostre:
 * O total de votos para cada candidato;
 * O total de votos nulos;
 * O total de votos em branco;
 * A percentagem de votos nulos sobre o total de votos;
 * A percentagem de votos em branco sobre o total de votos. Para finalizar o conjunto de votos tem-se o valor zero.
 *
 *  @author Victor S. S. Barros
 *  @version 1.0
 */

public class Ex44_EleicaoPresidencial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int voto;
        int totalCandidato1=0, totalCandidato2=0,totalCandidato3=0,totalCandidato4=0,
            totalVotoNulo=0,totalVotoBranco=0, totalVotacao=0,
            percentagemVotosNulos, percentagemVotosBrancos;
        String resposta="O total de votos para cada candidato:\n";


        System.out.println("Programa que calcule e mostre:\n" +
                " * O total de votos para cada candidato;\n" +
                " * O total de votos nulos;\n" +
                " * O total de votos em branco;\n" +
                " * A percentagem de votos nulos sobre o total de votos;\n" +
                " * A percentagem de votos em branco sobre o total de votos. Para finalizar o conjunto de votos tem-se o valor zero.\n");

        System.out.println("Lista candidatos\n"+
                "1 - José\n"+
                "2 - Maria\n"+
                "3 - João\n"+
                "4 - Ricardo\n"+
                "5 - Voto Nulo\n" +
                "6 - Voto em Branco");
        //================= ENTRADA ==============================
        do {
            System.out.println("Para finalizar a votação tem-se o valor zero.");
            System.out.println("Digite seu voto: ");
            voto = scan.nextInt();
            if((voto<0)||(voto>6))
                System.out.println("Erro! Valor incorreto.");

            switch (voto) {
                case 1:
                    totalCandidato1++;
                    totalVotacao++;
                    break;
                case 2:
                    totalCandidato2++;
                    totalVotacao++;
                    break;
                case 3:
                    totalCandidato3++;
                    totalVotacao++;
                    break;
                case 4:
                    totalCandidato4++;
                    totalVotacao++;
                    break;
                case 5:
                    totalVotoNulo++;
                    totalVotacao++;
                    break;
                case 6:
                    totalVotoBranco++;
                    totalVotacao++;
                    break;
            }

        }while (voto!=0);
        //=========== CÁLCULOS ==================
        percentagemVotosNulos = totalVotoNulo*100/totalVotacao;
        percentagemVotosBrancos = totalVotoBranco*100/totalVotacao;

        //=================== RESPOSTA ===============================
        resposta+=("1 - José: "+totalCandidato1+
                "\n2 - Maria: "+totalCandidato2+
                "\n3 - João: "+totalCandidato3+
                "\n4 - Ricardo: "+totalCandidato4+
                "\n5 - Voto Nulo: " +totalVotoNulo+
                "\n6 - Voto em Branco: "+totalVotoBranco+
                "\nA percentagem de votos nulos: "+percentagemVotosNulos+"%"+
                "\nA percentagem de votos brancos: "+percentagemVotosBrancos+"%");

        System.out.println(resposta);

        System.out.println("\n\nFim do programa.");
    }
}
