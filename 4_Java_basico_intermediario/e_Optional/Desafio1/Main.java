package e_Optional.Desafio1;


import java.util.List;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {

        UsuarioService usuarios = new UsuarioService();

        String emailDesejado = "victor@gmail.com";

        Optional<Usuario> usuarioAlvo = usuarios.buscarUsuarioPorEmail(emailDesejado);

        usuarioAlvo.ifPresentOrElse(u -> System.out.println("Usuario encontrado " + u.getNome()),
                () -> System.out.println("Usuario não Encontrado"));

    }
}
