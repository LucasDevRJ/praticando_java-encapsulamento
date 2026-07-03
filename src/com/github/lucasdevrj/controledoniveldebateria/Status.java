package com.github.lucasdevrj.controledoniveldebateria;

public enum Status {
    BATERIA_FRACA("Bateria Fraca"),
    BATERIA_OK("Bateria Ok"),
    BATERIA_CHEIA("Bateria Cheia");

    private final String valor;

    Status(String valor) {
        this.valor = valor;
    }

    public String getValor() {
        return valor;
    }
}
