package c_heranca.Desafios.Desafio1;

public class Estagiario extends Funcionario{

    @Override
    void calcularSalario() {
        System.out.println("Seu salario e : " + (salario * 0.5) );
    }

}
