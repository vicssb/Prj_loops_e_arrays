package br.com.dio.exercicios.loops;

import java.util.Scanner;

/**
 * Sendo H= 1 + 1/2 + 1/3 + 1/4 + ... + 1/N,
 * Faça um programa que calcule o valor de H com N termos.
 *
 *  @author Victor S. S. Barros
 *  @version 1.0
 */

public class Ex50_ValorDeH {
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
