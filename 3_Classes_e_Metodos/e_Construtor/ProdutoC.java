package e_Construtor;

public class ProdutoC {

    String nome;
    double preco;
    double desconto;

    // Construtor com parâmetro
    ProdutoC(String nomeInicial){
        nome = nomeInicial;
    }

    // Construtor padrão (sem parâmetros)
    ProdutoC(){

    }

    // Construtor com dois parâmetros
    ProdutoC(String nomeInicial, double precoInicial){
        nome = nomeInicial;
        preco = precoInicial;
    }


    double precoComDesconto() {
        return preco * (1 - desconto);
    }

    double precoComDesconto(double descontoDoGerente) {
        return preco * (1 - desconto + descontoDoGerente);
    }


}