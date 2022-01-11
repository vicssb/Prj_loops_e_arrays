package br.com.dio.exercicios.loops;

import java.util.Scanner;

/**
 * Faça um programa que receba dois números inteiros e
 * gere os números inteiros que estão no intervalo compreendido por eles.
 *
 * @author Victor S. S. Barros
 * @version 1.0
 */
public class Ex10_NumerosEntreOIntervalo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num1,num2,aux;

        //===================== ENTRADA ================================
        System.out.println("Digite o 1º número: ");
        num1 = scan.nextInt();
        System.out.println("Digite o 2º número: ");
        num2 = scan.nextInt();

        //===================== COLOCAR EM ORDEM ================================
        if (num1>num2){
            aux = num2;
            num2 = num1;
            num1 = aux;
        }
        //===================== MOSTRAR OS NÚMEROS ================================
        System.out.println("Os números entre "+num1+" e "+num2+" são:");
        for (int i=num1+1; i<num2; i++){
            System.out.print(i);
            if(i!=num2-1)// para não imprimir ',' no final
                System.out.print(", ");
        }


        System.out.println("\n\nFim do programa.");
    }
}
