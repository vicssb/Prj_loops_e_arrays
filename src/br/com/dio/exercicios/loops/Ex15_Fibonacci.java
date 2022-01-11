package br.com.dio.exercicios.loops;

import java.util.Scanner;

/**
 * A série de Fibonacci é formada pela seqüência 1,1,2,3,5,8,13,21,34,55,...
 * Faça um programa capaz de gerar a série até o n−ésimo termo.
 *
 * @author Victor S. S. Barros.
 * @version 1.0
 */
public class Ex15_Fibonacci {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int enesimo, posicao1=1, posicao2=1, novo;

        //===================== ENTRADA ================================
        System.out.println("Digite a quantidade de termos para a série: ");
        enesimo = scan.nextInt();

        //===================== RESPOSTA 1================================
        System.out.println("A série de Fibonacci com "+enesimo+" termos: ");
        System.out.print("1, 1, ");

        //===================== CÁLCULO ================================
        for (int i=1; i<=enesimo-2; i++) {
            novo = posicao1 + posicao2;
            posicao1 = posicao2;
            posicao2 = novo;

            //===================== RESPOSTA 2================================
            System.out.print(novo);
            if (i != enesimo - 2)// para não imprimir ',' no final
                System.out.print(", ");
        }

        System.out.println("\n\nFim do programa.");
    }
}
