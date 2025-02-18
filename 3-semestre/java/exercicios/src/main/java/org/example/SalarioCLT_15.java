package org.example;

import java.util.Scanner;

public class SalarioCLT_15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número de dias trabalhados no mês: ");
        int diasTrabalhados = scanner.nextInt();

        double salario = diasTrabalhados * 8 * 25;

        System.out.printf("O salário do funcionário é de R$%.2f.\n", salario);

        scanner.close();
    }
}
