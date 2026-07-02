package com.github.lucasdevrj.principal;

public class Principal {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("João", 8500);
        funcionario.setCargo("Desenvolvedor de Software");

        System.out.println("Cargo do Funcionário: " + funcionario.getCargo());
        System.out.println("Nome do Funcionário: " + funcionario.getNome());
        System.out.println("Salário do Funcionário: R$" + funcionario.getSalario());

        funcionario.exibirInformacoes();
        funcionario.reajustarSalario(5);
        funcionario.exibirInformacoes();

    }
}
