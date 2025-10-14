package d_Solid.Desafios.Single_Responsibility_Principle.Desafio1;

import java.util.ArrayList;
import java.util.List;

public class UsuarioService {

    List<String> listaUsuarios = new ArrayList<>();

    void cadastrarUsuario(String nomeUsuario){
        listaUsuarios.add(nomeUsuario);
    }

    void enviarEmail(){
        System.out.println("Bem Vindo !");
    }

    void gerarRelatorio(){
        System.out.println("Relatorio de Todos os Usuarios do Sistema : ");
        for (String usuario : listaUsuarios){
            System.out.println("Usuario no Sistema : " + usuario );
        }
    }

}
