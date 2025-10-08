package a_Classes_abstratas_e_interfaces.Desafios.Desafio3;

import java.util.ArrayList;
import java.util.List;

public class SistemaAlerta {

    public void processarMensagens(List<Notificavel> mensagens){
        for (Notificavel n : mensagens){
            n.enviarMensagem("🚨 Alerta do sistema: Oi, tudo bem? Meu nome é Victor!");
        }
    }

    public static void main(String[] args) {

        List<Notificavel> listaDeMensagens = new ArrayList<>();
        SistemaAlerta sistemaAlerta = new SistemaAlerta();

        EmailService email = new EmailService();
        listaDeMensagens.add(email);

        WhatsAppService whatsApp = new WhatsAppService();
        listaDeMensagens.add(whatsApp);


        sistemaAlerta.processarMensagens(listaDeMensagens);




    }
}
