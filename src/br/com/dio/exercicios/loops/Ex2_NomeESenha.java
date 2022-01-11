package br.com.dio.exercicios.loops;

import java.util.Scanner;

/**
 * Faça um programa que leia um nome de usuário e a sua senha e
 * não aceite a senha igual ao nome do usuário, mostrando uma
 * mensagem de erro e voltando a pedir as informações.
 *
 *
 *  @author Victor S. S. Barros
 *  @version 1.0
 */
public class Ex2_NomeESenha {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String nome, senha;

        do {
            System.out.println("Digite o nome: ");
            nome = scan.next();
            System.out.println("Digite a senha: ");
            senha = scan.next();
        }while (! nome.equals(senha));

        System.out.println("\n\nFim do programa.");
    }
}
