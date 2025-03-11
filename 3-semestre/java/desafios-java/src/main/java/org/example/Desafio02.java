package org.example;

import java.util.Scanner;

public class Desafio02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o comprimento do primeiro segmento: ");
        double a = scanner.nextDouble();

        System.out.print("Digite o comprimento do segundo segmento: ");
        double b = scanner.nextDouble();

        System.out.print("Digite o comprimento do terceiro segmento: ");
        double c = scanner.nextDouble();

        if (a < b + c && b < a + c && c < a + b) {
            System.out.println("É possível formar um triângulo com esses segmentos.");
        } else {
            System.out.println("Não é possível formar um triângulo com esses segmentos.");
        }

        scanner.close();
    }
}
