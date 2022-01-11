package br.com.dio.exercicios.loops;

import java.util.Scanner;

/**
 * Faça um programa que calcule o mostre a média aritmética de N notas.
 *
 *  @author Victor S. S. Barros
 *  @version 1.0
 */

public class Ex24_MediaNotas {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int quantidadeNota;
        Double soma=0.0, media;

        System.out.println("Programa que calcula e mostra a média aritmética de N notas.");

        //===================== ENTRADA ================================
        do {
            System.out.println("Digite a quantidade de notas: ");
            quantidadeNota = scan.nextInt();

            if (quantidadeNota < 1)
                System.out.println("Erro! A quantidade deve ser maior que 0.\n");

        }while ((quantidadeNota<1));

        //========= LEITURA DAS NOTAS ====================
        for (int i=1;i<=quantidadeNota;i++){
            System.out.println("Digite a "+i+"ª nota: ");
            soma += scan.nextDouble();
        }
        //============= CÁLCULO =========================
        media = (soma/quantidadeNota);

        //============ RESPOSTA =========================================
        System.out.println("A média é: "+media);

        System.out.println("\n\nFim do programa.");
    }
}
