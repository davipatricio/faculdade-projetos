package org.example;

public class App {
    public static void main(String[] args) {
        // Somas
        int val1 = 10;
        int val2 = 20;
        int res = val1 + val2;
        String text = "%s + %s = %s".formatted(val1, val2, res);
        System.out.printf(text);

        // Divisão
        val1 = 4;
        val2 = 2;
        res = val1 / val2;
        text = "%s / %s = %s".formatted(val1, val2, res);
        System.out.printf(text);

        // Multiplicação
        val1 = 14;
        val2 = 3;
        res = val1 * val2;
        text = "%s x %s = %s".formatted(val1, val2, res);
        System.out.printf(text);
    }
}
