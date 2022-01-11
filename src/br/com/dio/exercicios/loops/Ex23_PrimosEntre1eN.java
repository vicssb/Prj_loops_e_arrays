package br.com.dio.exercicios.loops;

import java.util.Scanner;

/**
 * Faça um programa que mostre todos os primos entre 1 e N
 * sendo N um número inteiro fornecido pelo usuário. O programa
 * deverá mostrar também o número de divisões que ele executou
 * para encontrar os números primos. Serão avaliados o funcionamento,
 * o estilo e o número de testes (divisões) executados.
 *
 *  @author Victor S. S. Barros
 *  @version 1.0
 */

public class Ex23_PrimosEntre1eN {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numeroN, numeroDeDivisoes=0;
        String resposta="Números primos entre 1 e ";

        System.out.println("Programa que mostra todos os primos entre 1 e N.");

        //===================== ENTRADA ================================
        do {
            System.out.println("Digite um número para N:");
            numeroN = scan.nextInt();

            if (numeroN < 1)
                System.out.println("Erro! O número deve ser maior que 1!\n");

        }while ((numeroN<1));

        resposta += numeroN+":\n2 ";

        //===================== CÁLCULO ================================
        for (int numeroParaTeste=2; numeroParaTeste<=numeroN; numeroParaTeste++){
            //===================== CÁLCULO PARA SABER SE É PRIMO ================================
            //********************** DEVERIA SER UM FUNÇÃO! SERÁ ENSINADO **********************
            int i = 2;
            boolean continuar = true, primo = true;
            do {
                numeroDeDivisoes++;
                if (numeroParaTeste % i == 0) {
                    continuar = false;
                    primo = false;
                }
                numeroDeDivisoes++;
                // A partir da metade do número, não precisamos mais testar
                if (i > (numeroParaTeste / 2))
                    continuar = false;
                i++;
            } while (continuar);

            //=============== ARRUMAÇÃO DO TEXTO DE RESPOSTA =============================
            if (primo)
                    resposta += numeroParaTeste + " ";

        }

        System.out.println(resposta);
        System.out.println("\nNúmero de divisoes:"+numeroDeDivisoes);

        System.out.println("\n\nFim do programa.");
    }
}
