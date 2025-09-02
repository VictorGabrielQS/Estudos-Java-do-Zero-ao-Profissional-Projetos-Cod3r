package c_Metodo;

public class Produto {
    String nome;
    double preco;
    double desconto;


    double precoComDesconto(){
        return this.preco - (this.preco * this.desconto );
    }

}
