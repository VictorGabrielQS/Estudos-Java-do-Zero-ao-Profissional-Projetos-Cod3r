package l_This_e_This_Parametro;

public class Pessoa {
    String nome;
    int idade;

    Pessoa(){
        this("Desconhecido" , 0 );
        System.out.println("Construtor sem parametro chamado ... ");
    }

    Pessoa(String nome , int idade){
        this.nome = nome;
        this.idade = idade;
        System.out.println("Construtor com parametro chamado ... ");
    }


}
