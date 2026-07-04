/**
 * Você está desenvolvendo um sistema para uma plataforma de streaming que deseja oferecer
 * recomendações mais precisas aos usuários. Para isso, é importante coletar avaliações
 * confiáveis e calcular médias que reflitam a qualidade real dos filmes.
 *
 * Crie uma classe que:
 *
 * Armazene o título do filme e suas avaliações. As avaliações são armazenadas em uma lista
 * Permita adicionar novas avaliações (apenas entre 1 e 5)
 * Calcule e exiba a média das avaliações com precisão decimal
 * Exemplo de entrada:
 *
 * Filme matrix = new Filme("Matrix");
 * matrix.adicionarAvaliacao(5);
 * matrix.adicionarAvaliacao(4);
 * matrix.adicionarAvaliacao(5);
 * matrix.adicionarAvaliacao(3);
 * matrix.adicionarAvaliacao(4);
 *
 * Saída esperada:
 *
 * Média de avaliações para Matrix: 4,20
 */

package com.github.lucasdevrj.avaliacaodefilmes;

public class Principal {
    public static void main(String[] args) {
        Titulo titulo1 = new Titulo("O Advogado do Diabo");
        titulo1.avalia(3);
        titulo1.avalia(4);
        titulo1.avalia(2);
        titulo1.exibeMediaDasAvaliacoes();

        Titulo titulo2 = new Titulo("A Outra História Americana");
        titulo2.avalia(5);
        titulo2.avalia(3);
        titulo2.avalia(1);
        titulo2.avalia(5);
        titulo2.exibeMediaDasAvaliacoes();
    }
}
