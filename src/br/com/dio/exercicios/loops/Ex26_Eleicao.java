package br.com.dio.exercicios.loops;

import java.util.Scanner;

/**
 * Numa eleição existem três candidatos. Faça um programa que peça o número
 * total de eleitores. Peça para cada eleitor votar e ao final mostrar o
 * número de votos de cada candidato.
 *
 *  @author Victor S. S. Barros
 *  @version 1.0
 */

public class Ex26_Eleicao {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numeroEleitores=0, votosCandidatoA=0, votosCandidatoB=0, votosCandidatoC=0;
        char voto;

        System.out.println("Programa que pede o número\n" +
                "total de eleitores. Peça para cada eleitor votar e ao final mostrar o\n" +
                "número de votos de cada candidato.");

        do {
            System.out.println("\nDigite a quantidade de eleitores: ");
            numeroEleitores = scan.nextInt();

            if (numeroEleitores < 1)
                System.out.println("Erro! A quantidade deve ser maior que 0.\n");

        }while ((numeroEleitores<1));

        for (int i=1;i<=numeroEleitores;i++){
            //============= VALIDAÇÃO DO VOTO =================
            boolean valido=false;
            do {
                System.out.println("Vote no seu candidato: A, B ou C:");
                voto = scan.next().charAt(0);
                voto = Character.toUpperCase(voto);
                switch (voto){
                    case 'A':
                        votosCandidatoA++;
                        valido=true;
                        break;
                    case  'B':
                        votosCandidatoB++;
                        valido=true;
                        break;
                    case 'C':
                        votosCandidatoC++;
                        valido=true;
                        break;
                    default:
                        System.out.println("Erro! O candidato: A, B ou C.\n");
                }
            }while (!valido);
        }

        //======================= RESPOSTA ===================
        System.out.println("Número de votos do candiato A: "+votosCandidatoA);
        System.out.println("Número de votos do candiato B: "+votosCandidatoB);
        System.out.println("Número de votos do candiato C: "+votosCandidatoC);

        //************ NÃO ESTÁ SENDO CONSIDERADO O EMPATE ***********************
        if ((votosCandidatoA>votosCandidatoB)&&(votosCandidatoA>votosCandidatoC))
            System.out.println("O candidato A venceu!");
        else if(votosCandidatoB>votosCandidatoC)
            System.out.println("O candidato B venceu!");
        else
            System.out.println("O candidato C venceu!");

        System.out.println("\n\nFim do programa.");
    }
}
