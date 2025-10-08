package a_Classes_abstratas_e_interfaces.Interface_metodos_padrao;

public class UsuarioService implements Logavel {


    @Override
    public void log(String msg) {
        System.out.println("[USUARIO]" + msg);
    }


    public void criarUsuario(String nome){
        logInfo("Criando usuario: " + nome); // usa o método default da interface
        log("usuario " + nome + " Criado com Sucesso!");
    }


    public void erroNoCadastro(String erro){
        Logavel.logErro(erro); // usa método estático direto da interface
    }


}
