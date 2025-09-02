package j_Desafio_Atribuição_Valor_vs_Referencia.Desafio1;

public class Main {
    public static void main(String[] args) {

        Tarefa t1 = new Tarefa("Fazer 1 ");

        Tarefa t2 = new Tarefa("Fazer 2");

        System.out.println(t1.nome);

        System.out.println(t2.nome);

        t2.nome = t1.nome;

        System.out.println(t2.nome);

        t2.nome = "Fazer 3";
        t1.nome = t2.nome;


        System.out.println(t1.nome);
        System.out.println(t2.nome);


    }
}
