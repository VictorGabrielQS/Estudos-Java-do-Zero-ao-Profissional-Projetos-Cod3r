package h_Switch;

import java.util.Scanner;

public class DesafioSwitch {

    
    static class Desafio1 {

        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);

            System.out.print("Digite a letra do teclado : ");
            String entrada = scanner.nextLine().trim().toUpperCase();

            switch (entrada) {

                case "C":
                    System.out.println("Copiar");
                    break;

                case "V":
                    System.out.println("Colar");
                    break;

                case "X":
                    System.out.println("Recortar");
                    break;

                case "Z":
                    System.out.println("Desfazer");
                    break;

                default:
                    System.out.println("Atalho Inválido");
                    break;

            }

        }
    }


    static class Desafio2 {
        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);

            Double resultado;

            System.out.print("Digite o primeiro numero : ");
            Double primeiroNumero = scanner.nextDouble();

            System.out.print("Digite o segundo numero : ");
            Double segundoNumero = scanner.nextDouble();

            System.out.print("Escolha a Operação Desejada : ");
            String operacao = scanner.next().trim();

            switch (operacao) {

                case "+":
                    System.out.println("O resultado e : " + (resultado = primeiroNumero + segundoNumero) );
                    break;

                case "-":
                    System.out.println("O resultado e : " + (resultado = primeiroNumero - segundoNumero));
                    break;

                case "*":
                System.out.println("O resultado e : " + (resultado = primeiroNumero * segundoNumero));
                    break;

                case "/":
                    if (primeiroNumero != 0 && segundoNumero != 0) {
                        System.out.println("O resultado e : " + (resultado = primeiroNumero / segundoNumero));
                    } else {
                        System.out.println("Não e possivel realizar a divisão porque um dos numeros inseridos e 0");
                    }

                    break;

                default:
                System.out.println("Valor inserido invalido...");
                    break;
            }

        }
    }


}
