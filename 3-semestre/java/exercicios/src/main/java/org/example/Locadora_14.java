package org.example;

import java.util.Scanner;

public class Locadora_14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a quantidade de Km percorridos: ");
        double kmPercorridos = scanner.nextDouble();

        System.out.print("Digite a quantidade de dias de aluguel: ");
        int diasAluguel = scanner.nextInt();

        double precoTotal = (diasAluguel * 90.00) + (kmPercorridos * 0.20);

        System.out.printf("O preço total a pagar é de R$%.2f.\n", precoTotal);

        scanner.close();
    }
}