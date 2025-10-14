package d_Solid.Desafios.Desafio3;

import java.util.List;

public interface UsuarioAdmin extends Usuario {

    void banirUsuario(List<Usuario> listaDeUsuarios, String nomeUsuario);

}
