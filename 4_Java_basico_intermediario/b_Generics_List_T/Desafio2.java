package b_Generics_List_T;

import java.util.ArrayList;
import java.util.List;

class Contato {

    private String nome;
    private String numero;

    public Contato(String nome , String numero){
        this.nome = nome;
        this.numero = numero;
    }


    @Override
    public String toString() {
        return nome + " - " + numero;
    }


}


public class Desafio2 {

    public static <T> void listarContatos(List<T> lista){
        for (int i = 0 ; i < lista.size(); i++){
                System.out.println("Contato " + i + " : " + lista.get(i));
        }
    }

    public static void main(String[] args) {

        List<Contato> listaDeContatos = new ArrayList<>();

        Contato contato1 = new Contato("Pedro" ,"93445-7656");
        Contato contato2 = new Contato("João" ,"95555-7656");

        listaDeContatos.add(contato1);
        listaDeContatos.add(contato2);


        listarContatos(listaDeContatos);

    }
}
