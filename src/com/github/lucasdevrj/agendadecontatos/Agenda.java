package com.github.lucasdevrj.agendadecontatos;

import java.util.ArrayList;
import java.util.List;

public class Agenda {

    private List<Contato> contatos = new ArrayList<>();

    public void adicionaContato(Contato contato) {
        contatos.add(contato);
        System.out.println(contato.getNome() + " foi adicionado na agenda com sucesso.");
    }

    public int getQuantidadeDeContatosNaAgenda() {
        return contatos.size();
    }

    public Contato getContato(int index) {
        return contatos.get(index);
    }

    public void exibirContatos() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < getQuantidadeDeContatosNaAgenda(); i++) {
            String contato = "%d. %s - %s\n".formatted(i+1, getContato(i).getNome(), getContato(i).getCelular());
            sb.append(contato);
        }
        String resultado = sb.toString();
        System.out.println(resultado);
    }
}
