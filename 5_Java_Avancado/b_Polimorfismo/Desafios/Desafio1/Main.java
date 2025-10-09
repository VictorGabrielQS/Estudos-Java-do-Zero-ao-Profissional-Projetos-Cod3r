package b_Polimorfismo.Desafios.Desafio1;

import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {

        List<Notificavel> listaNotificacoes = new ArrayList<>();

        Notificavel notificacao = new EmailNotificacao();
        listaNotificacoes.add(notificacao);

        Notificavel notificacao2 = new SmsNotificacao();
        listaNotificacoes.add(notificacao2);

        Notificavel notificacao3 = new WhatsAppNotificacao();
        listaNotificacoes.add(notificacao3);


        //Classe de alertas

        SistemaAlerta sistema = new SistemaAlerta();
        sistema.enviarNotificacoes(listaNotificacoes);

    }
}
