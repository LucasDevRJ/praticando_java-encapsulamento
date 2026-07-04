package com.github.lucasdevrj.validacaodelogin;

import java.util.Scanner;

public class Sistema {

    private String login = "aluno";
    private String senha = "alura";
    private int tentativas = 3;

    public void validarSenha() {
        Scanner entrada = new Scanner(System.in);
        do {
            System.out.print("Digite o login: ");
            String loginDigitado = entrada.nextLine();

            System.out.print("Digite a senha: ");
            String senhaDigitada = entrada.nextLine();

            tentativas--;

            boolean loginValido = loginDigitado.equals(login) && senhaDigitada.equals(senha);
            if (loginValido) {
                System.out.println("Login bem-sucedido!");
                break;
            }
            String resposta = tentativas > 0 ?
                    "Senha incorreta. Tentativas restantes: " + tentativas :
                    "Senha incorreta. Não te restam mais tentativas.";
            System.out.println(resposta);
        } while (tentativas > 0);
        entrada.close();
    }
}
