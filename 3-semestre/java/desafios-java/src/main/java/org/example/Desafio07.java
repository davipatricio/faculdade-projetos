package org.example;

//Desenvolva um programa que leia o primeiro termo e a
//razão de uma PA (Progressão Aritmética), mostrando na tela os 10
//primeiros elementos da PA e a soma entre todos os valores da
//sequência.

import java.util.Scanner;

public class Desafio07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro termo da PA: ");
        int primeiroTermo = scanner.nextInt();

        System.out.print("Digite a razão da PA: ");
        int razao = scanner.nextInt();

        int soma = 0;
        int termoAtual = primeiroTermo;

        System.out.println("\nOs 10 primeiros termos da PA são:");

        for (int i = 1; i <= 10; i++) {
            System.out.print(termoAtual + " ");
            soma += termoAtual;
            termoAtual += razao;
        }

        System.out.println("\n\nA soma dos 10 primeiros termos é: " + soma);

        scanner.close();
    }
}
