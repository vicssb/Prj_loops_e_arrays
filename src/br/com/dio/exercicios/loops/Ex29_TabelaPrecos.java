package br.com.dio.exercicios.loops;

import java.text.DecimalFormat;

/**
 * O Sr. Manoel Joaquim possui uma grande loja de artigos de R$ 1,99,
 * com cerca de 10 caixas. Para agilizar o cálculo de quanto cada cliente
 * deve pagar ele desenvolveu um tabela que contém o número de itens que
 * o cliente comprou e ao lado o valor da conta. Desta forma a atendente
 * do caixa precisa apenas contar quantos itens o cliente está levando e
 * olhar na tabela de preços. Você foi contratado para desenvolver o programa
 * que monta esta tabela de preços, que conterá os preços de 1 até 50 produtos,
 * conforme o exemplo abaixo:
 * Lojas Quase Dois - Tabela de preços
 * 1 - R$ 1.99
 * 2 - R$ 3.98
 * ...
 * 50 - R$ 99.50
 *
 *  @author Victor S. S. Barros
 *  @version 1.0
 */

public class Ex29_TabelaPrecos {
    private static final DecimalFormat df = new DecimalFormat("0.00");

    public static void main(String[] args) {
        System.out.println("Programa que monta uma tabela de preços para loja 1,99\n");

        System.out.println("Lojas Quase Dois - Tabela de preços");
        for (int i=1;i<=50;i++){
            System.out.print(i+" - R$ "+df.format(i*1.99) + "\n");
        }

        System.out.println("\n\nFim do programa.");
    }
}
