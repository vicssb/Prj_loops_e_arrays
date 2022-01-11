package br.com.dio.exercicios.loops;

import java.text.DecimalFormat;
import java.util.Random;
import java.util.Scanner;

/**
 * Faça um programa que leia dez conjuntos de dois valores,
 * o primeiro representando o número do aluno e o segundo
 * representando a sua altura em centímetros. Encontre o aluno
 * mais alto e o mais baixo. Mostre o número do aluno mais alto
 * e o número do aluno mais baixo, junto com suas alturas.
 *
 *  @author Victor S. S. Barros
 *  @version 1.0
 */

public class Ex39_AlunoMaisAltoEMaisBaixo {
    private static final DecimalFormat dfInt = new DecimalFormat("0"),
                                    dfDouble = new DecimalFormat("0.00");

    public static void main(String[] args) {
        int numeroMaisAlto = 0, numeroMaisBaixo = 0;
        double maisAlto = 0, maisBaixo = 10;// valores iniciais extremos


        //********* PODERIA UTILIZAR UMA CLASSE PARA ALUNO *************
        //********* SERÁ ENSINADO EM ORIENTAÇÃO A OBJETO ****************************

        System.out.println("Programa que leia dez conjuntos de dois valores,\n" +
                "o primeiro representando o número do aluno e o segundo\n" +
                "representando a sua altura em centímetros. Encontre o aluno\n" +
                "mais alto e o mais baixo. Mostre o número do aluno mais alto\n" +
                "e o número do aluno mais baixo, junto com suas alturas.\n");
        //=========== CRIAÇÃO DO CONJUNTO ALEATÓRIO ===================
        //=========== PODERIA SER LIDO DE UM ARQUIVO =====================
        final int NUMERO_CONJUNTOS = 10, NUMERO_INFORMACOES = 2;
        double [][]conjunto = new double[NUMERO_CONJUNTOS][NUMERO_INFORMACOES];
        double altura;
        Random aleatorio = new Random();
        String mostarConjunto = "";

        mostarConjunto += ("Os " + NUMERO_CONJUNTOS + " conjuntos de " + NUMERO_INFORMACOES + " informções lidos: ");
        for (int i = 0; i < NUMERO_CONJUNTOS; i++) {
            // gera um número aleatório
            conjunto[i][0] = (double) (aleatorio.nextInt(100));
            conjunto[i][1] = (double) (aleatorio.nextDouble() * 2.5);
        }
        //================ MOSTRA OS CONJUNTOS GERADOS =================
        for (int i = 0; i < NUMERO_CONJUNTOS; i++)
            if (i != NUMERO_CONJUNTOS - 1) {
                mostarConjunto += dfInt.format(conjunto[i][0]) + "; ";
                mostarConjunto += dfDouble.format(conjunto[i][1]) + "  /  ";
            } else {
                mostarConjunto += dfInt.format(conjunto[i][0]) + "; ";
                mostarConjunto += dfDouble.format(conjunto[i][1]) + ". ";
            }
        System.out.println(mostarConjunto);

        //===================== CÁLCULO ================================
        for (int i=0;i<NUMERO_CONJUNTOS;i++){
            altura = conjunto[i][1];
            if (altura > maisAlto) {
                maisAlto = altura;
                numeroMaisAlto = (int) conjunto[i][0];
            }
            if (altura < maisBaixo) {
                maisBaixo = altura;
                numeroMaisBaixo = (int) conjunto[i][0];
            }
        }

        System.out.println("Aluno mais alto: \nnúmero: "+
                numeroMaisAlto+" - altura: "+dfDouble.format(maisAlto)+
                "\nAluno mais baixo: \nnúmero: "+
                numeroMaisBaixo+" - altura: "+dfDouble.format(maisBaixo));

        System.out.println("\n\nFim do programa.");
    }
}
