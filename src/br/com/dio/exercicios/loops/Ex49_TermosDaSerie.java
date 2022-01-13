package br.com.dio.exercicios.loops;

import java.util.Scanner;

/**
 * Faça um programa que mostre os n termos da Série a seguir:
 *   S = 1/1 + 2/3 + 3/5 + 4/7 + 5/9 + ... + n/m.
 * Imprima no final a soma da série.
 *
 *  @author Victor S. S. Barros
 *  @version 1.0
 */

public class Ex49_TermosDaSerie {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n=1, m=1, N=0;
        String in, resposta="S = ";

        System.out.println("Programa que mostre os n termos da Série a seguir:\n" +
                " S = 1/1 + 2/3 + 3/5 + 4/7 + 5/9 + ... + n/m.\n" +
                " Imprima no final a soma da série.");

        //************ DEVERIA SER REALIZADA A VALIDAÇÃO DE NÃO NÚMERO ********
        //********* SERÁ ENSINADO MAIS A FRENTE ****************************
        do {
            System.out.println("Digite um valor inteiro maior que 0 para N:");
            N=scan.nextInt();
            if (N<0)
                System.out.println("Erro! Deve ser maior que 0.");
        }while(N<=0);

        for (int i=1;i<=N;i++){
            if (i!=N)
                resposta+= n+"/"+m+" + ";
            else
                resposta+= n+"/"+m;
            n++;
            m = m+2;
        }

        System.out.println(resposta);

        System.out.println("\n\nFim do programa.");
    }
}
