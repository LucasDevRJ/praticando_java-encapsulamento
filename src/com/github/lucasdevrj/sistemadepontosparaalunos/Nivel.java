package com.github.lucasdevrj.sistemadepontosparaalunos;

public enum Nivel {
    NIVEL_1("Nível 1"),
    NIVEL_2("Nível 2"),
    NIVEL_3("Nível 3");

    private String nivel;

     Nivel(String nivel) {
        this.nivel = nivel;
     }

    @Override
    public String toString() {
        return nivel;
    }
}
