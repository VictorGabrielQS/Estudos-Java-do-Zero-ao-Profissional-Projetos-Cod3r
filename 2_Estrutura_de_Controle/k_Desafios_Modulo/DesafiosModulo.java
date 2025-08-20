package k_Desafios_Modulo;

import java.util.Scanner;

public class DesafiosModulo {

    static class Desafio1 {
        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);

            System.out.print("DIgite um numero : ");
            int numero = scanner.nextInt();

            if (numero <= 10) {
                System.out.println("O numero esta entre 10");
            } else {
                System.out.println("O numero não esta entre 10");
            }

            if (numero % 2 == 0) {
                System.out.println("E o numero e par ");

            } else {
                System.out.println("O numero e Impar");
            }

        }
    }

    static class Desafio2 {
        public static void main(String[] args) {

            int ano = 2100;

            if ((ano % 400 == 0) || (ano % 4 == 0 && ano % 100 != 0)) {
                System.out.println("O ano e bissexto ... ");

            } else {
                System.out.println("O ano não e bissexto...");
            }

        }
    }

    static class Desafio3 {
        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);

            System.out.print("Digite a primeira nota : ");
            double nota1 = scanner.nextInt();

            System.out.print("Digite a primeira nota : ");
            double nota2 = scanner.nextInt();

            double media = (nota1 + nota2) / 2;

            System.out.println("A media e : " + media);

            if (media >= 7) {
                System.out.println("Aprovado ... ");
            } else if (media < 7 && media > 4) {
                System.out.println("Recuperação ...");
            } else {
                System.out.println("Reprovado ...");
            }

        }
    }

    
    static class Desafio4 {
        public static void main(String[] args) {
        
            int numero = 21;
            boolean ehPrimo = true;

            if (numero <= 1) {
                ehPrimo = false;
            }else{
                for (int i = 2; i < numero; i++) {
                    if (numero % i == 0) {
                        ehPrimo = false;
                        break;
            }
          }
                
            }

            if (ehPrimo) {
                System.out.println("O Numero e primo ...");
            }else{
                System.out.println("O Numero não e primo ...");
            }
        
        
        }
    }


    

}
