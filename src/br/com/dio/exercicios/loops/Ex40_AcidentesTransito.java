package br.com.dio.exercicios.loops;

import java.text.DecimalFormat;
import java.util.Random;
import java.util.Scanner;

/**
 * Foi feita uma estatística em cinco cidades brasileiras para coletar dados sobre
 * acidentes de trânsito. Foram obtidos os seguintes dados:
 * Código da cidade;
 * Número de veículos de passeio (em 1999);
 * Número de acidentes de trânsito com vítimas (em 1999). Deseja-se saber:
 * Qual o maior e menor índice de acidentes de transito e a que cidade pertence;
 * Qual a média de veículos nas cinco cidades juntas;
 * Qual a média de acidentes de trânsito nas cidades com menos de 2.000 veículos de passeio.
 *
 * @author Victor S. S. Barros
 * @version 1.0
 */

public class Ex40_AcidentesTransito {
    private static final DecimalFormat df = new DecimalFormat("0.00");

    public static void main(String[] args) {
        final int NUMERO_CIDADES = 5, NUMERO_INFORMACOES = 3;
        int [][]conjunto = new int[NUMERO_CIDADES][NUMERO_INFORMACOES];
        Random aleatorio = new Random();
        String mostarConjunto = "";
        int indiceMaisAlto = 0, indiceMaisBaixo = 100000;// valores iniciais extremos
        int codigoIndiceMaisAlto = 0, codigoIndiceMaisBaixo = 0, numeroCidadesMenos2000 = 0;
        double mediaAcidentes = 0, mediaVeiculos = 0;

        //********* PODERIA UTILIZAR UMA CLASSE PARA CIDADE *************
        //********* SERÁ ENSINADO EM ORIENTAÇÃO A OBJETO ****************************

        System.out.println("Foi feita uma estatística em cinco cidades brasileiras para coletar dados sobre\n" +
                "acidentes de trânsito. Foram obtidos os seguintes dados:\n" +
                "  Código da cidade;\n" +
                "  Número de veículos de passeio (em 1999);\n" +
                "  Número de acidentes de trânsito com vítimas (em 1999). \nDeseja-se saber:\n" +
                " * Qual o maior e menor índice de acidentes de transito e a que cidade pertence;\n" +
                " * Qual a média de veículos nas cinco cidades juntas;\n" +
                " * Qual a média de acidentes de trânsito nas cidades com menos de 2.000 veículos de passeio.");

        //=========== CRIAÇÃO DO CONJUNTO ALEATÓRIO ===================
        //=========== PODERIA SER LIDO DE UM ARQUIVO =====================
        mostarConjunto += ("\nOs " + NUMERO_CIDADES + " conjuntos de " + NUMERO_INFORMACOES + " informções lidos: ");
        for (int i = 0; i < NUMERO_CIDADES; i++) {
            // gera um número aleatório
            conjunto[i][0] = aleatorio.nextInt(100);//codigo
            conjunto[i][1] = aleatorio.nextInt(5000);//Número de veiculos
            conjunto[i][2] = aleatorio.nextInt(20000);//indice acidentes
        }
        //================ MOSTRA OS CONJUNTOS GERADOS =================
        for (int i = 0; i < NUMERO_CIDADES; i++)
            mostarConjunto += conjunto[i][0] + "; " +
                    conjunto[i][1] + "; " +
                    conjunto[i][2] + "  /  ";
        System.out.println(mostarConjunto);

        //===================== CÁLCULO ================================
        for (int i = 0; i < NUMERO_CIDADES; i++) {
            //indice acidentes
            if (conjunto[i][2] > indiceMaisAlto) {
                indiceMaisAlto = conjunto[i][2];
                codigoIndiceMaisAlto = conjunto[i][0];
            }
            if (conjunto[i][2] < indiceMaisBaixo) {
                indiceMaisBaixo = conjunto[i][2];
                codigoIndiceMaisBaixo = conjunto[i][0];
            }
            //média de acidentes de trânsito nas cidades com menos de 2.000 veículos
            if (conjunto[i][1] < 2000) {
                mediaAcidentes += conjunto[i][2];
                numeroCidadesMenos2000++;
            }

            //Número de veiculos
            mediaVeiculos += conjunto[i][1];
        }

        //=========== RESPOSTAS ===============================
        System.out.println("\nO maior índice de acidentes de transito: " + indiceMaisAlto +
                " e pertence a cidade com código: " + codigoIndiceMaisAlto);
        System.out.println("O menor índice de acidentes de transito: " + indiceMaisBaixo +
                " e pertence a cidade com código: " + codigoIndiceMaisBaixo);
        System.out.println("A média de veículos nas cinco cidades juntas: " +
                df.format(mediaVeiculos / NUMERO_CIDADES));
        if (numeroCidadesMenos2000 == 0)
            System.out.println("Não há cidades com menos de 2000 veículos de passeio.");
        else
            System.out.println("A média de acidentes de trânsito na(s) " + numeroCidadesMenos2000 +
                " cidade(s) com menos de 2.000 veículos: " +
                    df.format(mediaAcidentes / numeroCidadesMenos2000));

        System.out.println("\n\nFim do programa.");
    }
}
