package br.com.dio.exercicios.loops;

import java.util.Scanner;

/**
 * Faça um programa que leia e valide as seguintes informações:
 * Nome: maior que 3 caracteres;
 * Idade: entre 0 e 150;
 * Salário: maior que zero;
 * Sexo: 'f' ou 'm';
 * Estado Civil: 's', 'c', 'v', 'd';
 *
 *  @author Victor S. S. Barros
 *  @version 1.0
 */
public class Ex3_Avaliacoes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String nome;
        int idade;
        Double salario;
        char sexo, estadoCivil;

        //========== ENTRADAS ==================
        System.out.println("Digite o nome: ");
        nome = scan.next();
        System.out.println("Digite a idade: ");
        idade = scan.nextInt();
        System.out.println("Digite o salario: ");
        salario = scan.nextDouble();
        System.out.println("Digite o sexo: ");
        sexo = scan.next().charAt(0);
        System.out.println("Digite o estado civil: ");
        estadoCivil =scan.next().charAt(0);

        //========== VALIDAÇÕES e RESPOSTAS==================
        if (nome.length()<=3)
            System.out.println("Nome inválido.");
        else
            System.out.println("Nome válido.");

        if ((idade<0)||(idade>150))
            System.out.println("Idade inválida.");
        else
            System.out.println("Idade válida.");

        if (salario<=0)
            System.out.println("Salário inválido.");
        else
            System.out.println("Salário válido.");

        if ((sexo == 'f')||(sexo == 'm'))
            System.out.println("Sexo válido.");
        else
            System.out.println("Sexo inválido.");

        if ((estadoCivil == 's')||(estadoCivil == 'c')||(estadoCivil == 'v')||(estadoCivil == 'd'))
            System.out.println("Estado Civil válido.");
        else
            System.out.println("Estado Civil inválido.");


        System.out.println("\n\nFim do programa.");
    }
}
