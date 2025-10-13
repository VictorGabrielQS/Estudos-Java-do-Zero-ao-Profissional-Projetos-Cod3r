package d_Solid.Desafios.Desafio2;

public class PagamentoService  {

    private Pagamento pagamento;

    public PagamentoService(Pagamento pagamento){
        this.pagamento = pagamento;

    }



    public  void realizarPagamento(double valor){
        System.out.println("\n🟩 Realizando Pagamento :");
        pagamento.processarPagamento(valor);
        System.out.println("No Valor de R$" + valor);
    }


}
