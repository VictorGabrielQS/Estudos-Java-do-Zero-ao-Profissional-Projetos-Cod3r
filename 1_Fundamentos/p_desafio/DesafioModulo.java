package p_desafio;

import java.util.Scanner;

public class DesafioModulo {

  
    static class Desafio1 {

        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);

            // 1 - Criar um programa que leia a temperatura em Fahrenheit e converta para
            // Celsius.

            System.out.println("Digite a temperatura em Fahrenheit que deseja que seja calculado para Celsius ");
            System.out.print("Temperatura (°F) : ");

            double temperatura = scanner.nextInt();

            double resultado = (double) (temperatura - 32) / 1.8;

            String resultadoFormatado = String.format("%.2f", resultado).replace(",", ".");

            System.out.println("o resultado em (°C) : " + resultadoFormatado);

        }

    }

    static class Desafio2 {

        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);

            // 2 - Criar um programa que leia a temperatura em Celsius e converta para
            // Fahrenheit.

            System.out.print("Digite a temperatura em Celsius: ");
            int c = scanner.nextInt();

            Double f = (double) 9 / 5 * c + 32;

            System.out.println("Temperatura em Fahrenheit: " + f + " °F");

            scanner.close();

        }

    }

    static class Desafio3 {
        public static void main(String[] args) {

            // 3 - Criar um programa que leia o peso e a altura do usuário e imprima no
            // console o IMC.

            Scanner scanner = new Scanner(System.in);

            System.out.print("Insira seu peso : ");
            Double peso = scanner.nextDouble();

            System.out.print("\nInsira sua altura : ");
            Double altura = scanner.nextDouble();

            Double imc = peso / Math.pow(altura, 2);

            System.out.println("Seu calculo IMC e : " + imc);

            scanner.close();

        }
    }

    static class Desafio4 {
        public static void main(String[] args) {

            // 4 - Criar um programa que leia um valor e apresente os resultados ao quadrado
            // e ao cubo do valor.

            Scanner scanner = new Scanner(System.in);

            System.out.print("Digite o valor que deseja saber o  quadrado e o cubo : ");
            int valor = scanner.nextInt();

            double quadrado = Math.pow(valor, 2);
            System.out.println("Valor ao Quadrado e : " + quadrado);

            double cubo = Math.pow(valor, 3);
            System.out.println("Valor ao cubo e : " + cubo);
        }
    }

    static class Desafio5 {
        public static void main(String[] args) {

            // 5 - Criar um programa que leia o valor da base e da altura de um triângulo e
            // calcule a área.

            Scanner scanner = new Scanner(System.in);

            System.out.print("Insira o valor da base : ");
            int base = scanner.nextInt();

            System.out.print("Insira o valor da altura : ");
            int altura = scanner.nextInt();

            double area = Math.multiplyExact(base, altura) / 2.0;
            System.out.println("O valor da Área é: " + area + " cm²");

        }
    }

    static class Desafio6 {
        public static void main(String[] args) {

            // Criar um programa que resolve equações do segundo grau (ax2 + bx + c = 0)
            // utilizando a fórmula de Bhaskara. Use como exemplo a = 1, b = 12 e c = -13.
            // Encontre o delta

            Scanner scanner = new Scanner(System.in);

            System.out.print("Digite o valor do eixo a : ");
            int a = scanner.nextInt();

            System.out.print("Digite o valor do eixo b : ");
            int b = scanner.nextInt();

            System.out.print("Digite o valor do eixo c : ");
            int c = scanner.nextInt();

            // Calculo Delta : 

            double delta = Math.pow(b, 2) - 4 * a * (c);
            System.out.println("O valor do Delta e  : " + delta);

            // Fórmula de Bhaskara :

            double x1 = (-b + Math.sqrt(delta)) / 2 * a ;
            double x2 = (-b - Math.sqrt(delta))/ 2 * a ;


            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);




        }
    }


}
