package a_Estrutura_de_Dados_List_Set_Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Desafio2 {

        /*
       2. Contagem de palavras

        - Leia uma frase do usuário.
        - Separe as palavras (split).
        - Use um `Map<String, Integer>` para contar quantas vezes cada palavra aparece.

         👉 Esse exercício é útil para analisar logs, contar frequência de termos em busca, etc.

        */

        public static void main(String[] args) {
        /*    Scanner scanner = new Scanner(System.in);
            System.out.println("Digite 5 nomes de usuários");*/

            String frase = "Meu nome e Victor Gabriel meu";
            String[] palavras = frase.trim().toLowerCase().split("\\s+");

            Map<String, Integer> contagemLetras = new HashMap<>();


            for (String palavra : palavras) {
                if (contagemLetras.containsKey(palavra)) {
                    contagemLetras.put(palavra, contagemLetras.get(palavra) + 1);
                } else {
                    contagemLetras.put(palavra, 1);
                }
            }


            for(Map.Entry<String , Integer> entry : contagemLetras.entrySet()){

                System.out.println(entry.getKey() + " -> " + entry.getValue());

            }


        }
}
