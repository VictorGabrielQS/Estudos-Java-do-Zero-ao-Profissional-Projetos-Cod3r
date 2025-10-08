package a_Classes_abstratas_e_interfaces.Desafios.Desafio1;

import java.util.ArrayList;
import java.util.List;

public class SistemaPagamento {

    public void processarPagamentos(List<Pagamento> pagamentos){
        for (Pagamento pagamento : pagamentos){
            pagamento.processarPagamento(100);
        }
    }

    public static void main(String[] args) {

        List<Pagamento> pagamentos = new ArrayList<>();

        SistemaPagamento sistemaPagamento = new SistemaPagamento();

        CartaoPagamento pagamento1 = new CartaoPagamento();
        PixPagamento pagamento2 = new PixPagamento();

        // adiciona os pagamentos na lista :
        pagamentos.add(pagamento1);
        pagamentos.add(pagamento2);

        sistemaPagamento.processarPagamentos(pagamentos);

    }
}
