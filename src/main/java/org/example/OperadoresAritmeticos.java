package org.example;

public class OperadoresAritmeticos {

    public static void main(String[] args) {
        double pao = 10.50;
        double queijo = 7.00;
        double acucar = 1.00;
        double desconto = 5.0;
        double divisao = 2;

        double valorTotal = pao + queijo + acucar;
        System.out.println("Valor Total = R$" + valorTotal);

        double valorTotalComDesconto = valorTotal - desconto;
        System.out.println("Valor total com desconto = R$" + valorTotalComDesconto);

        double divisaoValorTotal = valorTotalComDesconto / 2;
        System.out.println("A divisão foi: " + divisaoValorTotal);

    }
}