package p_desafio;

import java.util.Scanner;

public class DesafioCalculadora {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o primeiro numero : ");
        int numero1 = entrada.nextInt();
        System.out.print("Digite o segundo numero : ");
        int numero2 = entrada.nextInt();

        System.out.println("Escolha um operador matemático:");
        System.out.println("1 - + (Adição)");
        System.out.println("2 - - (Subtração)");
        System.out.println("3 - * (Multiplicação)");
        System.out.println("4 - / (Divisão)");
        System.out.println("5 - % (Resto da divisão)");

        System.out.print("\nO numero desejado e : ");
        int operador = entrada.nextInt();

        if (operador == 1) {
            System.out.println(numero1 + numero2);
        }else if (operador == 2) {
            System.out.println(numero1 - numero2);
        }else if (condition) {
            System.out.println(numero1 * numero2);
        }else if (condition) {
            System.out.println(numero1 / numero2);
        }else if (condition) {
            System.out.println(numero1 % numero2);
        }
        else{
        
        }

    }
}
