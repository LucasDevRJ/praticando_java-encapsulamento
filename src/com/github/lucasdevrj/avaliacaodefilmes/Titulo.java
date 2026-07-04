package com.github.lucasdevrj.avaliacaodefilmes;

import java.util.ArrayList;
import java.util.List;

public class Titulo {

    private String nome;
    private List<Integer> avaliacoes = new ArrayList<>();
    private double mediaDasAvaliacoes = 0.0;

    public Titulo(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    private double getMediaDasAvaliacoes() {
        for (int i = 0; i < avaliacoes.size(); i++) {
            mediaDasAvaliacoes += avaliacoes.get(i);
        }
        mediaDasAvaliacoes = mediaDasAvaliacoes / avaliacoes.size();
        return mediaDasAvaliacoes;
    }

    public void avalia(int nota) {
        if (nota >= 1 && nota <= 5) {
            avaliacoes.add(nota);
            System.out.printf("O título \"%s\" foi avaliado com sucesso.\n", getNome());
        } else {
            System.out.println("Digite uma nota entre 1 a 5.");
        }
    }

    public void exibeMediaDasAvaliacoes() {
        System.out.println("Título: " + getNome());
        System.out.printf("Média das avaliações: %.2f\n", getMediaDasAvaliacoes());
    }
}
