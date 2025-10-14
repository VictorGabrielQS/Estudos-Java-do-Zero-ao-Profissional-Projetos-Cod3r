package d_Solid.Desafios.Desafio3;

public class Cliente implements Usuario {
    String nomeUsuario;

    public Cliente(String nomeUsuario) {
        this.nomeUsuario =  nomeUsuario;
    }

    @Override
    public void realizarLogin(String nomeUsuario) {
        System.out.println("👨 Clinte se logando ... ");
        System.out.println("Bem Vindo "+ nomeUsuario);
    }
}
