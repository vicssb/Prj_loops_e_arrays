package br.com.dio.exercicios.loops;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Faça um programa que mostre os n termos da Série a seguir:
 *   S = 1/1 + 2/3 + 3/5 + 4/7 + 5/9 + ... + n/m.
 * Imprima no final a soma da série.
 *
 *  @author Victor S. S. Barros
 *  @version 1.0
 */

public class Ex51_TermosDaSerie {
    private static final DecimalFormat df=new DecimalFormat("0.00");
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N, denominador=1;
        double S=1;
        String resposta="S = 1/1";

        System.out.println("Programa que mostre os N termos da Série a seguir:\n" +
                " S = 1/1 + 2/3 + 3/5 + 4/7 + 5/9 + ... + n/m.\n" +
                " Imprima no final a soma da série.\n");
        //************ DEVERIA SER REALIZADA A VALIDAÇÃO DE NÃO NÚMERO ********
        //********* SERÁ ENSINADO MAIS A FRENTE ****************************
        do {
            System.out.println("Digite um valor inteiro maior que 0 para N:");
            N=scan.nextInt();
            if (N<0)
                System.out.println("Erro! Deve ser maior que 0.");
        }while(N<=0);

        //============ CÁLCULO ===================
        for (int i=1;i<N;i++){
            denominador += 2;
            S+= (double) (i+1)/(double) denominador;
            resposta+=(" + "+(i+1)+"/"+denominador);
        }

        //====================== RESPOSTA ==================
        resposta+=(" = "+df.format(S));
        System.out.println(resposta);

        System.out.println("\n\nFim do programa.");
    }
}
