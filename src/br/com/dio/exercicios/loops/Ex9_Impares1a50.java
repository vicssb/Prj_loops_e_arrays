package br.com.dio.exercicios.loops;

/**
 * Faça um programa que imprima na tela apenas os números ímpares entre 1 e 50.
 */
public class Ex9_Impares1a50 {
    public static void main(String[] args) {
        for (int i=1;i<50;i++){
            if (i%2 == 1)
                System.out.println(i);
        }
        System.out.println("\n\nFim do programa.");
    }
}
