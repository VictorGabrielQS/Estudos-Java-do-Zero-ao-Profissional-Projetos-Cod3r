package e_Optional.Desafio3;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        Loja loja = new Loja();

        Optional<Produto> produtoAlvo  = loja.buscarProdutoPorNome("Notebook");

        produtoAlvo.map(Produto::getPreco).ifPresentOrElse(
                preco -> System.out.println("Preço : " + preco )
                , () -> System.out.println("Produto não encontrado")
        );
    }
}
