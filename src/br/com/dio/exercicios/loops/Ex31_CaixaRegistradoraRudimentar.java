package br.com.dio.exercicios.loops;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * O Sr. Manoel Joaquim expandiu seus negócios para além dos negócios de 1,99
 * e agora possui uma loja de conveniências. Faça um programa que implemente
 * uma caixa registradora rudimentar. O programa deverá receber um número
 * desconhecido de valores referentes aos preços das mercadorias. Um valor
 * zero deve ser informado pelo operador para indicar o final da compra.
 * O programa deve então mostrar o total da compra e perguntar o valor em
 * dinheiro que o cliente forneceu, para então calcular e mostrar o valor do troco.
 * Após esta operação, o programa deverá voltar ao ponto inicial, para registrar
 * a próxima compra. A saída deve ser conforme o exemplo abaixo:
 * Lojas Tabajara
 * Produto 1: R$ 2.20
 * Produto 2: R$ 5.80
 * Produto 3: R$ 0
 * Total: R$ 9.00
 * Dinheiro: R$ 20.00
 * Troco: R$ 11.00
 * ...
 *
 *  @author Victor S. S. Barros
 *  @version 1.0
 */

public class Ex31_CaixaRegistradoraRudimentar {
    private static final DecimalFormat df = new DecimalFormat("0.00");

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double valor, total=0;
        int i=1;
        String resposta;

        resposta="Lojas Tabajara\n";
        //========= LEITURA E VALIDAÇÃO DO PREÇO  ====================
        do {
            System.out.println("\nDigite o preço da mercadoria: ");
            valor = scan.nextDouble();
            if (valor < 0)
                System.out.println("Erro! O valor deve ser maior que 0.\n");
            else if(valor != 0){
                total += valor;
                resposta+=("Produto "+i+": R$ "+df.format(valor)+"\n");
                i++;
            }
        }while (valor!=0);
        resposta+=("Total : R$ "+df.format(total)+"\n");

        //========= LEITURA E VALIDAÇÃO DO PAGAMENTO ====================
        do {
            System.out.println("\nDigite o valor em dinheiro do pagamento: ");
            valor = scan.nextDouble();
            if (valor <= 0)
                System.out.println("Erro! O valor deve ser maior que 0.\n");
        }while (valor<=0);

        //=============== SAÍDA ======================
        resposta+=("Dinheiro: R$ "+df.format(valor)+"\n");
        resposta+=("Troco: R$ "+df.format(valor-total)+"\n");
        System.out.println(resposta);

        System.out.println("\n\nFim do programa.");
    }
}
