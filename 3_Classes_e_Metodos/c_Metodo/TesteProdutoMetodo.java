public class TesteProdutoMetodo {
    public static void main(String[] args) {

        ProdutoM produtoM1 = new ProdutoM();
        produtoM1.nome = "Notebook";
        produtoM1.preco = 4356.89;
        produtoM1.desconto = 0.25;


        ProdutoM produtoM2 = new ProdutoM();
        produtoM2.nome = "Caneta Preta";
        produtoM2.preco = 12.56;
        produtoM2.desconto = 0.29;


        double precoFinal = produtoM1.precoComDesconto() ;
        double precoFinal2 = produtoM2.precoComDesconto();
        double mediaCarrinho = (precoFinal + precoFinal2) / 2;

        System.out.println("O preço do " + produtoM1.nome + " com desconto é: " + precoFinal);
        System.out.println("O preço do " + produtoM2.nome + " com desconto é: " + precoFinal2);
        System.out.println("A média do carrinho é: " + mediaCarrinho);
    }
}
