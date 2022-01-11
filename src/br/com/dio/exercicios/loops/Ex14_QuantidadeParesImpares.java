package br.com.dio.exercicios.loops;

import java.util.Scanner;

/**
 * Faça um programa que peça 10 números inteiros,
 * calcule e mostre a quantidade de números pares
 * e a quantidade de números impares.
 *
 * @author Victor S. S. Barros.
 * @version 1.0
 */
public class Ex14_QuantidadeParesImpares {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int numero, quantidadePares=0, quantidadeImpares=0;

        //===================== ENTRADA ================================
        for (int i=1; i<=10; i++){
            System.out.println("Digite o "+i+"º número: ");
            numero = scan.nextInt();
            if (numero%2 == 0)
                quantidadePares++;
            else
                quantidadeImpares++;
        }


        //===================== RESPOSTA ================================
        System.out.println("A quantidade de números pares: "+quantidadePares);
        System.out.println("A quantidade de números impares: "+quantidadeImpares);


        System.out.println("\n\nFim do programa.");
    }
}
