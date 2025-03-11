package org.example;

//Escreva um programa para calcular a redução do tempo
//de vida de um fumante. Pergunte a quantidade de cigarros fumados
//por dias e quantos anos ele já fumou. Considere que um fumante
//
//perde 10 min de vida a cada cigarro. Calcule quantos dias de vida
//um fumante perderá e exiba o total em dias.

import java.util.Scanner;

public class Desafio01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a quantidade de cigarros fumados por dia: ");
        int cigDias = scanner.nextInt();

        System.out.print("Anos fumando: ");
        int anosFumando = scanner.nextInt();

        int minutosCigarro = 10;

        int cigarrosPorAno = cigDias *365;
        int totalCigarros = cigarrosPorAno * anosFumando;

        int minutosPerdidos = totalCigarros * minutosCigarro;
        int diasPerdidos = minutosPerdidos / 1440;

        System.out.printf("Você já perdeu %s dias de vida", diasPerdidos);
    }
}