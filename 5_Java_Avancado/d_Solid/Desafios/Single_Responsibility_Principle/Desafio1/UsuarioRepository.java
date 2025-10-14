package d_Solid.Desafios.Single_Responsibility_Principle.Desafio1;

import java.util.ArrayList;
import java.util.List;

public class UsuarioRepository {
    List<String> listaUsuarios = new ArrayList<>();

    void  cadastrarUsuario(String nomeUsuario){
        if (!nomeUsuario.isBlank()) {
            listaUsuarios.add(nomeUsuario);
        }
    }

}
