package br.com.dio.exercicios.loops;

import java.util.Scanner;

/**
 * Faça um programa que peça para n pessoas a sua idade, ao final o programa
 * devera verificar se a média de idade da turma varia entre 0 e 25,26 e 60 e maior que 60;
 * e então, dizer se a turma é jovem, adulta ou idosa, conforme a média calculada.
 *
 *  @author Victor S. S. Barros
 *  @version 1.0
 */

public class Ex25_MediaIdade {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int quantidadePessoas, idade;
        Double media, somaIdade=0.0;

        System.out.println("Programa que peça para N pessoas a sua idade, ao final o programa\n" +
                "devera verificar se a média de idade da turma varia entre 0 e 25,26 e 60 e maior que 60;\n" +
                "e então, dizer se a turma é jovem, adulta ou idosa, conforme a média calculada.");

        do {
            System.out.println("\n\nDigite a quantidade de pessoas: ");
            quantidadePessoas = scan.nextInt();

            if (quantidadePessoas < 1)
                System.out.println("Erro! A quantidade deve ser maior que 0.\n");

        }while ((quantidadePessoas<1));

        //========= LEITURA DAS IDADES ====================
        for (int i=1;i<=quantidadePessoas;i++){
            // ============== A idade deve ser maior que 0 ===============
            do {
                System.out.println("Digite a "+i+"ª idade: ");
                idade = scan.nextInt();

                if (idade < 1)
                    System.out.println("Erro! A idade deve ser maior que 0.\n");

            }while ((idade<1));

            somaIdade += idade;
        }
        //============= CÁLCULO =========================
        media = somaIdade / quantidadePessoas;
        System.out.println("A média das idades é: "+media);
        if (media<=25)
            System.out.println("A turma é jovem.");
        else if((media>25)&&(media<=60))
            System.out.println("A turma é adulta.");
        else if (media>60)
            System.out.println("A turma é idosa.");

        System.out.println("\n\nFim do programa.");
    }
}
