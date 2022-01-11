package br.com.dio.exercicios.loops;

import java.util.Scanner;

/**
 * Faça um programa que, dado um conjunto de N números,
 * determine o menor valor, o maior valor e a soma dos valores.
 *
 * @author Victor S. S. Barros.
 * @version 1.0
 */
public class Ex18_MaiorMenorSoma {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int quantidade=0, numero, maior, menor, soma=0;

        System.out.println("Programa que, dado um conjunto de N números,\n" +
                "determine o menor valor, o maior valor e a soma dos valores.");


        //=========== CRIAÇÃO DO CONJUNTO ALEATÓRIO ===================
        //=========== PODERIA SER LIDO DE UM ARQUIVO =====================
        final int TAMANHO=4;
        int conjunto[]=new int[TAMANHO];
        String mostarConjunto="";

        for (int i=0; i<TAMANHO; i++)
            // gera um número inteiro aleatório no intervalo de 0 até 1000
            conjunto[i] = (int)Math.round(Math.random() * 1000);

        mostarConjunto+=("O conjunto de "+TAMANHO+" números lido é: ");
        for (int i=0; i<TAMANHO; i++)
            if(i!=TAMANHO-1)
                mostarConjunto+=conjunto[i]+", ";
            else
                mostarConjunto+=conjunto[i]+". ";

        System.out.println(mostarConjunto);

        //===================== CÁLCULO ================================
        numero = conjunto[0];

        soma += numero;
        maior = numero;
        menor = numero;

        for (int i=1; i<TAMANHO; i++){
            numero = conjunto[i];

            soma += numero;
            if (numero > maior)
                maior = numero;
            if (numero < menor)
                menor = numero;
        }
        //===================== RESPOSTA ================================
        System.out.println("Maior = "+maior+", Menor = "+menor+" e Soma = "+soma);

        System.out.println("\n\nFim do programa.");
    }
}
