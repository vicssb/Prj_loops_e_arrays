package br.com.dio.exercicios.loops;

import java.util.Scanner;

/**
 * Faça um programa que mostre os n termos da Série a seguir:
 *   S = 1/1 + 2/3 + 3/5 + 4/7 + 5/9 + ... + n/m.
 * Imprima no final a soma da série.
 *
 *  @author Victor S. S. Barros
 *  @version 1.0
 */

public class Ex49_TermosDaSerie {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int nota;

        do {
            System.out.println("Digite uma nota, entre zero e dez: ");
            nota = scan.nextInt();
        }while ((nota<0)||(nota>10));

        System.out.println("\n\nFim do programa.");
    }
}
