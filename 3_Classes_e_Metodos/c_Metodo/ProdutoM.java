public class ProdutoM {


    String nome;
    double preco;
    double desconto;


    double precoComDesconto(){
        return this.preco - (this.preco * this.desconto );
    }

}
