package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Main.transportarPedras(5,10);
    }

    public static void transportarPedras(int numPedras, int capacidadeCaminhao) {
        List<Integer> pedras = new ArrayList<Integer>();

        for (int nPedra = 0; nPedra<numPedras; nPedra++) {
            pedras.add(nPedra+1);
        }

        pedras = pedras.reversed();

        int deslocamentos = 0;

        while (!pedras.isEmpty()) {
            deslocamentos++;
            int capacidadeAtual = 0;
            List<Integer> novasPedras = new ArrayList<Integer>();

            for (int pedraId = 0; pedraId < pedras.size(); pedraId++){
                int pesoPedra = pedras.get(pedraId);
                if (capacidadeAtual + pesoPedra <= capacidadeCaminhao) {
                    capacidadeAtual += pesoPedra;
                } else {
                    novasPedras.add(pesoPedra);
                }
            }

            pedras = novasPedras;
        }

        System.out.println(deslocamentos);
    }
}