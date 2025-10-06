package a_Classes_abstratas_e_interfaces.Interface_metodos_padrao;

public class Main {
    public static void main(String[] args) {

        UsuarioService usuario = new UsuarioService();
        usuario.criarUsuario("Victor");
        usuario.erroNoCadastro("Falha ao conectar ao Banco");

    }
}
