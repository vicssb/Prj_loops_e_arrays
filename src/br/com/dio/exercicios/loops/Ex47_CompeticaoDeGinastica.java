package br.com.dio.exercicios.loops;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Em uma competição de ginástica, cada atleta recebe votos de sete jurados.
 * A melhor e a pior nota são eliminadas. A sua nota fica sendo a média dos
 * votos restantes. Você deve fazer um programa que receba o nome do ginasta
 * e as notas dos sete jurados alcançadas pelo atleta em sua apresentação e
 * depois informe a sua média, conforme a descrição acima informada (retirar
 * o melhor e o pior salto e depois calcular a média com as notas restantes).
 * As notas não são informados ordenadas. Um exemplo de saída do programa
 * deve ser conforme o exemplo abaixo:
 * Atleta: Aparecido Parente
 * Nota: 9.9
 * Nota: 7.5
 * Nota: 9.5
 * Nota: 8.5
 * Nota: 9.0
 * Nota: 8.5
 * Nota: 9.7
 *
 * Resultado final:
 * Atleta: Aparecido Parente
 * Melhor nota: 9.9
 * Pior nota: 7.5
 * Média: 9,04
 *
 *  @author Victor S. S. Barros
 *  @version 1.0
 */

public class Ex47_CompeticaoDeGinastica {
    private static final DecimalFormat df = new DecimalFormat("0.00");
    public static void main(String[] args) {
        final int NUMERO_JURADOS=5;
        Scanner scan = new Scanner(System.in);
        String nome="", resposta= "\nAtleta: ";
        double[] notas=new double[NUMERO_JURADOS];
        double melhorSalto=0, piorSalto=100;// valores iniciais extremos
        double media=0;

        System.out.println("Programa que receba o nome do ginasta \n" +
                " * e as notas dos sete jurados alcançadas pelo atleta em sua apresentação e \n" +
                " * depois informe a sua média, conforme a descrição acima informada (retirar \n" +
                " * o melhor e o pior salto e depois calcular a média com as notas restantes).\n");
        //************ A VALIDAÇÃO DE NOME VAZIO ********
        do{
            System.out.println("Digite o nome do atleta: ");
            nome = scan.nextLine();
            if (nome.isEmpty())
                System.out.println("Erro! O nome não pode ser vazio.");
            else
                resposta+=nome;
        }while (nome.isEmpty());

        for (int i=0;i<NUMERO_JURADOS;i++) {
            do {
                System.out.println("Digite uma nota do "+(i+1)+"º jurado, entre zero e dez: ");
                notas[i] = scan.nextDouble();
                if ((notas[i] < 0) || (notas[i] > 10))
                    System.out.println("Erro! Valor invalido para a nota.");
                else{
                    resposta+="\nNota: "+notas[i];
                }
            } while ((notas[i] < 0) || (notas[i] > 10));

            media+=notas[i];
            if(notas[i]>melhorSalto) {
                melhorSalto = notas[i];
            }
            if(notas[i]<piorSalto)
                piorSalto=notas[i];
        }
        //================ RESPOSTA ====================
        resposta+="\nResultado final:";
        resposta+="\nAtleta: "+nome;
        resposta+="\nMelhor nota: "+melhorSalto;
        resposta+="\nPior nota: "+piorSalto;
        resposta+="\nMédia das notas: "+df.format((media-(piorSalto+melhorSalto))/(NUMERO_JURADOS-2));


        System.out.println(resposta);
        System.out.println("\n\nFim do programa.");
    }
}
