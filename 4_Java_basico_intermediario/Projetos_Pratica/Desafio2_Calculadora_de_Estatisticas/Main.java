package Projetos_Pratica.Desafio2_Calculadora_de_Estatisticas;

import java.util.List;


public class Main {

    public static void main(String[] args) {
       ResultadoEstatisticas resultado = new ResultadoEstatisticas();

        System.out.println("Soma : " + resultado.soma());
        System.out.println("Média : " + resultado.media());
        System.out.println("Maior Valor : " + resultado.maiorValor());
        System.out.println("Menor Valor : " + resultado.menorValor());
    }
}
