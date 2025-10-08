package a_Classes_abstratas_e_interfaces.Desafios.Desafio3;

public class EmailService implements Notificavel{

    @Override
    public void enviarMensagem(String mensagem) {
        System.out.println("📩 Mensagem sendo enviado do Email : " + mensagem);
    }

}
