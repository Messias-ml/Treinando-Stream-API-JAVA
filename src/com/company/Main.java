package com.company;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Produto pt = new Produto("NotBook", 4502);
        Produto pt1 = new Produto("celular", 1502);
        Produto pt2 = new Produto("computador", 2245);
        Produto pt3 = new Produto("televisao", 1230);
        Produto pt4 = new Produto("geladeira", 800);
        Produto pt5 = new Produto("maquina de lavar", 1300);
        Produto pt6 = new Produto("mesa", 405);

        List<Produto> listaProdutos = Arrays.asList(pt, pt1, pt2, pt3, pt4, pt5, pt6);

        /*COMPRANDO PRODUTOS COM OS VALORES MAIOR QUE 1500 E QUE NÃO SEJA COMPUTADOR, E EXIBINDO A MENSAGEM NA TELA DE PARABENS PELA COMPRA */
        listaProdutos.stream()
                .filter(p -> p.getPreço() > 1500)
                .filter(p -> p.getNome() != "computador")
                .map(p -> "\n você selecionou um dos melhores produtos da loja: \n " + p.getNome() +"\n Parabéns !!! \n")
                .forEach(System.out::println);

        /*IMPRIMINDO NA TELA VALOR TOTAL DAS COMPRAS MAIORES QUE 1500*/
        listaProdutos.stream()
                .filter(p -> p.getPreço() > 1500)
                .map(p -> p.getPreço())
                .reduce((ac , p ) -> ac + p)//terminal --> igual o foreach
                .ifPresent(System.out::println);

    }
}
