package d_Solid.Desafios.Single_Responsibility_Principle.Desafio1;

public class RelatorioService  {


    private final UsuarioRepository usuarioRepository;

    public RelatorioService(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }


    void gerarRelatorio(){
        System.out.println("\nRelatorio de Todos os Usuarios do Sistema : ");
        for (String usuario : usuarioRepository.listaUsuarios){
            System.out.println("Usuário no Sistema  - " + usuario );
        }
    }

}
