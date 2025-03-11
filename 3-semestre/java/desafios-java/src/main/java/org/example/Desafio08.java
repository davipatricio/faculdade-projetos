package org.example;

//Faça um programa que mostre os 10 primeiros elementos
//da Sequência de Fibonacci:

public class Desafio08 {
    public static void main(String[] args) {
        int termo1 = 0;
        int termo2 = 1;

        System.out.println("Os 10 primeiros termos da Sequência de Fibonacci são:");

        System.out.print(termo1 + " ");

        System.out.print(termo2 + " ");

        for (int i = 3; i <= 10; i++) {
            int proximoTermo = termo1 + termo2;
            System.out.print(proximoTermo + " ");
            termo1 = termo2;
            termo2 = proximoTermo;
        }
    }
}
