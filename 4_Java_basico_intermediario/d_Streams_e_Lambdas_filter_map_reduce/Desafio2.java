package d_Streams_e_Lambdas_filter_map_reduce;

import java.util.Arrays;
import java.util.List;


public class Desafio2 {
    public static void main(String[] args) {
        List<String> frases = List.of("eu gosto de Java", "Java é poderoso", "Streams são úteis");

        List<String> resultado = ModificacoesLista(frases);

        System.out.println(resultado);

    }

    public static List<String> ModificacoesLista(List<String> listaElementos){
        return listaElementos.stream()
                .flatMap(frase -> Arrays.stream(frase.split(" "))) // transforma cada frase em stream de palavras
                .distinct()
                .sorted()
                .toList();
    }

}
