package o_Desafio_Modulo.Desafio1;

public class Jantar {
    public static void main(String[] args) {

        Pessoa p1 = new Pessoa("Victor", 82.00);

        Comida comida1 = new Comida("Maçã", 0.50);

        Comida comida2 = new Comida("Pera", 0.50);


        p1.comer(comida1);

        p1.comer(comida2);


        System.out.println("Peso da pessoa 1 após comer e : " + p1.peso);

        System.out.println("A Pessoa 1 consumiu as seguintes comidas : " + p1.comidaCosumidas());

    }
}
