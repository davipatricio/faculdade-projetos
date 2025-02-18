package org.example;

import java.util.Scanner;

public class BRLToUSD_09 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a quantidade de dinheiro em reais (R$): ");
        double reais = scanner.nextDouble();

        double cotacaoDolar = 3.45;

        double dolares = reais / cotacaoDolar;

        System.out.printf("Com R$%.2f, você pode comprar US$%.2f.\n", reais, dolares);

        scanner.close();
    }
}