package d_Solid.Desafios.Desafio2;

public class Main {
    public static void main(String[] args) {


        Pagamento pix = new PixPagamento();
        Pagamento cartao = new CartaoCreditoPagamneto();
        Pagamento boleto = new BoletoPagamento();


        PagamentoService pagamentoService1 = new PagamentoService(pix);
        PagamentoService pagamentoService2 = new PagamentoService(cartao);
        PagamentoService pagamentoService3 = new PagamentoService(boleto);


        pagamentoService1.realizarPagamento(100.0);
        pagamentoService2.realizarPagamento(250.0);
        pagamentoService3.realizarPagamento(50);



    }
}
