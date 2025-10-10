package b_Polimorfismo.Desafios.Desafio3;


public class Calcular {
    public static void main(String[] args) {
        Operacao soma = new Soma();
        soma.executar(5, 3);

        Operacao subtracao = new Subtracao();
        subtracao.executar(5, 3);

        Operacao multiplicacao = new Multiplicacao();
        multiplicacao.executar(5, 3);

        Operacao divisao = new Divisao();
        divisao.executar(5, 3);
    }
}
