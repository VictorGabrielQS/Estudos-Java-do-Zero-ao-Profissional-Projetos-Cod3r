package h_Desafios_Membros_vs_Instancia.Desafio2;

public class Main {
    public static void main(String[] args) {

        Usuario usuario1 = new Usuario("Victor");
        Usuario usuario3 = new Usuario("Victor");
        Usuario usuario4 = new Usuario("Victor");

        usuario4.exibirQuantidadeUsurios();


    }
}
