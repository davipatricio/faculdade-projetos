package org.example;

import java.util.Scanner;

public class CalcSalario_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nome do Funcionário: ");
        String nome = scanner.nextLine();

        System.out.print("Salário: ");
        double salario = scanner.nextDouble();

        System.out.printf("O funcionário %s tem um salário de R$%.2f em junho.", nome, salario);

        scanner.close();
    }
}
