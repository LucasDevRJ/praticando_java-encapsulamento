/**
 * Você está desenvolvendo um aplicativo de agenda para uma empresa. Os funcionários precisam acessar rapidamente
 * os contatos de clientes e fornecedores, mantendo as informações organizadas e fáceis de localizar.
 *
 * Crie uma classe que:
 *
 * Armazene contatos com nome e telefone em uma lista
 * Permita visualizar todos os contatos cadastrados
 * Formate a exibição para melhor legibilidade
 * Exemplo de entrada:
 *
 * contatos.add(new Contato("João Silva", "(11) 99999-0000"));
 * contatos.add(new Contato("Luana Santos", "(21) 98888-0000"));
 * contatos.add(new Contato("Pedro Oliveira", "(31) 97777-0000"));
 *
 * Saída esperada:
 *
 * 1. João Silva - (11) 99999-0000
 * 2. Luana Santos - (21) 98888-0000
 * 3. Pedro Oliveira - (31) 97777-0000
 */

package com.github.lucasdevrj.agendadecontatos;

public class Principal {
    public static void main(String[] args) {
        Agenda agenda = new Agenda();
        agenda.adicionaContato(new Contato("Rafael", "21 98765-4321"));
        agenda.adicionaContato(new Contato("João", "11 97654-3210"));
        agenda.adicionaContato(new Contato("Lucas", "31 96543-2109"));
        agenda.exibirContatos();
    }
}
