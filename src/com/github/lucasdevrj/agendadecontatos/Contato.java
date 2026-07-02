package com.github.lucasdevrj.agendadecontatos;

public class Contato {

    private String nome;
    private String celular;

    public Contato(String nome, String celular) {
        this.nome = nome;
        this.celular = celular;
    }

    public String getNome() {
        return nome;
    }

    public String getCelular() {
        return celular;
    }
}
