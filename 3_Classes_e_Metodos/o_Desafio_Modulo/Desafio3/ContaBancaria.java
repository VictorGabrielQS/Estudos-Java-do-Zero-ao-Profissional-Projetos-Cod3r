package o_Desafio_Modulo.Desafio3;

public class ContaBancaria {
    String titular;
    static double saldo;

    void depositar(double valor) {
        System.out.println("Valor Atual : " + saldo);
        saldo += valor;
        System.out.println("Valor Após Deposito : " + saldo);
    }


    void sacar(double valor) {
        if (valor > 0) {
            System.out.println("Valor Atual : " + saldo);
            saldo -= valor;
            System.out.println("Valor Após Saque : " + saldo);

        } else {
            System.out.println("Valor de Saque não Permitido ...");

        }


    }


    void mostrarSaldo() {
        System.out.println("Saldo da conta : " + saldo);
    }

    
}
