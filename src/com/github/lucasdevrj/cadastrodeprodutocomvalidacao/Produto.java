package com.github.lucasdevrj.cadastrodeprodutocomvalidacao;

import java.math.BigDecimal;

public class Produto {

    private String nome;
    private BigDecimal preco;

    public Produto(String nome, BigDecimal preco) {
        this.nome = nome;
        if (preco.compareTo(BigDecimal.ZERO) > 0) {
            this.preco = preco;
        } else {
            this.preco = BigDecimal.ZERO;
        }
    }

    public String getNome() {
        return nome;
    }

    public BigDecimal getPreco() {
        return preco;
    }

    @Override
    public String toString() {
        String produtoValido =  getPreco().compareTo(BigDecimal.ZERO) > 0 ? "" : "Produto inválido";
        return "%s\nProduto: %s\nPreço: R$%s\n".formatted(produtoValido, getNome(), getPreco());
    }
}
