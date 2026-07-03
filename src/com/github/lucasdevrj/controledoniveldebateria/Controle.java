package com.github.lucasdevrj.controledoniveldebateria;

public class Controle {

    private int nivelDeBateria;
    private Status status;

    public int getNivelDeBateria() {
        return nivelDeBateria;
    }

    public String getStatus() {
        return status.getValor();
    }

    public void setNivelDeBateria(int nivelDeBateria) {
        if (nivelDeBateria >= 0.0 && nivelDeBateria <= 100) {
            if (nivelDeBateria <= 20) {
                status = Status.BATERIA_FRACA;
            } else if (nivelDeBateria <= 79) {
                status = Status.BATERIA_OK;
            } else {
                status = Status.BATERIA_CHEIA;
            }
            this.nivelDeBateria = nivelDeBateria;
        } else {
            System.out.println("Digite um nível de bateria de 0 a 100.");
        }
    }

    @Override
    public String toString() {
        return "%d%% - %s".formatted(getNivelDeBateria(), getStatus());
    }
}
