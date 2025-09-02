package f_Desafios_Construtores.Desafio3;

public class ContaBancaria {

    String titular;
    double saldo;


    ContaBancaria(String titular) {
        this.titular = titular;
        saldo = 0.00;

    }

    void depositar(double valor) {
        if (valor > 0.00) {
            this.saldo += valor;
            System.out.println("----------------------------------");
            System.out.println("Valor depositado com sucesso ...");
            System.out.println("Valor após o deposito e R$" + saldo);
            System.out.println("----------------------------------");
        } else {
            System.out.println("Valor inserido invalido ... ");
        }
    }

    void sacar(double valor) {
        if (valor > 00 && valor < saldo) {
            this.saldo -= valor;
            System.out.println("-------------------------------");
            System.out.println("Valor Sacado com sucesso ...");
            System.out.println("Valor após o saque e R$" + saldo);
            System.out.println("--------------------------------");
        } else {
            System.out.println("Valor inserido invalido ...");
        }
    }

}
