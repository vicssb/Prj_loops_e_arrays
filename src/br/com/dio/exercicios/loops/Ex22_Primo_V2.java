package br.com.dio.exercicios.loops;

import java.util.Scanner;

/**
 * Altere o programa de cálculo dos números primos, informando,
 * caso o número não seja primo, por quais número ele é divisível.
 *
 * @author Victor S. S. Barros.
 * @version 1.0
 */
public class Ex22_Primo_V2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numero;
        boolean continuar = true, primo = true;

        //===================== ENTRADA ================================
        System.out.println("Digite o número para saber se é primo: ");
        numero = scan.nextInt();

        //===================== CÁLCULO ================================
        int i = 2;
        do {
            if (numero % i == 0) {
                continuar = false;
                primo = false;
            }
            // A partir da metade do número, não precisamos mais testar
            if (i > (numero / 2))
                continuar = false;
            i++;
        } while (continuar);

        //===================== RESPOSTA ================================
        if (primo)
            System.out.println("\nO número " + numero + " é primo.");
        else {
            System.out.println("\nO número " + numero + " não é primo.");
            System.out.println("O número " + numero + " é divisivel por: ");
            for (int a = 1; a < (numero / 2); a++)
                if (numero % a == 0) {
                    System.out.print(a);
                    // para não imprimir ',' no final
                    if ((a < (numero/2)-a))
                        System.out.print(", ");
                }
        }
        System.out.println("\n\nFim do programa.");
    }

}


