package Projetos_Pratica.Desafio2_Calculadora_de_Estatisticas;

import java.util.List;

public class ResultadoEstatisticas {
    List<Double> numeros = List.of(5.0, 8.2, 3.7, 10.0, 2.1);


    public Double soma(){
        return  numeros.stream()
                .mapToDouble(n -> n)
                .sum();
    }


    public Double media(){
        return  numeros.stream()
                .mapToDouble(n -> n)
                .average()
                .orElse(0.0);
    }


    public Double maiorValor(){
        return numeros.stream()
                .mapToDouble(n -> n)
                .max()
                .orElse(0.0);
    }


    public Double menorValor(){
        return numeros.stream()
                .mapToDouble(n -> n )
                .min()
                .orElse(0.0);
    }
}
