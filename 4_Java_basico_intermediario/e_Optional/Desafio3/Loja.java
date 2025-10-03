package e_Optional.Desafio3;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


public class Loja {


    List<Produto> produtos = new ArrayList<>();


    public Loja(){
        produtos.add(new Produto("Notebook", 3500.0));
        produtos.add(new Produto("Celular", 2000.0));
        produtos.add(new Produto("Fone", 150.0));

    }


    Optional<Produto> buscarProdutoPorNome(String nome){
        return produtos.stream()
                .filter(p -> p.getNome().equalsIgnoreCase(nome))
                .findFirst();
    }


}
