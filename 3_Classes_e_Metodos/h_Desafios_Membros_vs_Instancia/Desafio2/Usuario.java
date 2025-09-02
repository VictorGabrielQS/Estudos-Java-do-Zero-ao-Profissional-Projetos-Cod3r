package h_Desafios_Membros_vs_Instancia.Desafio2;

public class Usuario {

    String nome;
    static int usuariosLogados;

    Usuario(String nome){
        this.nome = nome;
        usuariosLogados ++;
    }

    void exibirQuantidadeUsurios(){
        System.out.println("A quantidade de usuarios logados no sistema e : " + usuariosLogados);
    }
}
