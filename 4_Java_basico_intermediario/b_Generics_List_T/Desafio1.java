package b_Generics_List_T;


import java.util.ArrayList;
import java.util.List;

class Tarefa {

    private  String descricao;
    private boolean concluida;

    public Tarefa(String descricao){
        this.descricao = descricao;
        this.concluida = false;
    }

    public void concluir(){
        this.concluida = true;
    }

    @Override
    public String toString(){
        return  descricao + (concluida ? "✅" : "❌");
    }

}


class ListarTarefas{

    public static <T> void imprimirTarefas(List<T> lista){
        for(T tarefa : lista){
            System.out.println("Tarefa a ser feita : " + tarefa);
        }
    }

    public static void main(String[] args) {

        List<String> listaStrings = new ArrayList<>();
        listaStrings.add("Estudar Generics");


        List<Tarefa> tarefas = new ArrayList<>();
        Tarefa t1 = new Tarefa("Estudar Java");
        Tarefa t2 = new Tarefa("Estudar SpringBoot");

        tarefas.add(t1);
        tarefas.add(t2);

        t1.concluir();

        System.out.println("\n📌 Lista de Tarefas String :");
        imprimirTarefas(listaStrings);



        System.out.println("\n📌 Lista de Tarefas : ");
        imprimirTarefas(tarefas);

    }
}

public class Desafio1 {

}
