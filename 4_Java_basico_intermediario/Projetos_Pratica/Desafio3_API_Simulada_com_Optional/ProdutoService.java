package Projetos_Pratica.Desafio3_API_Simulada_com_Optional;

import java.util.Map;
import java.util.Optional;

public class ProdutoService {

        private final Map<Integer, String> produtos = Map.of(
                1, "Notebook",
                2, "Mouse",
                3, "Teclado"
        );


    public Optional<String> buscarProdutoPorId(int id){
        return Optional.ofNullable(produtos.get(id));
    }


    public Optional<Integer> buscarPorNome(String nome){
        return produtos.entrySet().stream()
                .filter( p -> p.getValue().equalsIgnoreCase(nome))
                .map(Map.Entry::getKey)
                .findFirst();
    }


}
