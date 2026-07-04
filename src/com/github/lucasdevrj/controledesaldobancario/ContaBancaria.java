package com.github.lucasdevrj.controledesaldobancario;

import java.math.BigDecimal;

public class ContaBancaria {

    private String titular;
    private BigDecimal saldo = BigDecimal.ZERO;

    public ContaBancaria(String titular) {
        this.titular = titular;
    }

    public String getTitular() {
        return "Titular: " + titular;
    }

    public String getSaldo() {
        return "Saldo atual: R$%s".formatted(saldo);
    }

    public void exibe() {
        System.out.println(getTitular());
        System.out.println(getSaldo());
    }

    public void depositar(BigDecimal valor) {
        if (valor.compareTo(BigDecimal.ZERO) > 0) {
            saldo = saldo.add(valor);
            System.out.printf("O valor de R$%.2f foi depositado com sucesso.\n", valor);
        } else {
            System.out.printf("Digite um valor maior que %s para depositar.\n", BigDecimal.ZERO);
        }
        exibe();
    }

    public void sacar(BigDecimal valor) {
        if (valor.compareTo(saldo) < 0) {
            saldo = saldo.subtract(valor);
            System.out.printf("O saque de R$%.2f foi realizado com sucesso.\n", valor);
        } else {
            System.out.println("Saldo insuficiente.");
        }
        exibe();
    }
}
