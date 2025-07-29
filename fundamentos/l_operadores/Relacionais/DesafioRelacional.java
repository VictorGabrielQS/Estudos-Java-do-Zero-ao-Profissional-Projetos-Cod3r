package l_operadores.Relacionais;

import java.util.Scanner;

public class DesafioRelacional {


  static class Desafio1 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("\nDigite sua Idade : ");
        int idade1 = entrada.nextInt(); // Eu

        System.out.println("\nDigite a idade do seu Amigo : ");
        int idade2 = entrada.nextInt(); // Amigo
        
        if (idade1 > idade2) {
            System.out.println("Você é mais velho.");

        }else if(idade1 < idade2) {
            System.out.println("Seu amigo é mais velho.");

        } else if(idade1 == idade2) {
            System.out.println("Vocês têm a mesma idade.");

        }

        entrada.close();
        
    }
  }


  static class Desafio2 {
      public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);


        System.out.println("\nDigite sua Nota : ");
        int nota = entrada.nextInt();

        if (nota < 5) {
            System.out.println("Reprovado");
        }else if (nota >= 5 && nota < 7) {
            System.out.println("Em Recuperação");
        }else if (nota >= 7) {
            System.out.println("Aprovado");
        }

        entrada.close();

      }
  }

  
}
