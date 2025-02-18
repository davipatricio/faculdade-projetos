package org.example;

import java.util.Scanner;

public class ConversorDistancias_08 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite uma distância em metros: ");
        double metros = entrada.nextDouble();

        double quilometros = metros / 1000;
        double hectometros = metros / 100;
        double decametros = metros / 10;
        double decimetros = metros * 10;
        double centimetros = metros * 100;
        double milimetros = metros * 1000;

        System.out.println("Distância em outras unidades:");
        System.out.printf("%.2f Km\n", quilometros);
        System.out.printf("%.2f Hm\n", hectometros);
        System.out.printf("%.2f Dam\n", decametros);
        System.out.printf("%.2f dm\n", decimetros);
        System.out.printf("%.2f Cm\n", centimetros);
        System.out.printf("%.2f mm\n", milimetros);

        entrada.close();
    }
}