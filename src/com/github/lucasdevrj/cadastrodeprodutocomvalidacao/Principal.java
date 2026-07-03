/**
 * Imagine que você é responsável pelo módulo de cadastro de um sistema de gestão de estoque. Durante o processo de
 * entrada de mercadorias, é crítico evitar que produtos sejam registrados com valores inconsistentes,
 * pois isso poderia causar problemas financeiros e operacionais.
 *
 * Seu desafio é implementar uma proteção que impeça a atribuição de preços negativos aos produtos,
 * garantindo que o sistema mantenha dados confiáveis.
 *
 * Crie um programa que:
 *
 * Defina uma classe para representar um produto com nome e preço.
 * Valide se o preço é um valor não negativo antes de atualizá-lo.
 * Se o valor for negativo, então deverá ser redefinido para 0.00.
 * Exiba uma mensagem quando a validação falhar.
 * Por fim, exiba uma mensagem com os dados do produto.
 * Exemplo de entrada:
 *
 * nome = "Mouse"
 * preco = -59.90
 *
 * Saída esperada:
 *
 * Preço inválido.
 * Produto: Mouse
 * Preço: 0,00
 */

package com.github.lucasdevrj.cadastrodeprodutocomvalidacao;

import java.math.BigDecimal;

public class Principal {
    public static void main(String[] args) {
        Produto produto1 = new Produto("Gabinet", new BigDecimal("-10.0"));
        Produto produto2 = new Produto("Controle", new BigDecimal("0.0"));
        Produto produto3 = new Produto("Monitor", new BigDecimal("500.00"));
        Produto produto4 = new Produto("Teclado", new BigDecimal("-90.00"));
        Produto produto5 = new Produto("Fone", new BigDecimal("50.00"));
        System.out.println(produto1);
        System.out.println(produto2);
        System.out.println(produto3);
        System.out.println(produto4);
        System.out.println(produto5);
    }
}
