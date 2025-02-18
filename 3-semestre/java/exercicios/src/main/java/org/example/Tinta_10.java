package org.example;
import java.util.Scanner;

public class Tinta_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a largura da parede: ");
        double largura = scanner.nextDouble();

        System.out.print("Digite a altura da parede: ");
        double altura = scanner.nextDouble();

        double area = largura * altura;

        double litrosTinta = area / 2;

        System.out.printf("A área da parede é de %.2f metros quadrados.\n", area);
        System.out.printf("A quantidade de tinta necessária é de %.2f litros.\n", litrosTinta);

        scanner.close();
    }
}