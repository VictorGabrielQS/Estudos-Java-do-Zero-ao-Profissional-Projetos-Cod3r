package a_Classes_abstratas_e_interfaces.Inteface;

public class EmailService implements Notificavel{

    @Override
    public void enviarNotificacao(String mensagem) {
        System.out.println("Enviando Email : " + mensagem);
    }
}
