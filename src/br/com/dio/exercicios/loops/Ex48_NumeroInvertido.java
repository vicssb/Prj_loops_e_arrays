package br.com.dio.exercicios.loops;

import java.util.Scanner;

/**
 * Faça um programa que peça um numero inteiro positivo e em seguida mostre este numero invertido.
 * Exemplo:
 *   12376489
 *   => 98467321
 *
 *  @author Victor S. S. Barros
 *  @version 1.0
 */

public class Ex48_NumeroInvertido {
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
