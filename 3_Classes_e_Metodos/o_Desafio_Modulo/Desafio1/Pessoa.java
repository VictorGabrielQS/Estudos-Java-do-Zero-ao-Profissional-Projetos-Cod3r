package o_Desafio_Modulo.Desafio1;

public class Pessoa {

    String nome;
    double peso;

    Pessoa(String nome , double peso){
        this.nome = nome;
        this.peso = peso;
    }


    void comer(Comida comida){
        this.peso += comida.peso;
    }

}
