package com.github.lucasdevrj.principal;

public class Principal {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("João", 8500);
        funcionario.setCargo("Desenvolvedor de Software");

        funcionario.exibirInformacoes();
        funcionario.reajustarSalario(5);
        funcionario.exibirInformacoes();

        System.out.println();
        System.out.println("Cargo: " + funcionario.getCargo());
    }
}
