package br.com.dio.exercicios.loops;

/**
 * Supondo que a população de um país A seja da ordem de 80000 habitantes com
 * uma taxa anual de crescimento de 3% e que a população de B seja 200000
 * habitantes com uma taxa de crescimento de 1.5%. Faça um programa que calcule
 * e escreva o número de anos necessários para que a população do país A ultrapasse
 * ou iguale a população do país B, mantidas as taxas de crescimento.
 *
 *  @author Victor S. S. Barros
 *  @version 1.0
 */

public class Ex4_Populacao {
    public static void main(String[] args) {
        int populacaoA=80000, populacaoB=200000;
        float taxaDeCrescimentoA=3f, taxaDeCrescimentoB=1.5f;
        int anos=0;

        do {
            populacaoA += populacaoA * taxaDeCrescimentoA /100;
            populacaoB += populacaoB * taxaDeCrescimentoB /100;
            anos ++;
        }while (populacaoA <= populacaoB);

        System.out.println("Total de anos necessários para que a população do país A ultrapasse\n" +
                "ou iguale a população do país B: "+ anos);
        System.out.println("A população do país A é: "+ (int) populacaoA);
        System.out.println("A população do país B é: "+(int) populacaoB);
        System.out.println("\n\nFim do programa.");

    }
}
