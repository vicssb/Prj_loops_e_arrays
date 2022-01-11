package br.com.dio.exercicios.loops;

import java.util.Scanner;

/**
 * Altere o programa anterior permitindo ao usuário informar
 * as populações e as taxas de crescimento iniciais. Valide a
 * entrada e permita repetir a operação.
 *
 *  @author Victor S. S. Barros
 *  @version 1.0
 *
 * <p>
 *  Observações:<br>
 *      ============= VALIDAÇÕES populacao===================<br>
 *               A população deve ser maior que 1.<br>
 *               A população deve ser um número inteiro.<br>
 *<br>
 *      ============== VALIDAÇÃO taxaDeCrescimento ===================<br>
 *      A taxa de crescimento do pais deve ser maior que 0.0!
 */

public class Ex5_Populacao_v2 {
    public static void main(String[] args) {

        double populacaoA, populacaoB;
        float taxaDeCrescimentoA, taxaDeCrescimentoB;
        int anos = 0;
        boolean repetir = true;
        Scanner scan = new Scanner(System.in);

        //============== ENTRADAS ===================
        do {
            System.out.println("Digite a população do pais A:");
            populacaoA = scan.nextDouble();
            /*
                ============= VALIDAÇÕES populacaoA===================
              A população deve ser maior que 1
              A população deve ser um número inteiro
             */

            if (populacaoA<1d)
                System.out.println("A população deve ser maior que 1!\n");
            else {
                repetir = false;
                double parteFracionaria = (populacaoA - (int) populacaoA);
                if (parteFracionaria == 0.0d)
                    repetir = false;
                else {
                    System.out.println("A população deve ser um número inteiro!\n");
                    repetir =true;
                }
            }
        }while (repetir);

        repetir=true;
        do {
            System.out.println("Digite a taxa de crescimento do pais A:");
            taxaDeCrescimentoA = scan.nextFloat();
            //============== VALIDAÇÃO taxaDeCrescimentoA ===================
            if (taxaDeCrescimentoA<=0f)
                System.out.println("A taxa de crescimento do pais A deve ser maior que 0.0!\n");
            else
                repetir = false;

        }while (repetir);

        repetir =true;
        do {
            System.out.println("Digite a população do pais B:");
            populacaoB = scan.nextDouble();
            //============== VALIDAÇÕES populacaoB===================
            if (populacaoB<1d)
                System.out.println("A população deve ser maior que 1!\n");
            else {
                repetir = false;
                double parteFracionaria = (populacaoB - (int) populacaoB);
                if (parteFracionaria == 0.0d)
                    repetir = false;
                else {
                    System.out.println("A população deve ser um número inteiro!\n");
                    repetir =true;
                }
            }
        }while (repetir);

        repetir=true;
        do {
            System.out.println("Digite a taxa de crescimento do pais B:");
            taxaDeCrescimentoB = scan.nextFloat();
            //============== VALIDAÇÃO taxaDeCrescimentoB ===================
            if (taxaDeCrescimentoB<=0f)
                System.out.println("A taxa de crescimento do pais B deve ser maior que 0.0!\n");
            else
                repetir = false;

        }while (repetir);

        //============= Cálculo do crescimento ===========================
        do {
            populacaoA += populacaoA * taxaDeCrescimentoA / 100;
            populacaoB += populacaoB * taxaDeCrescimentoB / 100;
            anos++;
        } while (populacaoA <= populacaoB);

        System.out.println("Total de anos necessários para que a população do país A ultrapasse\n" +
                "ou iguale a população do país B: " + anos);
        System.out.println("A população do país A é: " + (int) populacaoA);
        System.out.println("A população do país B é: " + (int) populacaoB);
        System.out.println("\n\nFim do programa.");
    }

}
