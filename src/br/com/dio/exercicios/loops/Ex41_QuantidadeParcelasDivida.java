package br.com.dio.exercicios.loops;

import java.text.DecimalFormat;
import java.util.Random;
import java.util.Scanner;

/**
 * Faça um programa que receba o valor de uma dívida e mostre uma tabela com
 * os seguintes dados: valor da dívida, valor dos juros, quantidade de
 * parcelas e valor da parcela.
 * Os juros e a quantidade de parcelas seguem a tabela abaixo:
 * Quantidade de Parcelas  % de Juros sobre o valor inicial da dívida
 * 1       0
 * 3       10
 * 6       15
 * 9       20
 * 12      25
 * Exemplo de saída do programa:
 * Valor da Dívida Valor dos Juros Quantidade de Parcelas  Valor da Parcela
 * R$ 1.000,00     0               1                       R$  1.000,00
 * R$ 1.100,00     100             3                       R$    366,00
 * R$ 1.150,00     150             6                       R$    191,67
 *
 *  @author Victor S. S. Barros
 *  @version 1.0
 */

public class Ex41_QuantidadeParcelasDivida {
    private static final DecimalFormat df = new DecimalFormat("0.00");

    public static void main(String[] args) {
        final int NUMERO_LINHAS = 5, NUMERO_INFORMACOES = 2;
        int [][]tabelaJuros = new int[NUMERO_LINHAS][NUMERO_INFORMACOES];

        Random aleatorio = new Random();
        String mostarConjunto = "";
        double juros, valorInicialDivida;

        System.out.println("Programa que recebe o valor de uma dívida e mostra uma tabela com\n" +
                "os seguintes dados: valor da dívida, valor dos juros, quantidade de\n" +
                "parcelas e valor da parcela.\n");

        // =============== INICALIZANDO TABELA DE JUROS E VALOR DA DÍVIDA ================
        // número parcelas             juros
        tabelaJuros[0][0]=1;tabelaJuros[0][1]=0;
        tabelaJuros[1][0]=3;tabelaJuros[1][1]=10;
        tabelaJuros[2][0]=6;tabelaJuros[2][1]=15;
        tabelaJuros[3][0]=9;tabelaJuros[3][1]=20;
        tabelaJuros[4][0]=12;tabelaJuros[4][1]=25;
        valorInicialDivida = (double) aleatorio.nextDouble()*10000;
        //valorInicialDivida=1000; //****** PARA VERIFICAR SE ESTÁ IGUAL AO QUE FOI PEDIDO ********

        //======================== RESPOSTA ==========================
        System.out.println("Valor da Dívida \tValor dos Juros \tQuantidade de Parcelas  \tValor da Parcela");
        for (int i=0; i<NUMERO_LINHAS; i++){
            juros = valorInicialDivida*tabelaJuros[i][1]/100;
            System.out.println("R$ "+df.format(valorInicialDivida+juros)+
                    "\t\t\t"+df.format(juros)+
                    "\t\t\t\t"+tabelaJuros[i][0]+
                    "\t\t\t\t\t\t\t"+df.format((valorInicialDivida+juros)/tabelaJuros[i][0]));

            //valorInicialDívida+=juros;
        }


        System.out.println("\n\nFim do programa.");
    }
}
