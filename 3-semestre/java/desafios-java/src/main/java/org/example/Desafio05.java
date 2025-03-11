package org.example;

//Crie um jogo onde o computador vai sortear um número
//entre 1 e 5 o jogador vai tentar descobrir qual foi o valor
//sorteado.


import java.util.Random;
import java.util.Scanner;

public class Desafio05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Random random = new Random();

        int numeroSorteado = random.nextInt(5) + 1;

        System.out.println("Bem-vindo ao jogo de adivinhação!");
        System.out.println("Tente adivinhar o número sorteado entre 1 e 5.");

        int tentativas = 0;
        int palpite = 0;

        while (palpite != numeroSorteado) {
            // Pede para o jogador dar o palpite
            System.out.print("Digite seu palpite: ");
            palpite = scanner.nextInt();
            tentativas++;

            // Verifica se o palpite está correto
            if (palpite < numeroSorteado) {
                System.out.println("O número sorteado é maior. Tente novamente.");
            } else if (palpite > numeroSorteado) {
                System.out.println("O número sorteado é menor. Tente novamente.");
            } else {
                System.out.println("Parabéns! Você acertou o número em " + tentativas + " tentativas.");
            }
        }
    }
}
