package br.com.dio.exercicios.loops;

import java.util.Scanner;

/**
 * Faça um programa que peça dois números, base e expoente,
 * calcule e mostre o primeiro número elevado ao segundo número.
 * Não utilize a função de potência da linguagem.
 *
 * @author Victor S. S. Barros.
 * @version 1.0
 */
public class Ex13_Potencia {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int base, expoente, potencia=1;

        //===================== ENTRADA ================================
        System.out.println("Digite a base: ");
        base = scan.nextInt();
        System.out.println("Digite o expoente: ");
        expoente = scan.nextInt();

        //===================== CÁLCULO ================================
        for (int i=1; i<=expoente; i++){
            potencia *= base;
        }

        //===================== RESPOSTA ================================
        System.out.println("O número "+base+" elevado a "+expoente+" é: "+potencia);

        System.out.println("\n\nFim do programa.");
    }
}
