package a_Estrutura_de_Dados_List_Set_Map;

import java.util.HashMap;
import java.util.Map;

public class CollectionMap {
    public static void main(String[] args) {
        Map<String, Integer> usuarios = new HashMap<>();

        usuarios.put("Victor", 21);
        usuarios.put("Thalita", 20);
        usuarios.put("Victor", 25);// sobrescreve a chave "Victor"

        System.out.println(usuarios);
        System.out.println(usuarios.get("Thalita"));

    }
}
