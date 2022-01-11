package br.com.dio.exercicios.loops;

import java.util.Scanner;

/**
 * Altere o programa de cálculo do fatorial, permitindo ao usuário calcular o fatorial
 * várias vezes e limitando o fatorial a números inteiros positivos e menores que 16.
 *
 * @author Victor S. S. Barros.
 * @version 1.0
 */
public class Ex20_Fatorial_V2 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int numero, fatorial=1;
        char resposta='s';

        do {
            //===================== ENTRADA ================================
            System.out.println("Digite o número para cálcular o fatorial: ");
            numero = scan.nextInt();

            System.out.print(numero+"! = ");

            //===================== CÁLCULO ================================
            for (int i=numero; i>0; i--){
                System.out.print(i);
                fatorial *= i;
                if (i > 1 )// para não imprimir ',' no final
                    System.out.print(".");
            }
            System.out.println(" = "+fatorial);
            System.out.println("Deseja cálcular outro valor? S ou N");
            resposta =scan.next().charAt(0);
        }while((resposta == 's')||(resposta == 'S'));


        System.out.println("\n\nFim do programa.");
    }
}

