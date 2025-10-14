package d_Solid.Desafios.Desafio3;

import java.util.List;

public class Admin implements UsuarioAdmin {


    private String nomeUsuario;


    public Admin(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }


    @Override
    public void atualizarPerfil() {
        System.out.println("Perfil do admin atualizado!");
    }


    @Override
    public void realizarLogin(String nomeUsuario) {
        System.out.println("🧑‍💻 Admin se logando ... ");
        System.out.println("Bem Vindo "+ nomeUsuario);
    }


    @Override
    public void banirUsuario(Usuario usuario) {
        System.out.println("Banindo Usuario pelo admin");
    }


}


