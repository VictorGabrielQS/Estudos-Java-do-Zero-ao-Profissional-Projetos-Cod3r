package e_While;

import java.util.Scanner;
import java.util.ArrayList;

public class DesafioWhile {

    // calcular nota de um aluno, o usaurio vai inserir a nota e
    // nota deve ser de 0 a 10
    // nota variavel total sem que for digitado um valor a nota vai ser adicionado a total
    // deve retornar quantas notas foram adicionadas e deve ficar repetindo para o usario ate ele digitar -1 para sair do laço de repetição

    public static void main(String[] args) {
     
        Scanner scanner = new Scanner(System.in);

        int notaTotal = 0;
        int quantidadeNotasInseridas = 0;
        ArrayList<Integer> notasInseridas = new ArrayList<>();
        int nota = 0;

        while (nota != -1) {

        System.out.print("Insira a nota : ");
        nota = scanner.nextInt();
      
        if (nota <= 10 && nota >= 0 && nota != -1) {
            notaTotal += nota;

            notasInseridas.add(nota);
            quantidadeNotasInseridas++;
        }
        


    }
    
    System.out.println("Valor total da nota : " + notaTotal );
    System.out.println("Total de notas inseridas : " + quantidadeNotasInseridas);
    System.out.println("Notas inseridas : " + notasInseridas);
    System.out.println("A Media e : " + notaTotal / quantidadeNotasInseridas );

        scanner.close();

    }
}
