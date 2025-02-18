package org.example;

import java.util.Scanner;

public class SumNumbers_04 {
    public static void main(String[] args) {
        System.out.print("Digite o primeiro número: ");

        Scanner scanner = new Scanner(System.in);
        Float primeiro = scanner.nextFloat();

        System.out.print("Digite o segundo número: ");
        Float segundo = scanner.nextFloat();

        Float res = primeiro + segundo;

        System.out.printf("A soma de %.2f e %.2f é: %.2f", primeiro, segundo, res);

        scanner.close();
    }
}
