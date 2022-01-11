package br.com.dio.exercicios.loops;

import java.util.Scanner;

/**
 * Altere o programa anterior para que ele aceite apenas números entre 0 e 1000.
 *
 * @author Victor S. S. Barros.
 * @version 1.0
 */
public class Ex19_MenorMaiorSomaEntre0e1000 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int quantidade, numero, maior, menor, soma=0;

        //===================== ENTRADA ================================
        //*************** A VALIDAÇÃO DO NÚMERO DEVERIA SER REALIZADO POR UMA FUNÇÃO
        //********   SERÁ ENSINADO MAIS A FRENTE  *********
        do {
            System.out.println("Digite a quantidade de números: ");
            quantidade = scan.nextInt();
            if (quantidade<1)
                System.out.println("Erro! A quantidade deve ser maior que zero!");
        }while (quantidade<1);

        do {
            System.out.println("Digite o 1º número entre 0 e 1000: ");
            numero = scan.nextInt();
            if ((numero<0)||(numero>1000))
                System.out.println("Erro! O número deve está entre 0 e 1000!");
        }while ((numero<0)||(numero>1000));


        soma += numero;
        maior = numero;
        menor = numero;

        //===================== CÁLCULO ================================
        for (int i=2; i<=quantidade; i++){
            do {
                System.out.println("Digite o "+i+"º número entre 0 e 1000: ");
                numero = scan.nextInt();
                if ((numero<0)||(numero>1000))
                    System.out.println("Erro! O número deve está entre 0 e 1000!");
            }while ((numero<0)||(numero>1000));

            soma += numero;
            if (numero > maior)
                maior = numero;
            if (numero < menor)
                menor = numero;
        }

        System.out.println("Maior = "+maior+", Menor = "+menor+" e Soma = "+soma);

        System.out.println("\n\nFim do programa.");
    }
}
