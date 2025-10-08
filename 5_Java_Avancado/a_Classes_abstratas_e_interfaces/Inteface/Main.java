package a_Classes_abstratas_e_interfaces.Inteface;


public class Main {
    public static void main(String[] args) {

        Notificavel email = new EmailService();
        email.enviarNotificacao("Bem vindo Victor!");

        Notificavel sms = new SMSService();
        sms.enviarNotificacao("Seu pedido foi enviado!");

    }
}
