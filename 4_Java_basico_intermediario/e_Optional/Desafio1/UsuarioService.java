package e_Optional.Desafio1;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class UsuarioService {

    List<Usuario> usuarios = new ArrayList<>();

    public UsuarioService(){
        usuarios.add(new Usuario("Victor","victor@gmail.com"));
        usuarios.add(new Usuario("Pedro","pedro@gmail.com"));
    }

    public Optional<Usuario> buscarUsuarioPorEmail(String email){
        return usuarios.stream()
                .filter(usuario ->  usuario.getEmail().equalsIgnoreCase(email))
                .findFirst();
    }
}
