package br.com.dio.exercicios.loops;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Em uma competição de salto em distância cada atleta tem direito a cinco saltos.
 * No final da série de saltos de cada atleta, o melhor e o pior resultados são
 * eliminados. O seu resultado fica sendo a média dos três valores restantes.
 * Você deve fazer um programa que receba o nome e as cinco distâncias alcançadas
 * pelo atleta em seus saltos e depois informe a média dos saltos conforme a descrição
 * acima informada (retirar o melhor e o pior salto e depois calcular a média).
 * Faça uso de uma lista para armazenar os saltos. Os saltos são informados na ordem
 * da execução, portanto não são ordenados. O programa deve ser encerrado quando não for
 * informado o nome do atleta. A saída do programa deve ser conforme o exemplo abaixo:
 * Atleta: Rodrigo Curvêllo
 *
 * Primeiro Salto: 6.5 m
 * Segundo Salto: 6.1 m
 * Terceiro Salto: 6.2 m
 * Quarto Salto: 5.4 m
 * Quinto Salto: 5.3 m
 *
 * Melhor salto:  6.5 m
 * Pior salto: 5.3 m
 * Média dos demais saltos: 5.9 m
 *
 * Resultado final:
 * Rodrigo Curvêllo: 5.9 m
 *
 *  @author Victor S. S. Barros
 *  @version 1.0
 */

public class Ex46_CompeticaoDeSalto {
    private static final DecimalFormat df = new DecimalFormat("0.00");
    public static void main(String[] args) {
        final int TAMANHO=5;
        Scanner scan = new Scanner(System.in);
        String nome, nomeCampeao="", resposta="Atleta: ";
        double melhorSalto=0, piorSalto=100;// valores iniciais extremos
        double media=0;
        double[] saltos = new double[TAMANHO];

        System.out.println("Programa que receba o nome e as cinco distâncias alcançadas \n" +
                "pelo atleta em seus saltos e depois informe a média dos saltos conforme a descrição\n" +
                "acima informada (retirar o melhor e o pior salto e depois calcular a média). \n" +
                "Faça uso de uma lista para armazenar os saltos. Os saltos são informados na ordem \n" +
                "da execução, portanto não são ordenados. O programa deve ser encerrado quando não for\n" +
                "informado o nome do atleta.");
        //************ DEVERIA SER REALIZADA A VALIDAÇÃO DE NÃO NÚMERO ********
        //********** ESTOU USANDO UM VETOR, A FILA SERÁ ENSINADO MAIS A FRENTE ****************************
        do {
            System.out.println("Digite o nome do atleta: ");
            nome = scan.nextLine();
            resposta+=nome+"\n";


            if (!nome.isEmpty())
                for (int i=0;i<TAMANHO;i++) {
                    System.out.println("Digite o valor do " + (i + 1) + "º salto: ");
                    saltos[i] = scan.nextDouble();

                    if(saltos[i]>melhorSalto) {
                        melhorSalto = saltos[i];
                        nomeCampeao=nome;
                    }
                    if(saltos[i]<piorSalto)
                        piorSalto=saltos[i];

                    switch (i) {
                        case 0:
                        resposta +="\nPrimeiro ";
                        break;
                        case 1:
                            resposta +="\nSegundo ";
                            break;
                        case 2:
                            resposta +="\nTerceiro ";
                            break;
                        case 3:
                            resposta +="\nQuarto ";
                            break;
                        case 4:
                            resposta +="\nQuinto ";
                            break;
                    }

                    resposta+= "salto: "+saltos[i] + " m";
                    media+=saltos[i];
                }


        }while (!nome.isEmpty());

        //================ RESPOSTA ====================
        media = (media-(piorSalto+melhorSalto))/(TAMANHO-2);
        resposta+="\nPior salto: "+piorSalto+"\n";
        resposta+="Melhor salto: "+melhorSalto+"\n";
        resposta+="Média dos demais saltos:: "+media+" m\n";
        resposta+="\nResultado final: \n";
        resposta+=nomeCampeao+": "+media+" m";

        System.out.println(resposta);

        System.out.println("\n\nFim do programa.");
    }
}
