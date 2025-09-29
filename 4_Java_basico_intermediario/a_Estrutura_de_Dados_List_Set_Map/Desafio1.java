package a_Estrutura_de_Dados_List_Set_Map;

import java.util.*;

public class Desafio1 {

    /*

            1. Lista de nomes sem repetição
            Peça nomes ao usuário (Scanner).
            Armazene primeiro em uma List.
            Depois remova duplicados usando um Set.
            👉 Esse exercício simula cadastros onde não pode ter duplicados (ex: e-mails).

    */

    public static void main(String[] args) {

        List<String> listaDeNomes = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite 5 nomes de usuários");

        for (int i = 0; i < 5 ; i++){
            String nome;

            while (true) {
                System.out.print(": ");
                nome = scanner.nextLine();


                if (nome.isBlank()) {
                    System.out.println("Nome esta em branco tente novamente");
                } else {
                    break;
                }
            }

            System.out.println("Nome Adicionado : " + nome);
            listaDeNomes.add(nome);
        }


        Set<String> setsNome = new HashSet<>(listaDeNomes);

        System.out.println("List : " + listaDeNomes);
        System.out.println("Set : " + setsNome + "(Sem Duplicados)");



    }
}
