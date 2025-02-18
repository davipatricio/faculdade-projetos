package org.example;

import java.util.Scanner;

public class LerNome_02 {
    public static void main(String[] args) {
        System.out.print("Digite seu nome: ");

        Scanner scanner = new Scanner(System.in);
        String nome = scanner.nextLine();

        System.out.printf("Seu nome é %s\n", nome);

        scanner.close();
    }
}