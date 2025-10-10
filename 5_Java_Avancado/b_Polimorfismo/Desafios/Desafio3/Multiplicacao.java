package b_Polimorfismo.Desafios.Desafio3;

public class Multiplicacao extends Operacao {
    @Override
    void executar(double a, double b) {
        System.out.println("Resultado da Multiplicacao : " + (a * b));
    }
}
