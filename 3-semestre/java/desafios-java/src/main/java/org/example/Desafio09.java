package org.example;

//Crie uma lógica que preencha um vetor de 20 posições
//com números aleatórios (entre 0 e 99) gerados pelo computador.
//Logo em seguida, mostre os números gerados e depois coloque o
//vetor em ordem crescente, mostrando no final os valores ordenados.


import java.util.Arrays;
import java.util.Random;

public class Desafio09 {
    public static void main(String[] args) {
        int[] vetor = new int[20];

        Random random = new Random();

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = random.nextInt(100);
        }

        System.out.println("Números gerados:");
        for (int num : vetor) {
            System.out.print(num + " ");
        }

        Arrays.sort(vetor);

        System.out.println("\n\nNúmeros ordenados em ordem crescente:");
        for (int num : vetor) {
            System.out.print(num + " ");
        }
    }
}
