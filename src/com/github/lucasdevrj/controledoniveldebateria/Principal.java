/**
 * Imagine que você está desenvolvendo um sistema para dispositivos portáteis, onde precisa monitorar o nível de
 * energia da bateria. O dispositivo deve informar ao usuário o status atual da bateria, garantindo que os valores
 * sempre estejam dentro de um intervalo válido.
 *
 * Crie um programa que:
 *
 * Defina uma classe que armazene o nível da bateria.
 * Permita definir o nível apenas se estiver entre 0 e 100.
 * Forneça uma forma de exibir o status da bateria com base no nível atual:
 * Até 20%: “Bateria fraca”
 * Entre 21% e 79% : “Bateria ok”
 * Igual ou acima de 80%: “Bateria cheia”
 * Instancie essa classe, defina um nível e exiba o status.
 * Exemplo de entrada:
 *
 * Bateria b = new Bateria();
 * b.setNivel(85);
 *
 * Saída esperada:
 *
 * Status: Bateria cheia
 */

package com.github.lucasdevrj.controledoniveldebateria;

public class Principal {
    public static void main(String[] args) {
        Controle controle1 = new Controle();
        Controle controle2 = new Controle();
        Controle controle3 = new Controle();
        Controle controle4 = new Controle();
        Controle controle5 = new Controle();

        controle1.setNivelDeBateria(12);
        controle2.setNivelDeBateria(45);
        controle3.setNivelDeBateria(82);
        controle4.setNivelDeBateria(100);
        controle5.setNivelDeBateria(0);

        System.out.println(controle1);
        System.out.println(controle2);
        System.out.println(controle3);
        System.out.println(controle4);
        System.out.println(controle5);
    }
}
