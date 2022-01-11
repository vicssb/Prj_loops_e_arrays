package br.com.dio.exercicios.loops;

import java.util.Scanner;

/**
 * Faça um programa que leia 5 números e informe o maior número.
 *
 *  @author Victor S. S. Barros
 *  @version 1.0
 */

public class Ex7_MaiorDeCincoNumeros {
    public static void main(String[] args) {
        int numero, maior;
        Scanner scan = new Scanner(System.in);

        // ============== para poder receber números negativos ===============
        System.out.println("Digite o 1º número: ");
        numero = scan.nextInt();
        maior=numero;
        //====================================================================
        for (int i=2; i<=5; i++){
            System.out.println("Digite o "+i+"º número: ");
            numero = scan.nextInt();
            if (numero > maior)
                maior = numero;
        }
        System.out.println("O maior número é: "+ maior);
        System.out.println("\n\nFim do programa.");
    }

}
