package org.example;

import java.util.Scanner;

public class DobroTercaParte_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        double numero = scanner.nextDouble();

        double dobro = numero * 2;
        double tercaParte = numero / 3;

        System.out.println("O dobro de " + numero + " é " + dobro);
        System.out.println("A terça parte de " + numero + " é " + tercaParte);

        scanner.close();
    }
}