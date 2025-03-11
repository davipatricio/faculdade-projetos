package org.example;

//Vamos melhorar o jogo que fizemos no exercício
//32. A partir de agora, o computador vai sortear um número entre
//1 e 10 e o jogador vai ter 4 tentativas para tentar acertar.

import java.util.Random;
import java.util.Scanner;

public class Desafio06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Random random = new Random();

        int numeroSorteado = random.nextInt(10) + 1;

        System.out.println("Bem-vindo ao jogo de adivinhação!");
        System.out.println("Tente adivinhar o número sorteado entre 1 e 10.");
        System.out.println("Você tem 4 tentativas.");

        int tentativasMaximas = 4;

        for (int tentativas = 1; tentativas <= tentativasMaximas; tentativas++) {
            System.out.print("Tentativa " + tentativas + " de " + tentativasMaximas + ": Digite seu palpite: ");
            int palpite = scanner.nextInt();

            if (palpite == numeroSorteado) {
                System.out.println("Parabéns! Você acertou o número " + numeroSorteado + " em " + tentativas + " tentativas.");
                break;
            } else if (palpite < numeroSorteado) {
                System.out.println("O número sorteado é maior. Tente novamente.");
            } else {
                System.out.println("O número sorteado é menor. Tente novamente.");
            }

            if (tentativas == tentativasMaximas) {
                System.out.println("Você não acertou o número. O número sorteado era: " + numeroSorteado);
            }
        }

        scanner.close();
    }
}
