package l_operadores.Ternarios;

import java.util.Scanner;

public class DesafioTernario {

    static class Desafio1 {
        public static void main(String[] args) {
            Scanner entrada = new Scanner(System.in);

            System.out.print("Insira sua nota:");
            double nota = entrada.nextDouble();

            String resultado = nota >= 6 ? "Aprovado" : "Reprovado";

            System.out.println(resultado);

            entrada.close();
        }
    }


    static class Desafio2 {
        public static void main(String[] args) {
            Scanner entrada = new Scanner(System.in);

            System.out.println("Digite o numero 1 : ");
            int numero1 = entrada.nextInt();

            System.out.println("\nDigite o numero 2 : ");
            int numero2 = entrada.nextInt();

            String maior = numero1 >= numero2 ? "O numero 1 e maior que o 2 " : "O numero 2 e maior que o 1 ";
            System.out.println(maior);

            entrada.close();

        }
    }

}
