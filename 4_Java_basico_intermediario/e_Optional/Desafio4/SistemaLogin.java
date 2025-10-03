package e_Optional.Desafio4;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class SistemaLogin {
    List<Usuario> usuarios = new ArrayList<>();


    public SistemaLogin(){
        usuarios.add(new Usuario("victor@email.com", "1234"));
        usuarios.add(new Usuario("ana@email.com", "abcd"));
    }


    Optional<Usuario> fazerLogin(String email , String senha){
        return usuarios.stream()
                .filter( u -> u.getEmail().equalsIgnoreCase(email) && u.getSenha().equalsIgnoreCase(senha))
                .findFirst();

    }


}
