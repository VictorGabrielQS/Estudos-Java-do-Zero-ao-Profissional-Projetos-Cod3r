package b_Generics_List_T;

import java.util.ArrayList;
import java.util.List;

public class BolsaNinja <T> {

    // Inicializar Array
    private List<T> ferramentas;

    public  BolsaNinja(){
        this.ferramentas = new ArrayList<>();
    }

    public void adicionarFeramenta(T ferramenta){
        ferramentas.add(ferramenta);
    }

    public void retornarFerramentas(){
        for (T ferramenta : ferramentas){
            System.out.println(ferramenta);
        }
    }

}
