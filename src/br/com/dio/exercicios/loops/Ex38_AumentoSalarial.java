package br.com.dio.exercicios.loops;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Um funcionário de uma empresa recebe aumento salarial anualmente: Sabe-se que:
 *
 * Esse funcionário foi contratado em 1995, com salário inicial de R$ 1.000,00;
 *
 * Em 1996 recebeu aumento de 1,5% sobre seu salário inicial;
 *
 * A partir de 1997 (inclusive), os aumentos salariais sempre correspondem ao dobro
 * do percentual do ano anterior. Faça um programa que determine o salário atual
 * desse funcionário. Após concluir isto, altere o programa permitindo que o usuário
 * digite o salário inicial do funcionário.
 *
 *  @author Victor S. S. Barros
 *  @version 1.0
 */

public class Ex38_AumentoSalarial {
    private static final DecimalFormat df = new DecimalFormat("0.00");

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int anoInicial=1995, ano;
        double salarioInicial=1000, salarioAtual, taxaAumento=1.5, aumento;
        char evolucao;

        System.out.println("Programa que determina o salário atual desse funcionário.");
        //======= aumento de 1996 ===========
        aumento = (salarioInicial*taxaAumento/100);
        salarioAtual=salarioInicial+aumento;
        //======= aumento a partir de 1997 ===========
        System.out.println("Deseja imprimi a evolução anual do salário? S/N");
        evolucao = scan.next().charAt(0);
        evolucao= Character.toUpperCase(evolucao);
        for (ano=1997;ano<=2022;ano++){
            taxaAumento*=2;
            aumento =(salarioInicial*taxaAumento/100);
            salarioAtual=salarioInicial+aumento;
            if (evolucao == 'S')
                System.out.println("Ano: "+ano+
                        " - Taxa: "+df.format(taxaAumento)+
                        " % - Salário anterior: R$ "+df.format(salarioInicial)+
                        " - Aumento: R$ "+df.format(aumento)+
                        " - Salário atual: R$ "+df.format(salarioAtual));
            salarioInicial=salarioAtual;
            salarioInicial=salarioAtual;
        }
        if (evolucao != 'S')
            System.out.println("Ano: "+(ano-1)+
                    " - Taxa de aumento atual: "+df.format(taxaAumento)+
                    " % - Salário atual: R$ "+df.format(salarioAtual));

        System.out.println("\n\nFim do programa.");
    }
}
