package d_Solid;

import d_Solid.Desafios.Desafio3.Admin;
import d_Solid.Desafios.Desafio3.Cliente;
import d_Solid.Desafios.Desafio3.Usuario;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Usuario> listaUsuarios = new ArrayList<>();


        Cliente cliente1 = new Cliente("Victor");
        Cliente cliente2 = new Cliente("Felipe");

        Admin admin1 = new Admin("Ricardo");
        admin1.banirUsuario(listaUsuarios , "Victor");

        listaUsuarios.add(cliente1);
        listaUsuarios.add(cliente2);

    }
}
