/**
 * Você está desenvolvendo um sistema de autenticação para um aplicativo bancário. Os usuários precisam ter total
 * segurança de que suas senhas não podem ser alteradas sem autorização, mesmo que alguém tenha acesso temporário
 * ao dispositivo.
 *
 * Crie uma classe que:
 *
 * Armazene com segurança a senha do usuário
 * Permita alterar a senha apenas com a confirmação da senha atual
 * Forneça feedback sobre o resultado da operação
 * Exemplo de entrada:
 *
 * Usuario user = new Usuario("123456");
 * user.setSenha("123456", "abc123");
 *
 * Saída esperada:
 * Em caso de sucesso:
 * Senha alterada com sucesso!
 *
 * Em caso de falha:
 * Senha atual incorreta. A senha não foi alterada.
 */

package com.github.lucasdevrj.controledesenha;

public class Principal {
    public static void main(String[] args) {
        Login login = new Login("javão");
        login.setSenha("java", "JavaScript");
        login.setSenha("javão", "Python");
    }
}
