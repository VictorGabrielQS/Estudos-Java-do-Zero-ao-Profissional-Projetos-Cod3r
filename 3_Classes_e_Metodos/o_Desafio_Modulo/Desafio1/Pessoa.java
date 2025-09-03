package o_Desafio_Modulo.Desafio1;

import java.util.ArrayList;

public class Pessoa {

    String nome;
    double peso;
    ArrayList<String> comidasConsumidas = new ArrayList<>();

    Pessoa(String nome, double peso) {
        this.nome = nome;
        this.peso = peso;
    }


    void comer(Comida comida) {
        if (comida != null) {
            this.peso += comida.peso;
            comidasConsumidas.add(comida.nome);
        }
    }

    ArrayList<String> comidaCosumidas() {
        return comidasConsumidas;
    }

}
