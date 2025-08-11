package e_While;

import java.util.Scanner;

public class DesafioWhile {

    // calcular nota de um aluno, o usaurio vai inserir a nota e
    // nota deve ser de 0 a 10
    // nota variavel total sem que for digitado um valor a nota vai ser adicionado a total
    // deve retornar quantas notas foram adicionadas e deve ficar repetindo para o usario ate ele digitar -1 para sair do laço de repetição

    public static void main(String[] args) {
     
        Scanner scanner = new Scanner(System.in);

        int notaTotal = 0;
        int quantidadeNotasInseridas = 0;
        int[] notasInseridas= new int[quantidadeNotasInseridas];
        int nota = 0;

        while (nota == -1) {

        System.out.println("Insira a nota : ");
        nota = scanner.nextInt();
        notaTotal += nota;

        quantidadeNotasInseridas ++;
        notasInseridas[quantidadeNotasInseridas] = nota;


    }

        scanner.close();

    }
}
