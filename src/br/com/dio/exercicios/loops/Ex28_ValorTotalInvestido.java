package br.com.dio.exercicios.loops;

import java.util.Scanner;

/**
 * Faça um programa que calcule o valor total investido por
 * um colecionador em sua coleção de CDs e o valor médio
 * gasto em cada um deles. O usuário deverá informar a
 * quantidade de CDs e o valor para em cada um.
 *
 *  @author Victor S. S. Barros
 *  @version 1.0
 */

public class Ex28_ValorTotalInvestido {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int quantidadeCDs;
        double valor, media=0;

        System.out.println("Programa que calcula o valor total investido por\n" +
                " um colecionador em sua coleção de CDs e o valor médio\n" +
                " gasto em cada um deles. O usuário deverá informar a\n" +
                " quantidade de CDs e o valor para em cada um.");
        //========= LEITURA E VALIDAÇÃO DA QUANTIDADE DE TURMAS ====================
        do {
            System.out.println("\nDigite quantidade de CDs: ");
            quantidadeCDs = scan.nextInt();
            if (quantidadeCDs < 1)
                System.out.println("Erro! A quantidade deve ser maior que 0.\n");
        }while (quantidadeCDs<1);

        //========= LEITURA E VALIDAÇÃO DA QUANTIDADE DO VALOR DE CADA CD ====================
        for (int i=1;i<=quantidadeCDs;i++) {
            do {
                System.out.println("Digite o valor do " + i + "ª CD:");
                valor = scan.nextDouble();
                if (valor < 0)
                    System.out.println("Erro! O valor deve ser maior que 0.\n");
            } while (valor < 0);
            media += valor;
        }
        media = media/quantidadeCDs;
        //========== A FORMATAÇÃO DO NÚMERO SERÁ ENSINADA MAIS A FRENTE ================
        System.out.println("O valor médio gasto em cada CD é: R$ "+media);

        System.out.println("\n\nFim do programa.");
    }
}
