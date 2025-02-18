package org.example;

import java.util.Scanner;

public class GradeAverage_05 {
    public static void main(String[] args) {
        System.out.print("Digite a primeira nota: ");

        Scanner scanner = new Scanner(System.in);
        Float nota1 = scanner.nextFloat();

        System.out.print("Digite a segunda nota: ");
        Float nota2 = scanner.nextFloat();

        Float media = (nota1 + nota2) / 2;

        System.out.printf("A média das notas é: %.2f", media);

        scanner.close();
    }
}
