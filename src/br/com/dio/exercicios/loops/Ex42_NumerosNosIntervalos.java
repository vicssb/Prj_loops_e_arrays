package br.com.dio.exercicios.loops;

import java.util.Scanner;

/**
 * Faça um programa que leia uma quantidade indeterminada de números positivos
 * e conte quantos deles estão nos seguintes intervalos:
 * [0-25], [26-50], [51-75] e [76-100].
 * A entrada de dados deverá terminar quando for lido um número negativo.
 *
 *  @author Victor S. S. Barros
 *  @version 1.0
 */

public class Ex42_NumerosNosIntervalos {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numero, intervalo0_25=0, intervalo26_50=0, intervalo51_75=0, intervalo76_100=0;

        System.out.println("Programa que lê uma quantidade indeterminada de números positivos\n" +
                "e conta quantos deles estão nos seguintes intervalos:\n" +
                "[0-25], [26-50], [51-75] e [76-100].\n" +
                "A entrada de dados deverá terminar quando for lido um número negativo.");
        do {
            System.out.println("Digite um número positivo: ");
            numero = scan.nextInt();
            //======================= CÁLCULO ====================
            //======== [0-25] ============
            if ((numero>=0)&&(numero<=25))
                intervalo0_25++;
            //======== [26-50] ============
            if ((numero>=26)&&(numero<=50))
                intervalo26_50++;
            //======== [51-75] ============
            if ((numero>=51)&&(numero<=75))
                intervalo51_75++;
            //======== [76-100] ============
            if ((numero>=76)&&(numero<=100))
                intervalo76_100++;
        }while (numero>=0);

        //=========== RESPOSTA ===============================
        System.out.println("============================ RESPOSTA ===============================");
        System.out.println("Quantidade de números no intervalo [0-25] = "+intervalo0_25+"\n"+
                "Quantidade de números no intervalo [26-50] = "+intervalo26_50+"\n"+
                "Quantidade de números no intervalo [51-75] = "+intervalo51_75+"\n"+
                "Quantidade de números no intervalo [76-100] = "+ intervalo76_100);

        System.out.println("\n\nFim do programa.");
    }
}
