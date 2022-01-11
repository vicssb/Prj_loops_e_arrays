package br.com.dio.exercicios.loops;

import java.util.Scanner;

/**
 * Faça um programa que leia 5 números e informe a soma e a média dos números.
 *
 *  @author Victor S. S. Barros
 *  @version 1.0
 */

public class Ex8_SomaMedia {
    public static void main(String[] args) {
        int soma=0, media=0;
        Scanner scan = new Scanner(System.in);

        for (int i=1; i<=5; i++){
            System.out.println("Digite o "+i+"º número: ");
            soma += scan.nextInt();
            media = soma/i;
        }
        System.out.println("A soma dos números é "+ soma +" e a média é "+ media);
        System.out.println("\n\nFim do programa.");
    }
}
