package org.example;

import java.util.Scanner;

public class AumentoSalario_13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o salário do funcionário: ");

        double salario = scanner.nextDouble();
        double aumento = salario * 0.15;
        double novoSalario = salario + aumento;

        System.out.printf("O novo salário é R$%.2f.\n", novoSalario);

        scanner.close();
    }
}
