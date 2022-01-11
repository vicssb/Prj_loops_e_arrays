package br.com.dio.exercicios.loops;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * O Departamento Estadual de Meteorologia lhe contratou para desenvolver
 * um programa que leia as um conjunto indeterminado de temperaturas,
 * e informe ao final a menor e a maior temperaturas informadas,
 * bem como a média das temperaturas.
 *
 * @author Victor S. S. Barros.
 * @version 1.0
 */

public class Ex33_MediaTemperaturas {
    private static final DecimalFormat df = new DecimalFormat("0.00");

    public static void main(String[] args) {
        double numero, maior, menor, soma=0;

        System.out.println("Programa que leia as um conjunto indeterminado de temperaturas,\n" +
                        " * e informe ao final a menor e a maior temperaturas informadas,\n" +
                        " * bem como a média das temperaturas.");


        //=========== CRIAÇÃO DO CONJUNTO ALEATÓRIO ===================
        //=========== PODERIA SER LIDO DE UM ARQUIVO =====================
        final int TAMANHO=4;
        double conjunto[]=new double[TAMANHO];
        String mostarConjunto="";

        for (int i=0; i<TAMANHO; i++)
            // gera um número real aleatório no intervalo de -50 até 50
            conjunto[i] = (double) (Math.random() * 50 * (Math.random() > 0.5 ? 1 : -1));

        mostarConjunto+=("O conjunto de "+TAMANHO+" números lido é: ");
        for (int i=0; i<TAMANHO; i++)
            if(i!=TAMANHO-1)
               mostarConjunto+=df.format(conjunto[i])+", ";
            else
                mostarConjunto+= df.format(conjunto[i])+". ";

        System.out.println(mostarConjunto);

        //===================== CÁLCULO ================================
        numero = conjunto[0];

        soma += numero;
        maior = numero;
        menor = numero;

        for (int i=1; i<TAMANHO; i++){
            numero = conjunto[i];

            soma += numero;
            if (numero > maior)
                maior = numero;
            if (numero < menor)
                menor = numero;
        }
        //===================== RESPOSTA ================================
        System.out.println("Maior temperatura= "+df.format(maior)+
                "\nMenor temperatura= "+df.format(menor)+
                "\nMédia das temperaturas = "+ df.format(soma/TAMANHO));

        System.out.println("\n\nFim do programa.");
    }
}

