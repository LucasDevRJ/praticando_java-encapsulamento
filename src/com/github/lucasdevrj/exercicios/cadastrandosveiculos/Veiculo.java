package com.github.lucasdevrj.exercicios.cadastrandosveiculos;

public class Veiculo {

    private String modelo;
    private String placa;
    private int ano;

    public Veiculo(String modelo, String placa, int ano) {
        this.modelo = modelo;
        this.placa = placa;
        this.ano = ano;
    }

    @Override
    public String toString() {
        return """
                Veículo cadastrado: 
                Modelo: %s
                Placa: %s
                Ano: %d
                """.formatted(modelo, placa, ano);
    }
}
