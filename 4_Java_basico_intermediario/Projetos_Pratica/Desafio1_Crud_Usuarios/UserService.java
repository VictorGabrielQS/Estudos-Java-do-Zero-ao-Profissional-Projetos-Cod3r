package Projetos_Pratica.Desafio1_Crud_Usuarios;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class UserService {

    List<User> usuarios = new ArrayList<>();


    public boolean AdicionarUsuario(User usuario) {

        if (usuario == null || !usuario.isValido()) {
            System.out.println("Dados Inseridos incorretos!");
            return false;
        }

        System.out.println("Usuario inserido com sucesso...");
        return usuarios.add(usuario);
    }


    public List<User> listarUsuarios() {
        return usuarios.stream()
                .toList();
    }


    public List<User> listarUsuariosMaiorDeIdade(){
       return usuarios.stream()
                .filter(user ->  user.getIdade() >= 18 )
                .toList();
    }


    public Optional<User> buscarUsuarioPorId(int id) {
        return usuarios.stream()
                .filter(usuario -> usuario.getId() == id)
                .findFirst();

    }


    public Optional<User> atualizarUsuario(int id, User userAtualizado) {

        // Procura o usuario por Id
        Optional<User> usuarioExiste = usuarios.stream()
                .filter(u -> u.getId() == id)
                .findFirst();

        // Se for encontrado o usuario, atualiza os dados
        usuarioExiste.ifPresent(u -> {
            if (userAtualizado.getNome() != null && !userAtualizado.getNome().isBlank()) {
                u.setNome(userAtualizado.getNome());
            }
            if (userAtualizado.getEmail() != null && !userAtualizado.getEmail().isBlank()) {
                u.setEmail(userAtualizado.getEmail());
            }
            if (userAtualizado.getIdade() > 0) {
                u.setIdade(userAtualizado.getIdade());
            }
        });



        return usuarioExiste;
    }


    public  Optional<User> removerUsuario(int id){

        Optional<User> usuarioExiste = usuarios.stream()
                .filter(u -> u.getId() == id)
                .findFirst();

        usuarioExiste.ifPresent(u -> usuarios.remove(u));

        return  usuarioExiste;

    }

}
