package br.com.dio.exercicios.loops;

import java.util.Scanner;

/**
 * Faça um programa que calcule o fatorial de um número inteiro
 * fornecido pelo usuário. Ex.: 5!=5.4.3.2.1=120.
 * A saída deve ser conforme o exemplo abaixo:
 * Fatorial de: 5
 * 5! =  5 . 4 . 3 . 2 . 1 = 120
 *
 *  @author Victor S. S. Barros
 *  @version 1.0
 */

public class Ex32_Fatorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numero, fatorial=1;
        String resposta="Fatorial de: ";

        System.out.println("Programa que calcule o fatorial de um número inteiro\n" +
                "fornecido pelo usuário\n");
        //========= LEITURA E VALIDAÇÃO DO NÚMERO ====================
        do {
            System.out.println("Digite o número para cálcular o fatorial: ");
            numero = scan.nextInt();
            if (numero < 2)
                System.out.println("Erro! O valor deve ser maior que 1.\n");
        }while (numero<2);

        resposta += numero+"\n";
        //============== CÁLCULO =========================
        for (int i=numero; i>1; i--) {
            resposta += i+" . ";
            fatorial *= i;
        }

        resposta += "1 = "+fatorial;
        System.out.println(resposta);
        System.out.println("\n\nFim do programa.");
    }
}
