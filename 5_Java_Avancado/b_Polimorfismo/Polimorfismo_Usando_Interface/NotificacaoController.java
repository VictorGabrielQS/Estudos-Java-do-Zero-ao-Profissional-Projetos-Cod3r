package b_Polimorfismo.Polimorfismo_Usando_Interface;


//🧱 6. Polimorfismo no Spring Boot (exemplo real)

//No Spring Boot, você usa polimorfismo o tempo todo.
//Por exemplo, quando injeta uma interface e troca a implementação:

/*


@Service
public class EmailNotificacao implements Notificavel {
    public void enviar(String msg) {
        System.out.println("Email enviado: " + msg);
    }
}

@Service
public class SmsNotificacao implements Notificavel {
    public void enviar(String msg) {
        System.out.println("SMS enviado: " + msg);
    }
}

@RestController
public class NotificacaoController {
    private final Notificavel notificavel;

    // Aqui o Spring decide qual implementação injetar
    public NotificacaoController(Notificavel notificavel) {
        this.notificavel = notificavel;
    }

    @GetMapping("/notificar")
    public void notificar() {
        notificavel.enviar("Bem-vindo, Victor!");
    }
}




*/
