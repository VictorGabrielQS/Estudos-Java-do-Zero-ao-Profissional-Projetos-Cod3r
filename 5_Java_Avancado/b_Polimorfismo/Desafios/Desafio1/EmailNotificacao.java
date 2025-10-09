package b_Polimorfismo.Desafios.Desafio1;

public class EmailNotificacao implements Notificavel  {

    @Override
    public void enviar(String msg) {
        System.out.println("✉️ Enviando Mensagem pelo Email : " + msg);
    }

}
