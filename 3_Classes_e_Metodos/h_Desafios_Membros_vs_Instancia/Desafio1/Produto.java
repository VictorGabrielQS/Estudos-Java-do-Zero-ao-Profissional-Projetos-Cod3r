package h_Desafios_Membros_vs_Instancia.Desafio1;

public class Produto {

    String nome;
    double preco;
    final static double desconto = 0.20 ;

    Produto(String nome , double preco){
        this.nome = nome;
        this.preco = preco;
    }

    double calcularDesconto(){
        double precoComDesconto = preco - ( preco * desconto);
        return Math.round(precoComDesconto);
    }

    void resulmoProduto(){
        System.out.println("O produto " + this.nome + " ficou com o preço final de R$"+ calcularDesconto());
    }

}
