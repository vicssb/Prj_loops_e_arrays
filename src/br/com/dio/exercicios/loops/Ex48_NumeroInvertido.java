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
        int inteiro;
        String numero, resposta="";

        System.out.println("Programa que peça um numero inteiro positivo e em seguida mostre este numero invertido.\n" +
                " * Exemplo:\n" +
                " *   12376489\n" +
                " *   => 98467321");
        //===================== ENTRADA ================================
        //************ DEVERIA SER REALIZADA A VALIDAÇÃO DE NÃO NÚMERO ********

        do {
            System.out.println("Digite um número inteiro positivo:");
            inteiro = scan.nextInt();

            if (inteiro<0)
                System.out.println("Erro! O número deve um inteiro positivo!\n");


        }while (inteiro<0) ;

        numero= Integer.toString(inteiro);
        for (int i=numero.length()-1; i>=0;i--){
            resposta += numero.charAt(i);
        };

        System.out.println("O numero "+ inteiro+" invertido: "+resposta);

        System.out.println("\n\nFim do programa.");
    }
}
