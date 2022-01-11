package br.com.dio.exercicios.loops;

import java.util.Scanner;

/**
 * Desenvolva um programa que faça a tabuada de um número qualquer inteiro
 * que será digitado pelo usuário, mas a tabuada não deve necessariamente
 * iniciar em 1 e terminar em 10, o valor inicial e final devem ser informados
 * também pelo usuário, conforme exemplo abaixo:
 * Montar a tabuada de: 5
 * Começar por: 4
 * Terminar em: 7
 *
 * Vou montar a tabuada de 5 começando em 4 e terminando em 7:
 * 5 X 4 = 20
 * 5 X 5 = 25
 * 5 X 6 = 30
 * 5 X 7 = 35
 * Obs: Você deve verificar se o usuário não digitou o final menor que o inicial.
 *
 *  @author Victor S. S. Barros
 *  @version 1.0
 */

public class Ex36_Tabuada {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numero, valorInicial, valorFinal;
        String resposta="";

        System.out.println("Programa que monta a tabuada de um número qualquer inteiro\n" +
                "que será digitado pelo usuário, mas a tabuada não deve necessariamente\n" +
                "iniciar em 1 e terminar em 10, o valor inicial e final devem ser informados\n" +
                "também pelo usuário");
        //===================== ENTRADA ================================
        System.out.println("Digite um número inteiro para o valor da tabuada:");
        numero = scan.nextInt();
        do {
            System.out.println("Digite um número inteiro para o valor inicial da tabuada:");
            valorInicial = scan.nextInt();
            System.out.println("Digite um número inteiro para o valor final da tabuada:");
            valorFinal = scan.nextInt();

            if (valorFinal <= valorInicial)
                System.out.println("Erro! O valor final deve ser maior que o valor inicial!\n");

        }while (valorFinal <= valorInicial);

        //=============== ARRUMAÇÃO DO TEXTO DE RESPOSTA =============================
        resposta+="Montar a tabuada de: "+numero;
        resposta+= "\nComeçar por: "+ valorInicial;
        resposta+= "\nTerminar em: "+valorFinal+"\n";
        resposta+="\nVou montar a tabuada de "+numero+" começando em "+
                valorInicial+" e terminando em "+valorFinal+":\n";

        for (int i=valorInicial;i<=valorFinal;i++)
            resposta+=numero+" X "+i+" = "+numero*i+"\n";

        System.out.println(resposta);
        System.out.println("\n\nFim do programa.");
    }
}
