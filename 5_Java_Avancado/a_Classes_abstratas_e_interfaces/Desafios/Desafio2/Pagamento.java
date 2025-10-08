package a_Classes_abstratas_e_interfaces.Desafios.Desafio2;

public class Pagamento {
    public static void main(String[] args) {

        Funcionario funcionario1 = new Vendedor("Pedro" , 3000.0);
        Funcionario funcionario2 = new Gerente("Fernando" , 5000.0);

        System.out.println("O salario do Funcionario 1 : R$"+ funcionario1.calcularBonus());
        System.out.println("O salario do Funcionario 2 : R$"+ funcionario2.calcularBonus());
    }
}
