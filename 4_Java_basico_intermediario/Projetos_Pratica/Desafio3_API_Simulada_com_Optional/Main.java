package Projetos_Pratica.Desafio3_API_Simulada_com_Optional;

public class Main {


    public static void main(String[] args) {

        ProdutoService produtos = new ProdutoService();


        produtos.buscarProdutoPorId(2).ifPresentOrElse(produto ->
                System.out.println("Produto encontrado : " + produto),
                () -> System.out.println("Produto não encontrado !")
        );

        // Buscar Produto por Nome
        produtos.buscarPorNome("teclado").ifPresentOrElse(
                produto -> System.out.println("Prouto encontrado com esse nome o seu id e : " + produto),
                () -> System.out.println("Produto não encontrado com esse nome!")
        );

    }
}
