package a_Estrutura_de_Dados_List_Set_Map;

import java.util.HashSet;
import java.util.Set;

public class CollectionSet {
    public static void main(String[] args) {

        Set<String> nomes = new HashSet<>();

        nomes.add("Maria");
        nomes.add("Laura");
        nomes.add("Maria"); // Não salva elementos duplicados

        System.out.println(nomes);
        // System.out.println(nomes.get(); // Não Possui Metodo Get

        // Eu posso varrer usando um for

        for (String nome : nomes){
            System.out.println(nome);
        }


    }
}
