package com.github.lucasdevrj.principal;

public class Funcionario {

    String nome;
    String cargo;
    double salario;

    public void exibirInformacoes() {
        System.out.printf("\nFuncionário %s - Cargo: %s - Salário %.2f", nome, cargo, salario);
    }

    public void reajustarSalario(double percentual) {
        salario += salario * (percentual / 1000);
        System.out.printf("\nNovo salário de %s é %.2f", nome, salario);
    }
}
