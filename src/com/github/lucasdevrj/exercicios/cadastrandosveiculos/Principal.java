/**
 * Você está desenvolvendo um sistema para uma oficina mecânica registrar os veículos que chegam para manutenção.
 * Cada carro precisa ser identificado com algumas informações para o controle interno.
 *
 * Crie um programa que:
 *
 * Defina uma classe com os atributos modelo, placa e ano.
 * Defina uma instancia dessa classe através do método construtor.
 * Exiba as informações do veículo no console.
 *
 * Exemplo de entrada:
 * Carro gol = new Carro("Gol", "ABC-1234", 2020);
 *
 * Saída esperada:
 * Veículo cadastrado:
 * Modelo: Gol
 * Placa: ABC-1234
 * Ano: 2020
 */

package com.github.lucasdevrj.exercicios.cadastrandosveiculos;

public class Principal {
    public static void main(String[] args) {
        Veiculo veiculo1 = new Veiculo("Honda Civic EXL", "ABC1D23", 2022);
        Veiculo veiculo2 = new Veiculo("Toyota Corolla XEi", "RIO2E45", 2020);
        System.out.println(veiculo1.toString());
        System.out.println(veiculo2.toString());
    }
}
