package com.github.lucasdevrj.sistemadepontosparaalunos;

public class Aluno {

    private String nome;
    private int pontos;
    private Nivel nivel;

    public Aluno(String nome) {
        this.nome = nome;
        nivel = Nivel.NIVEL_1;
    }

    public int getPontos() {
        return pontos;
    }

    public void setPontos(int pontos) {
        this.pontos += pontos;
    }

    public Nivel getNivel() {
        return nivel;
    }

    public void setNivel(Nivel nivel) {
        this.nivel = nivel;
    }

    public void ganharPontos(int pontos) {
        if (!nivel.equals(Nivel.NIVEL_3) && this.pontos < 299) {
            if (pontos >= 0 && pontos <= 299) {
                setPontos(pontos);
                if (this.pontos <= 99) {
                    setNivel(Nivel.NIVEL_1);
                } else if (this.pontos <= 199) {
                    setNivel(Nivel.NIVEL_2);
                } else {
                    setNivel(Nivel.NIVEL_3);
                }
                System.out.println("Pontos adicionados com sucesso.");
            } else {
                System.out.println("Adicione pontos de 0 a 299.");
            }
        } else {
            System.out.println("Nível máximo já atingido.");
        }
    }

    public void exibirStatus() {
        String status = String.format("Nome: %s\nPontos: %d\nNível: %s", nome, pontos, nivel);
        System.out.println(status);
    }

}
