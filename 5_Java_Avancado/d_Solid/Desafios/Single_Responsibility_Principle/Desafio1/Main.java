package d_Solid.Desafios.Single_Responsibility_Principle.Desafio1;

public class Main {
    public static void main(String[] args) {


        //Forma Bagunçada :

        UsuarioService usuario = new UsuarioService();

        usuario.cadastrarUsuario("Victor");
        usuario.cadastrarUsuario("Gabriel");
        usuario.cadastrarUsuario("Thiago");

        usuario.gerarRelatorio();
        usuario.enviarEmail();


        //Responsabilidade Única

        UsuarioRepository usuarioRepository = new UsuarioRepository();
        usuarioRepository.cadastrarUsuario("Fernanda");
        usuarioRepository.cadastrarUsuario("Taynara");

        RelatorioService relatorio = new RelatorioService(usuarioRepository);
        relatorio.gerarRelatorio();

        EmailService email = new EmailService();
        email.enviarEmail("Fernanda");
        email.enviarEmail("Taynara");



    }
}
