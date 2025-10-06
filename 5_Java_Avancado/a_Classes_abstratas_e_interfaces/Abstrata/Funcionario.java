package a_Classes_abstratas_e_interfaces.Abstrata;

//Classe abstrata
public abstract class Funcionario {

    private String nome;
    private double salario;

    public Funcionario(String nome , double salario){
        this.nome = nome;
        this.salario = salario;
    }


    // Método comum (pode ser implementado)
    public void baterPonto(){
        System.out.println(nome + " bateu o ponto!");
    }


    // Método abstrato (sem corpo)
    public abstract double calcularBonus();


    public double getSalario(){
        return salario;
    }


}
