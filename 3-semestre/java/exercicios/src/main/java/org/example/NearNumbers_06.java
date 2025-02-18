package org.example;

import java.util.Scanner;

public class NearNumbers_06 {
    public static void main(String[] args) {
        System.out.print("Digite um número inteiro: ");

        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        int prev = num - 1;
        int next = num + 1;

        System.out.printf("O antecessor de %s é %s\n", num, prev);
        System.out.printf("O sucessor de %s é %s\n", num, next);

        scanner.close();
    }
}
