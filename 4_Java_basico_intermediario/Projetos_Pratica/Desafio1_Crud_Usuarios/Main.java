package Projetos_Pratica.Desafio1_Crud_Usuarios;

public class Main {
    public static void main(String[] args) {

        UserService userService = new UserService();

        // Adicionando usuario
        userService.AdicionarUsuario(new User( 0, "Victor" , "victor@gmail.com" , 20 ));
        userService.AdicionarUsuario(new User( 0, "Victor" , "victor@gmail.com" , 2 ));


        // Lista Usuarios
        userService.listarUsuarios().forEach(user ->
                        System.out.println(
                                        user.getNome() + " - " +
                                        user.getEmail() + " - " +
                                        user.getIdade())
                );

        // Buscar usuario por id
        userService.buscarUsuarioPorId(1).ifPresentOrElse( user ->

                        System.out.println("Usuario encontrado : " +
                                user.getNome() + " - " +
                                user.getEmail() + " - " +
                                user.getIdade())

                ,() -> System.out.println("Usuario não encontrado")
        );


        //Buscar usuarios maiores de 18 anos
        userService.listarUsuariosMaiorDeIdade().forEach(user ->
                System.out.println("Usuarios maior de idade encontrado : " +
                        user.getNome() + " - " +
                        user.getEmail() + " - " +
                        user.getIdade() ));





        // Atualizar usuario
        User userAtualizado = new User(0 , "Victor" , "victor@gmail.com" , 21);
        userService.atualizarUsuario(0 ,  userAtualizado).ifPresentOrElse( user ->
                System.out.println("Usuario atualizado com sucesso ... " + user.getIdade()), () ->
                System.out.println("Usuario não encontrado ou dados inseridos são incorretos !")
        );

        userService.removerUsuario(0).ifPresentOrElse(user ->
                System.out.println("Usuario removido com sucesso ... "), ()
                -> System.out.println("Não foi possivel remover o usuario !")
        );





    }
}
