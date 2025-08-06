package p_desafio;

import java.util.Scanner;

public class DesafioTemperatura {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha o desafio que deseja executar : \n1 - Desafio Temperatura em Fahrenheit convertida para Celsius.\n2 - Desafio Temperatura em Celsius convertida para Fahrenheit.\n3 - Desafio Calculador IMC.\n4 - Desafio Calculadora ao quadrado e ao cubo.\n5 - Desafio calculadora da área de um triangulo\n6 - Desafio Calculadora de equações do segundo grau\n");
        System.out.print("Opção desejada : ");
        int opcao = scanner.nextInt();

        if (opcao == 1) {
            Desafio1 desafio1 = new Desafio1();
            desafio1.main(args);
        }


    }

    static class Desafio1 {

        public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // 1 - Criar um programa que leia a temperatura em Fahrenheit e converta para Celsius.
        
        System.out.println("Digite a temperatura em Fahrenheit que deseja que seja calculado para Celsius ");
        System.out.print("Temperatura (°F) : ");
        
        double temperatura = scanner.nextInt();

        double resultado = (double) (temperatura - 32) / 1.8;

        String resultadoFormatado = String.format("%.2f", resultado).replace("," , ".");

        System.out.println("o resultado em (°C) : " + resultadoFormatado);

        }


    }

    static class Desafio2 {

        public static void main(String[] args) {
        
            Scanner scanner = new Scanner(System.in);

    
            // 2 - Criar um programa que leia a temperatura em Celsius e converta para Fahrenheit.
    
            System.out.print("Digite a temperatura em Celsius: ");
            int c = scanner.nextInt();

    
            
            Double f = (double) 9 / 5 * c + 32;

            System.out.println("Temperatura em Fahrenheit: " + f + " °F");

            scanner.close();
            
        }
        
    }
    



    static class Desafio3 {
        public static void main(String[] args) {
         
            // 3 - Criar um programa que leia o peso e a altura do usuário e imprima no console o IMC.

            Scanner scanner = new Scanner(System.in);

            System.out.print("Insira seu peso : ");
            double peso = scanner.nextDouble();

            System.out.print("\nInsira sua altura : ");
            double altura = scanner.nextDouble();

            System.out.println("Seu calculo IMC e : ");









            scanner.close();

            
        }
    }
}

