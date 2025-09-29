package a_Estrutura_de_Dados_List_Set_Map;


import java.util.ArrayList;
import java.util.List;

public class CollectionList {
    public static void main(String[] args) {

        List<String> nomes = new ArrayList<>();

        nomes.add("Victor");
        nomes.add("Pedro");
        nomes.add("Victor"); //Permitido Repetir

        System.out.println(nomes);
        System.out.println(nomes.get(1));

    }
}
