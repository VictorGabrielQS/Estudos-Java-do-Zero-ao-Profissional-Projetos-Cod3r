package b_Polimorfismo.Desafios.Desafio3;


import java.util.ArrayList;
import java.util.List;

public class Calcular {
    public static void main(String[] args) {

        List<Operacao> listaDeOperacoes = new ArrayList<>();

        listaDeOperacoes.add(new Soma());
        listaDeOperacoes.add(new Subtracao());
        listaDeOperacoes.add(new Multiplicacao());
        listaDeOperacoes.add(new Divisao());

        double a = 10;
        double b = 5;

        for (Operacao o : listaDeOperacoes){
            double resultado = o.executar(a , b);
            System.out.println(o.getClass().getSimpleName() + " - " + resultado);
        }

    }
}
