package d_Solid;


import d_Solid.Desafios.Desafio3.Admin;
import d_Solid.Desafios.Desafio3.Cliente;
import d_Solid.Desafios.Desafio3.Usuario;
import d_Solid.Desafios.Desafio3.UsuarioAdmin;

public class Main {
    public static void main(String[] args) {


        Usuario cliente = new Cliente("Felipe");
        UsuarioAdmin admin = new Admin("Victor");


        cliente.realizarLogin("Felipe");
        admin.banirUsuario(cliente);


    }
}
