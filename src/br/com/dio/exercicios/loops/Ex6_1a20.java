package br.com.dio.exercicios.loops;

/**
 * Faça um programa que imprima na tela os números de 1 a 20,
 * um abaixo do outro. Depois modifique o programa para que
 * ele mostre os números um ao lado do outro.
 *
 *  @author Victor S. S. Barros
 *  @version 1.0
 */
public class Ex6_1a20 {
    public static void main(String[] args) {
        System.out.println("números de 1 a 20 um abaixo do outro.");
        for (int i=1;i<=20; i++){
            System.out.println(i);
        }
        System.out.println("\nnúmeros de 1 a 20 um ao lado do outro.");
        int ultimo=0;
        for (int i=1;i<=19; i++){
            System.out.print(i+", ");
            ultimo = i;
        }
        ultimo++;
        System.out.print(ultimo);
        System.out.println("\n\nFim do programa.");
    }

}
