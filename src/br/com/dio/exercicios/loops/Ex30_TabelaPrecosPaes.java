package br.com.dio.exercicios.loops;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * O Sr. Manoel Joaquim acaba de adquirir uma panificadora e pretende
 * implantar a metodologia da tabelinha, que já é um sucesso na sua
 * loja de 1,99. Você foi contratado para desenvolver o programa que
 * monta a tabela de preços de pães, de 1 até 50 pães, a partir do preço
 * do pão informado pelo usuário, conforme o exemplo abaixo:
 * Preço do pão: R$ 0.18
 * Panificadora Pão de Ontem - Tabela de preços
 * 1 - R$ 0.18
 * 2 - R$ 0.36
 * ...
 * 50 - R$ 9.00
 *
 *  @author Victor S. S. Barros
 *  @version 1.0
 */

public class Ex30_TabelaPrecosPaes {
    private static final DecimalFormat df = new DecimalFormat("0.00");

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double valor;

        System.out.println("Programa que monta uma tabela de preços de pães.\n");

        //========= LEITURA E VALIDAÇÃO DO PREÇO DO PÃO ====================
        do {
            System.out.println("\nDigite o preço do pão: ");
            valor = scan.nextDouble();
            if (valor <= 0)
                System.out.println("Erro! O valor deve ser maior que 0.\n");
        }while (valor<=0);

        //================== TABELA =======================
        System.out.println("Preço do pão: R$ "+df.format(valor));
        System.out.println("Panificadora Pão de Ontem - Tabela de preços");
        for (int i=1;i<=50;i++){
            System.out.println(i+" - R$ "+df.format(i*valor));
        }

        System.out.println("\n\nFim do programa.");
    }
}
