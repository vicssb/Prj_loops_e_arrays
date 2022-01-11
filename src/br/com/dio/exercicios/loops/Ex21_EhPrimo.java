package br.com.dio.exercicios.loops;

import java.util.Scanner;

/**
 *Faça um programa que peça um número inteiro e determine se ele é ou não um
 * número primo. Um número primo é aquele que é divisível somente por ele mesmo e por 1.
 *
 * @author Victor S. S. Barros.
 * @version 1.0
 */
public class Ex21_EhPrimo {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int numero;
        boolean continuar=true, primo=true ;

        System.out.println("Programa que peça um número inteiro e determine se ele é ou não um número primo.");
        //===================== ENTRADA ================================
        do {
            System.out.println("Digite um número para saber se é primo:");
            numero = scan.nextInt();

            if (numero <= 1)
                System.out.println("Erro! O número deve ser maior que 1!\n");

        }while ((numero<2));

        //===================== CÁLCULO ================================
        int i=2;
        do {
            if (numero%i == 0) {
                continuar = false;
                primo = false;
            }
            // A partir da metade do número, não precisamos mais testar
            if (i > (numero/2))
                continuar = false;
            i++;
        }while (continuar);
        if (numero==2)
            primo = true;

        //===================== RESPOSTA ================================
        if (primo)
            System.out.println("\nO número "+numero+" é primo.");
        else
            System.out.println("\nO número "+numero+" não é primo.");

        System.out.println("\n\nFim do programa.");
    }
}

