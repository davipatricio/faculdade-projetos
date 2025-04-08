package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Main {
    public static void main(String[] args) throws Exception {
//        int viagens = Main.transportarPedras(5,10);
        int[][] testes = {{5,10}, {10, 100}, {10,10}};

        for (int[] teste : testes) {
            int pedras = teste[0];
            int capacidade = teste[1];
            int viagens = Main.transportarPedras(pedras, capacidade);

            System.out.printf("%s pedras em um caminhão com capacidade de %skg, serão necessárias: %s viagens.\n", pedras, capacidade, viagens);

        }
    }

    public static int transportarPedras(int numPedras, int capacidadeCaminhao) throws Exception {
        if (numPedras > capacidadeCaminhao) {
            throw new Exception("O caminhão não conseguirá transportar todas as pedras.");
        }

        int deslocamentos = 0;
        List<Integer> pedras = new ArrayList<>();

        for (int i = numPedras; i >= 1; i--) {
            pedras.add(i);
        }

        while (!pedras.isEmpty()) {
            deslocamentos++;
            int capacidadeAtual = 0;
            List<Integer> novasPedras = new ArrayList<>();

            for (int peso : pedras) {
                if (capacidadeAtual + peso <= capacidadeCaminhao) {
                    capacidadeAtual += peso;
                } else {
                    novasPedras.add(peso);
                }
            }

            pedras = novasPedras;
        }

        return deslocamentos;
    }
}