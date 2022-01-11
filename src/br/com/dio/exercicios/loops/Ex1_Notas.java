package br.com.dio.exercicios.loops;

import java.util.Scanner;

/**
 * 1 -Faça um programa que peça uma nota, entre zero e dez.
 * Mostre uma mensagem caso o valor seja inválido e continue pedindo
 * até que o usuário informe um valor válido.
 *
 *  @author Victor S. S. Barros
 *  @version 1.0
 */

public class Ex1_Notas {
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
