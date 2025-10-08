package a_Classes_abstratas_e_interfaces.Desafios.Desafio2;

public class Gerente extends Funcionario {


    public Gerente(String nome, double salario) {
        super(nome, salario);
    }


    @Override
    double calcularBonus() {
        return getSalario() + ( getSalario() * 0.20);
    }


}
