package e_While;

import java.util.Scanner;

public class WhileIndeterminado {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String palavraChave = "";
        int tentativas = 0;

        while (!palavraChave.equals( "sair")) {

            System.out.print("Digite a palavra correta : ");
            palavraChave = scanner.next().trim().toLowerCase();

            
            if (!palavraChave.equals("sair")) {
                System.out.println("Palavra incorreta tente novamente ! ");
                tentativas ++;
            }

        }
        
        System.out.println("Acertou a palavra chave Parabens ...");
        
        scanner.close();
    }
}
