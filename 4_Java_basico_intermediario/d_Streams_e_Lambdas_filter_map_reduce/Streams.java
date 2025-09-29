package d_Streams_e_Lambdas_filter_map_reduce;

import java.util.List;

public class Streams {
    public static void main(String[] args) {

        List<Integer> numeros = List.of(1, 2, 3, 4, 5);
        List<String> nomes = List.of("Ana" , "Maria" , "Thiago" , "Fernanda" , "Yasmin" , "João");


        // Filtrando Números Pares

        List<Integer> numerosPares = numeros.stream()
                .filter(n -> n % 2 == 0)
                .toList();

        System.out.println(numerosPares);


        // Filtrando Números Maiores que 3

        List<Integer> numerosFiltrados = numeros.stream()
                .filter(n -> n > 3 )
                .toList();

        System.out.println(numerosFiltrados);

        // Soma todos os numeros da lista

        Integer resultadoSoma = numeros.stream()
                .reduce(0,(a,b) -> a + b);

        System.out.println(resultadoSoma);


        // Existe algum que atende
        Boolean existe = numeros.stream().anyMatch(n -> n >= 5);
        System.out.println(existe);




        // Filtrar nomes que possui 5 caracteres

        List<String> nomesFiltrados = nomes.stream()
                .filter(n -> n.length() > 5 )
                .toList();

        System.out.println(nomesFiltrados);


        // Pula os 2 primeiros nomes
        List<String> nomesIniciais = nomes.stream()
                .limit(2)
                .toList();
        System.out.println(nomesIniciais);
    }
}
