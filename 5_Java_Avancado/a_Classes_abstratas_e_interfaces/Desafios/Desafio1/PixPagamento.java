package a_Classes_abstratas_e_interfaces.Desafios.Desafio1;

public class PixPagamento implements Pagamento {

    @Override
    public void processarPagamento(double valor) {
        System.out.println("💵 Pagamento PIX no valor de : R$" + valor);
    }

}
