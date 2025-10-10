package b_Polimorfismo.Desafios.Desafio3;

public class Soma extends Operacao {

    @Override
    void executar(double a, double b) {
        System.out.println("Resultado de Soma : " + (a + b));
    }
}
