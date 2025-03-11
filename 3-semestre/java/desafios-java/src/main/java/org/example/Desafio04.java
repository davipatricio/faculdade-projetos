package org.example;

// Jokenpo

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Desafio04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Escolha pedra, papel, tesoura: ");
        String jogada = scanner.next().toLowerCase();

        String[] movimentos = {"pedra", "papel", "tesoura"};

        if (!Arrays.asList(movimentos).contains(jogada)) {
            System.out.println("Movimento inválido.");
            return;
        }

        Random random = new Random();
        String jogadaComputador = movimentos[random.nextInt(3)];

        System.out.println("Você escolheu: " + jogada);
        System.out.println("O computador escolheu: " + jogadaComputador);

        // Determina o vencedor
        if (jogada.equals(jogadaComputador)) {
            System.out.println("Empate!");
        } else if ((jogada.equals("pedra") && jogadaComputador.equals("tesoura")) ||
                (jogada.equals("papel") && jogadaComputador.equals("pedra")) ||
                (jogada.equals("tesoura") && jogadaComputador.equals("papel"))) {
            System.out.println("Você venceu!");
        } else {
            System.out.println("O computador venceu!");
        }
    }
}

