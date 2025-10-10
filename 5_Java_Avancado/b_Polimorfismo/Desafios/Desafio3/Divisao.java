package b_Polimorfismo.Desafios.Desafio3;

public class Divisao  extends Operacao{
    @Override
    void executar(double a, double b) {
        System.out.println("Resultado da Divisão : " + (a / b));
    }
}
