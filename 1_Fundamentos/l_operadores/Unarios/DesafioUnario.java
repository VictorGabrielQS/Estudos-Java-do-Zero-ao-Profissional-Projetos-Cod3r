package l_operadores.Unarios;

import java.util.Scanner;

public class DesafioUnario {

    static class Desafio1 {
        public static void main(String[] args) {

            Scanner entrada = new Scanner(System.in);

            System.out.println("Digite o numero que deseja declementar : ");
            int n = entrada.nextInt();


            while (n >= 2) {
                System.out.println(n);
                n--;
            }

            entrada.close();
        }
    }


    static class Desafio2 {
        public static void main(String[] args) {

            boolean luzLigada = false;

            for (int i = 0; i < 5; i++) {
                System.out.printf("\nLuz ligada ?%s", luzLigada + " Vez%s", i);
            }
        }

    }
}
