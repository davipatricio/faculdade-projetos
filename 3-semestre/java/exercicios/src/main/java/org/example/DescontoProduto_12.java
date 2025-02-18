package org.example;

import java.util.Scanner;

public class DescontoProduto_12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o preço do produto: ");
        double preco = scanner.nextDouble();

        double desconto = preco * 0.05;

        double precoPromocional = preco - desconto;

        System.out.printf("O preço do produto é R$%.2f.\n", preco);
        System.out.printf("O desconto é de R$%.2f.\n", desconto);
        System.out.printf("O preço promocional é R$%.2f.\n", precoPromocional);

        scanner.close();
    }
}