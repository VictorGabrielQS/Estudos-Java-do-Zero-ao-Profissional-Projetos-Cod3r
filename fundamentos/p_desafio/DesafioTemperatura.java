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
    
        // 2 - Criar um programa que leia a temperatura em Celsius e converta para Fahrenheit.

        int c = 10;

        
        Double resultado = (double) 9 / 5 * c + 32;
        
        
    }
    
}

