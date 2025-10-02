package e_Optional.Desafio3;

import java.util.*;

public class ProdutoService {
    List<Produto> produtos = new ArrayList<>();


    Optional<Produto> buscarPorNome(String nome){
        return produtos.stream()
                .filter(p -> p.getNome().equalsIgnoreCase(nome))
                .findFirst();
    }
}
