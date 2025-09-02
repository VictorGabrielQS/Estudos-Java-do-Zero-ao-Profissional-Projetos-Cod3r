package f_Desafios_Construtores.Desafio3;

public class Main {
    public static void main(String[] args) {

        ContaBancaria conta1 = new ContaBancaria("Victor");
        conta1.depositar(10);
        System.out.println(conta1.saldo);
        conta1.sacar(5);
        System.out.println(conta1.saldo);

    }
}
