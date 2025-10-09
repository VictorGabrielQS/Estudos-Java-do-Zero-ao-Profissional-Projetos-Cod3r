package b_Polimorfismo.Desafios.Desafio1;

public class SmsNotificacao implements Notificavel{

    @Override
    public void enviar(String msg) {
        System.out.println("🖇️ Enviando Mensagem pelo SMS : " + msg);
    }

}
