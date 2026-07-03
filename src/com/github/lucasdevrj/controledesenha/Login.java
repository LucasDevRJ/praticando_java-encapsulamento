package com.github.lucasdevrj.controledesenha;

public class Login {

    private String senha;

    public Login(String senha) {
        this.senha = senha;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha, String novaSenha) {
        if (getSenha().equals(senha)) {
            this.senha = novaSenha;
            System.out.println("Senha alterada com sucesso!");
        } else {
            System.out.println("Senha atual incorreta. A senha não foi alterada.");
        }
    }
}
