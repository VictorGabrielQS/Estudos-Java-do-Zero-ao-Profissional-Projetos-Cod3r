package b_Generics_List_T;

import java.util.List;

public class Generics {
    public static void main(String[] args) {

        BolsaNinja<String> conzinha = new BolsaNinja<>();
        conzinha.adicionarFeramenta("Faca");
        conzinha.adicionarFeramenta("Garfo");


        conzinha.retornarFerramentas();
    }
}
