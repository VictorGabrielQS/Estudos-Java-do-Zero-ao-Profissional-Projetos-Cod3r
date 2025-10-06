package a_Classes_abstratas_e_interfaces.Abstrata;

public class Gerente extends Funcionario {

    public Gerente(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public double calcularBonus() {
        return getSalario() + (getSalario() * 0.20); // 20% de bônus
    }

}
