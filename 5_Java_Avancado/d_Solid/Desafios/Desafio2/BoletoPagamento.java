package d_Solid.Desafios.Desafio2;

public class BoletoPagamento implements Pagamento{

    @Override
    public void processarPagamento(double valor) {
        System.out.println("⬜ Processando o Pagamento no Boleto ...");
    }

}
