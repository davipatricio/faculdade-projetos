package org.example;

//Desenvolva um aplicativo que tenha um procedimento
//chamado Fibonacci() que recebe um único valor inteiro como
//parâmetro, indicando quantos termos da sequência serão mostrados
//na tela. O seu procedimento deve receber esse valor e mostrar a
//quantidade de elementos solicitados.

import java.util.Scanner;

public class Desafio10 {
    public static void Fibonacci(int n) {
        int termo1 = 1, termo2 = 1;

        System.out.print(termo1 + " ");

        if (n > 1) {
            System.out.print(termo2 + " ");
        }

        for (int i = 3; i <= n; i++) {
            int proximoTermo = termo1 + termo2;
            System.out.print(proximoTermo + " ");
            termo1 = termo2;
            termo2 = proximoTermo;
        }

        System.out.println("FIM");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantos termos da sequência Fibonacci você deseja mostrar? ");
        int termos = scanner.nextInt();

        Fibonacci(termos);

        scanner.close();
    }
}
