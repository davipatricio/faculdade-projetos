package org.example;

import java.util.Scanner;

public class Delta_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor de A: ");
        double a = scanner.nextDouble();

        System.out.print("Digite o valor de B: ");
        double b = scanner.nextDouble();

        System.out.print("Digite o valor de C: ");
        double c = scanner.nextDouble();

        double delta = (b * b) - (4 * a * c);

        System.out.printf("O valor de Delta é: %.2f\n", delta);

        scanner.close();
    }
}