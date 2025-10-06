package Projetos_Pratica.Desafio4_Tratamento_de_Erros_com_Exceptions_Customizadas;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Main {

    List<User> usuarios = new ArrayList<>();

    public  Optional<Boolean> cadastrarUsuario(User usuario) {
        try {

            if (usuario.getNome().isBlank()) {
                throw new InvalidUserException("O nome do usuário não pode estar em branco!");
            }

            if (usuario.getIdade() < 0) {
                throw new InvalidUserException("A idade do usuário não pode ser negativa!");
            }

            // Se tudo estiver certo, adiciona o usuário
            boolean adicionado = usuarios.add(usuario);
            System.out.println("Usuario Cadastrado com Sucesso ...");
            return Optional.of(adicionado);

        } catch (InvalidUserException e) {
            System.out.println("Erro ao cadastrar Usuario : " + e.getMessage());
            return Optional.empty();
        }
    }

    public static void main(String[] args) {

        Main main = new Main();
        main.cadastrarUsuario(new User("", 19));

    }
}
