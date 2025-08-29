package f_Desafio_Modulo.Desafio3;

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
            System.out.println("Valor depositado com sucesso ...");
        } else {
            System.out.println("Valor inserido invalido ... ");
        }
    }

    void sacar(double valor) {
        if (valor > 00 && valor < saldo) {
            this.saldo -= valor;
            System.out.println("Valor Sacado com sucesso ...");
        } else {
            System.out.println("Valor inserido invalido ...");
        }
    }

}
