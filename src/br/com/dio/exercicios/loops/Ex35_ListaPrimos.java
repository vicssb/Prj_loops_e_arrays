package br.com.dio.exercicios.loops;

import java.util.Scanner;

/**
 * Encontrar números primos é uma tarefa difícil. Faça um programa
 * que gera uma lista dos números primos existentes entre 1 e
 * um número inteiro informado pelo usuário.
 *
 * @author Victor S. S. Barros.
 * @version 1.0
 */

public class Ex35_ListaPrimos {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numeroN;
        String resposta="Números primos entre 1 e ";

        System.out.println("Programa que mostra todos os primos entre 1 e N.");

        //===================== ENTRADA ================================
        do {
            System.out.println("Digite um número para N:");
            numeroN = scan.nextInt();

            if (numeroN <= 1)
                System.out.println("Erro! O número deve ser maior que 1!\n");

        }while ((numeroN<=1));

        resposta += numeroN+":\n2 ";

        //===================== CÁLCULO ================================
        for (int numeroParaTeste=2; numeroParaTeste<=numeroN; numeroParaTeste++){
            //===================== CÁLCULO PARA SABER SE É PRIMO ================================
            //********************** DEVERIA SER UM FUNÇÃO! SERÁ ENSINADO **********************
            int i = 2;
            boolean continuar = true, primo = true;
            do {
                if (numeroParaTeste % i == 0) {
                    continuar = false;
                    primo = false;
                }
                // A partir da metade do número, não precisamos mais testar
                if (i > (numeroParaTeste / 2))
                    continuar = false;
                i++;
            } while (continuar);

            //=============== ARRUMAÇÃO DO TEXTO DE RESPOSTA =============================
            if (primo)
                if (numeroParaTeste!=numeroN-1)
                    resposta += numeroParaTeste + " ";
                else {
                    // para imprimir 'e' e '.' no final
                    int tamanhoResposta = resposta.length();
                    resposta = resposta.substring(0, tamanhoResposta - 2)+" e "+numeroParaTeste+".";
                }
        }

        System.out.println(resposta);

        System.out.println("\n\nFim do programa.");
    }
}

