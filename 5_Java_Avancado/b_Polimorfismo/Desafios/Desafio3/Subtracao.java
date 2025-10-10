package b_Polimorfismo.Desafios.Desafio3;

public class Subtracao extends Operacao{
    @Override
    void executar(double a, double b) {
        System.out.println("Resultado de Subtracao : " + (a - b));
    }
}
