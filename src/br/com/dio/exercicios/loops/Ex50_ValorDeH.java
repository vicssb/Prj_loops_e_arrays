package br.com.dio.exercicios.loops;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Sendo H= 1 + 1/2 + 1/3 + 1/4 + ... + 1/N,
 * Faça um programa que calcule o valor de H com N termos.
 *
 *  @author Victor S. S. Barros
 *  @version 1.0
 */

public class Ex50_ValorDeH {
    private static final DecimalFormat df = new DecimalFormat("0.00");
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N;
        double H=0;

        System.out.println("Programa que calcule o valor de H com N termos.\n"+
                "Sendo H= 1 + 1/2 + 1/3 + 1/4 + ... + 1/N");

        //************ DEVERIA SER REALIZADA A VALIDAÇÃO DE NÃO NÚMERO ********
        //********* SERÁ ENSINADO MAIS A FRENTE ****************************
        do {
            System.out.println("Digite um valor inteiro maior que 0 para N:");
            N=scan.nextInt();
            if (N<0)
                System.out.println("Erro! Deve ser maior que 0.");
        }while(N<=0);

        //============ CÁLCULO ===================
        for (int i=1;i<=N;i++){
            H+= 1/(double)i;
        }

        System.out.println(df.format(H));

        System.out.println("\n\nFim do programa.");
    }
}
