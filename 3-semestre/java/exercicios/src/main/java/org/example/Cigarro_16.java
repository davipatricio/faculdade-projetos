package org.example;

import java.util.Scanner;

public class Cigarro_16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantos cigarros você fuma por dia? ");
        int cigarrosDia = scanner.nextInt();

        System.out.print("Há quantos anos você fumaa? ");
        double anos = scanner.nextDouble();

        int totalCigarros = (int)((double)cigarrosDia * anos * 365);
        int minutosPerdidos = totalCigarros * 10;

        double diasPerdidos = minutosPerdidos / (24.0 * 60.0);

        System.out.printf("Você já perdeu aproximadamente %.2f dias de vida.\n", diasPerdidos);

        scanner.close();

    }
}
