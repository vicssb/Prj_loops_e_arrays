package br.com.dio.exercicios.loops;

import java.util.Scanner;

/**
 * Desenvolva um gerador de tabuada, capaz de gerar a tabuada de qualquer
 * número inteiro entre 1 a 10. O usuário deve informar de qual numero ele
 * deseja ver a tabuada. A saída deve ser conforme o exemplo abaixo:<p>
 * Tabuada de 5:<br>
 * 5 X 1 = 5<br>
 * 5 X 2 = 10<br>
 * ...<br>
 * 5 X 10 = 50<br>
 *
 * @author Victor S. S. Barros.
 * @version 1.0
 */
public class Ex12_Tabuada {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int numero;

        //===================== ENTRADA ================================
        System.out.println("Digite o número: ");
        numero = scan.nextInt();

        System.out.println("Tabuada de "+numero+":");
        for (int i=1;i<=10;i++){
            System.out.print(numero+" X "+i+" = "+numero*i+"\n");
        }

        System.out.println("\n\nFim do programa.");
    }
}
