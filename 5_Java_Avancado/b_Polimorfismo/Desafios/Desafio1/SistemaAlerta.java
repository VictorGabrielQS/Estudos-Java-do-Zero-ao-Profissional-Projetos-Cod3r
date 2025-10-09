package b_Polimorfismo.Desafios.Desafio1;

import java.util.List;

public class SistemaAlerta {
    void enviarNotificacoes(List<Notificavel> listaNotificacoes ){
        for (Notificavel notificacao : listaNotificacoes) {
            notificacao.enviar("Sistema em Manutenção 🔴");
        }
    }
}
