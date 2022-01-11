package br.com.dio.exercicios.loops;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * O cardápio de uma lanchonete é o seguinte:
 * Especificação   Código  Preço
 * Cachorro Quente 100     R$ 1,20
 * Bauru Simples   101     R$ 1,30
 * Bauru com ovo   102     R$ 1,50
 * Hambúrguer      103     R$ 1,20
 * Cheeseburguer   104     R$ 1,30
 * Refrigerante    105     R$ 1,00
 *
 * Faça um programa que leia o código dos itens pedidos e as quantidades desejadas.
 * Calcule e mostre o valor a ser pago por item (preço * quantidade) e o total
 * geral do pedido. Considere que o cliente deve informar quando o pedido deve ser encerrado.
 *
 *  @author Victor S. S. Barros
 *  @version 1.0
 */

public class Ex43_cardapio {
    private static final DecimalFormat df = new DecimalFormat("0.00");
    //********* PODERIA UTILIZAR FUNÇÕES, FICARIA MUITO MAIS SIMPLES *************
    //********* SERÁ ENSINADO EM ORIENTAÇÃO A OBJETO ****************************

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        final int NUMERO_LINHAS = 6;
        String []especificacao = new String[NUMERO_LINHAS];
        int []codigo = new  int[NUMERO_LINHAS];
        double []preco= new double[NUMERO_LINHAS];
        double total=0;
        int item,codigoItemComprado;
        String especificacaoItemComprado="",
                resposta="Cód \tItem             \tQuant. \tPreço  \tTotal\n";
        char continuar;
        boolean itemCorreto=false;

        // =============== INICALIZANDO CARDAPIO ================
        especificacao[0]="Cachorro Quente";
        especificacao[1]="Bauru Simples  ";
        especificacao[2]="Bauru com ovo  ";
        especificacao[3]="Hambúrguer     ";
        especificacao[4]="Cheeseburguer  ";
        especificacao[5]="Refrigerante   ";
        codigo[0]=100;
        codigo[1]=101;
        codigo[2]=102;
        codigo[3]=103;
        codigo[4]=104;
        codigo[5]=105;
        preco[0]=1.2;
        preco[1]=1.3;
        preco[2]=1.5;
        preco[3]=1.2;
        preco[4]=1.3;
        preco[5]=1.0;

        System.out.println("Programa que leia o código dos itens pedidos e as quantidades desejadas.\n" +
                "Calcule e mostre o valor a ser pago por item (preço * quantidade) e o total\n" +
                "geral do pedido. Considere que o cliente deve informar quando o pedido deve ser encerrado.\n");

        System.out.println("O cardápio da lanchonete é o seguinte:\n\n" +
                "   Item             Código  Preço\n" +
                " * Cachorro Quente  100     R$ 1,20\n" +
                " * Bauru Simples    101     R$ 1,30\n" +
                " * Bauru com ovo    102     R$ 1,50\n" +
                " * Hambúrguer       103     R$ 1,20\n" +
                " * Cheeseburguer    104     R$ 1,30\n" +
                " * Refrigerante     105     R$ 1,00");
        do {
            do {
                System.out.println("Digite o código do item: ");
                item = scan.nextInt();

                codigoItemComprado=-1;
                for (int i = 0; i < NUMERO_LINHAS; i++) {
                    if (item == codigo[i]) {
                        codigoItemComprado = codigo[i];
                        resposta+=codigo[i]+ "\t\t"+especificacao[i];
                        itemCorreto=true;
                      //  =========== VALIDAÇÃO DA QUANTIDADE
                        int quantidade=0;
                        do {
                            System.out.println("Digite a quantidade:");
                            quantidade = scan.nextInt();
                            if (quantidade < 1)
                                System.out.println("Erro! A quantidade dever ser maior que zero.");
                            else {
                                double totalItem = quantidade*preco[i];
                                resposta += "\t\t"+quantidade+"\t\t"+preco[i];
                                resposta+="\t\t"+df.format(totalItem)+"\n";
                                total+=totalItem;
                            }

                        } while (quantidade<1);
                    }
                }
                if (codigoItemComprado < 0) {
                    System.out.println("Item não encontrado.");
                    itemCorreto=false;
                }
            }while (!itemCorreto);



            System.out.println("Deseja continuar? S/N");
            continuar = scan.next().charAt(0);
            continuar = Character.toUpperCase(continuar);

        }while (continuar == 'S');

        resposta += "\nTotal: R$ "+df.format(total);
        //System.out.println(especificacaoItemComprado+codigoItemComprado);
        System.out.println(resposta);

        System.out.println("\n\nFim do programa.");
    }
}
