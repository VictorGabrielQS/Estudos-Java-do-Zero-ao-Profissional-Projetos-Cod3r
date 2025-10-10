package c_heranca.Desafios.Desafio1;

public class Gerente extends Funcionario{
    @Override
    void calcularSalario() {
        System.out.println("Seu salário e : " + (salario + 2000));
    }
}
