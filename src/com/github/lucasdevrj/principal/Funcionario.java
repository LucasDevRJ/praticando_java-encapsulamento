package com.github.lucasdevrj.principal;

public class Funcionario {

    private String nome;
    private String cargo;
    private double salario;
    private int controleDeReajuste = 0;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getNome() {
        return nome;
    }

    public double getSalario() {
        return salario;
    }

    public void exibirInformacoes() {
        System.out.printf("\nFuncionário %s - Cargo: %s - Salário %.2f", nome, cargo, salario);
    }

    public void reajustarSalario(double percentual) {
        if (controleDeReajuste >= 1) {
            System.out.println("\nNão pode mais fazer reajustes.");
        } else {
            controleDeReajuste++;
            salario += salario * (percentual / 100);
            System.out.printf("\nNovo salário de %s é %.2f", nome, salario);
        }
    }
}
