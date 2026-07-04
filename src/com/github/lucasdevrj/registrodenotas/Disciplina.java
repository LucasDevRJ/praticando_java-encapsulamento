package com.github.lucasdevrj.registrodenotas;

import java.util.ArrayList;
import java.util.List;

public class Disciplina {

    private String nome;
    private List<Double> notas = new ArrayList<>();
    private int quantidadeDeNotasValidas;
    private int quantidadeDeNotasInvalidas;
    private double mediaDasNotas;

    public Disciplina(String nome) {
        this.nome = nome;
        quantidadeDeNotasInvalidas = 0;
        quantidadeDeNotasValidas = 0;
    }

    private double getSomaTotalDasNotas() {
        double somaTotalDasNotas = 0.0;
        for (int i = 0; i < notas.size(); i++) {
            somaTotalDasNotas += notas.get(i);
        }
        return somaTotalDasNotas;
    }

    private double getMediaDasNotas() {
        mediaDasNotas = getSomaTotalDasNotas() / notas.size();
        return mediaDasNotas;
    }

    public void adicionaNota(double nota) {
        if (nota >= 0.0 && nota <= 10.0) {
            notas.add(nota);
            quantidadeDeNotasValidas++;
            System.out.println("Nota adicionada com sucesso.");
        } else {
            quantidadeDeNotasInvalidas++;
            System.out.println("Nota inválida!\nDigite uma nota entre 0 a 10.");
        }
    }

    public void exibeQuantidadesDeNotasValidasEInvalidas() {
        System.out.println("Total de notas válidas: " + quantidadeDeNotasValidas);
        System.out.println("Total de notas inválidas: " + quantidadeDeNotasInvalidas);
    }

    public void exibeMediaDasNotas() {
        System.out.println("Soma total das notas: " + getSomaTotalDasNotas());
        System.out.printf("Média em %s: %.2f\n", nome, getMediaDasNotas());
    }
}
