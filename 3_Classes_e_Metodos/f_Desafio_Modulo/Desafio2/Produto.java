package f_Desafio_Modulo.Desafio2;

public class Produto {

    String nome;
    double preco;
    int quantindade;


    Produto(String nome , double preco , int quantindade ){
        this.nome = nome;
        this.preco = preco;
        this.quantindade = quantindade;
    }


    double calcularEstoqueTotal(){
        return preco * quantindade;
    }




}
