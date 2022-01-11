package br.com.dio.exercicios.loops;

import java.util.Scanner;

/**
 * A série de Fibonacci é formada pela seqüência 0,1,1,2,3,5,8,13,21,34,55,...
 * Faça um programa que gere a série até que o valor seja maior que 500.
 *
 * @author Victor S. S. Barros.
 * @version 1.0
 */
public class Ex16_FibonacciAte500 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int enesimo, posicao1=1, posicao2=1, novo;
        boolean repetir=true;

        //===================== RESPOSTA 1================================
        System.out.println("A série de Fibonacci até que o valor seja maior que 500: ");
        System.out.print("1, 1, ");

        //===================== CÁLCULO ================================
        do {
            novo = posicao1 + posicao2;
            posicao1 = posicao2;
            posicao2 = novo;
            if (novo > 500)
                repetir = false;

            //===================== RESPOSTA 2================================
            System.out.print(novo);

            if (repetir)// para não imprimir ',' no final
                System.out.print(", ");
        }while(repetir);


        System.out.println("\n\nFim do programa.");
    }
}
