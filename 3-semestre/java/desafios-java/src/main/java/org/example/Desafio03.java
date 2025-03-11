package org.example;

import java.util.Scanner;

public class Desafio03 {
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

            if (a == b && b == c) {
                System.out.println("O triângulo é EQUILÁTERO (todos os lados iguais).");
            } else if (a == b || b == c || a == c) {
                System.out.println("O triângulo é ISÓSCELES (dois lados iguais).");
            } else {
                System.out.println("O triângulo é ESCALENO (todos os lados diferentes).");
            }
        } else {
            System.out.println("Não é possível formar um triângulo com esses segmentos.");
        }

        scanner.close();
    }
}
