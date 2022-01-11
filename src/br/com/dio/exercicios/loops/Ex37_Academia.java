package br.com.dio.exercicios.loops;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Uma academia deseja fazer um senso entre seus clientes para descobrir
 * o mais alto, o mais baixo, a mais gordo e o mais magro, para isto
 * você deve fazer um programa que pergunte a cada um dos clientes da
 * academia seu código, sua altura e seu peso. O final da digitação de dados
 * deve ser dada quando o usuário digitar 0 (zero) no campo código.
 * Ao encerrar o programa também deve ser informados os códigos e valores do
 * clente mais alto, do mais baixo, do mais gordo e do mais magro,
 * além da média das alturas e dos pesos dos clientes
 *
 *  @author Victor S. S. Barros
 *  @version 1.0
 */

public class Ex37_Academia {
    private static final DecimalFormat df = new DecimalFormat("0.00");

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //********* O IDEAL AQUI SERIA UTILIZAR UMA CLASSE PARA CLIENTE *************
        //********* SERÁ ENSINADO EM ORIENTAÇÃO A OBJETO ****************************
        int quantidadeClientes=0, codigo,
                codigoMaisAlto=0, codigoMaisBaixo=0, codigoMaisGordo=0, codigoMaisMagro=0;
        double altura, peso, somaAltura=0, somaPeso=0;
        double maisAlto=0, maisBaixo=10, maisGordo=0, maisMagro=500;// valores iniciais extremos

        System.out.println("Programa que pergunta a cada um dos clientes da\n" +
                "academia seu código, sua altura e seu peso. O final da digitação de dados\n" +
                "deve ser dada quando o usuário digitar 0 (zero) no campo código.\n" +
                "Ao encerrar o programa também informa os códigos e valores do\n" +
                "clente mais alto, do mais baixo, do mais gordo e do mais magro,\n" +
                "além da média das alturas e dos pesos dos clientes.\n");

        //===================== ENTRADA ================================
        //O final da digitação de dados deve ser dada quando o usuário
        // digitar 0 (zero) no campo código
        do {
            System.out.println("Digitar 0 (zero) no campo código para parar.");
            System.out.println("Digite seu código: ");
            codigo = scan.nextInt();
            if (codigo!=0) {
                System.out.println("Digite sea altura: ");
                altura = scan.nextDouble();
                System.out.println("Digite seu peso: ");
                peso = scan.nextDouble();
                quantidadeClientes++;
                //===================== CÁLCULO ================================
                somaAltura += altura;
                somaPeso += peso;
                if (altura > maisAlto) {
                    maisAlto = altura;
                    codigoMaisAlto = codigo;
                }
                if (altura < maisBaixo) {
                    maisBaixo = altura;
                    codigoMaisBaixo = codigo;
                }
                if (peso > maisGordo) {
                    maisGordo = peso;
                    codigoMaisGordo = codigo;
                }
                if (peso < maisMagro) {
                    maisMagro = peso;
                    codigoMaisMagro = codigo;
                }
            }
        }while (codigo!=0);
        //=============== ARRUMAÇÃO DO TEXTO DE RESPOSTA =============================
        System.out.println("Cliente mais alto código: "+ codigoMaisAlto+ " altura: "+maisAlto);
        System.out.println("Cliente mais baixo código: "+ codigoMaisBaixo+ " altura: "+maisBaixo);
        System.out.println("Cliente mais gordo código: "+ codigoMaisGordo+ " peso: "+maisGordo);
        System.out.println("Cliente mais magro código: "+ codigoMaisMagro+ " peso: "+maisMagro);
        System.out.println("Total de clientes: "+quantidadeClientes);
        System.out.println("Média das alturas dos clientes: "+
                df.format(somaAltura/quantidadeClientes));
        System.out.println("Média dos pesos dos clientes: "+
                df.format(somaPeso/quantidadeClientes));


        System.out.println("\n\nFim do programa.");
    }
}
