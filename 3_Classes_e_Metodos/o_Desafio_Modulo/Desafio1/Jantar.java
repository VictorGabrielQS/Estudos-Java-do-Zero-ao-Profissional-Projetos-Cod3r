package o_Desafio_Modulo.Desafio1;

public class Jantar {
    public static void main(String[] args) {

        // Metodo main

        Pessoa pessoa = new Pessoa("Victor", 83.0);

        Comida arroz = new Comida("Arroz", 0.250);
        Comida feijao = new Comida("Feijão", 0.300);

        System.out.println(pessoa.nome + " pesa " + pessoa.peso + " kg");

        pessoa.comer(arroz);
        pessoa.comer(feijao);

        System.out.println("Depois do jantar...");
        System.out.println(pessoa.nome + " agora pesa " + pessoa.peso + " kg");

    }
}
