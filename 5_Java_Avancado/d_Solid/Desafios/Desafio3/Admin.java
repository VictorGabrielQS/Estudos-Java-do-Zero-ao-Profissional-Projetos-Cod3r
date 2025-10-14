package d_Solid.Desafios.Desafio3;

import java.util.List;

public class Admin implements UsuarioAdmin {

    private String nomeUsuario;

    public Admin(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }

    @Override
    public void banirUsuario(List<Usuario> listaDeUsuarios, String nomeUsuario)       {
        Usuario usuarioParaRemover = null;
        System.out.println("Banindo Usuario : " + nomeUsuario);
        listaDeUsuarios.remove(nomeUsuario);
    }

    @Override
    public void realizarLogin(String nomeUsuario) {
        System.out.println("🧑‍💻 Admin se logando ... ");
        System.out.println("Bem Vindo "+ nomeUsuario);
    }


}




/*
O erro ocorre porque o método `listaDeUsuarios.remove(nomeUsuario);` está tentando remover um objeto `String` da lista, mas `listaDeUsuarios` é uma lista de objetos `Usuario`. Por isso, nenhum usuário é removido e a mensagem só mostra o nome passado, sem efeito real.

Para corrigir, é necessário buscar o objeto `Usuario` pelo nome e removê-lo da lista:

```java
// Admin.java
@Override
public void banirUsuario(List<Usuario> listaDeUsuarios, String nomeUsuario) {
    Usuario usuarioParaRemover = null;
    for (Usuario usuario : listaDeUsuarios) {
        if (usuario.getNomeUsuario().equals(nomeUsuario)) {
            usuarioParaRemover = usuario;
            break;
        }
    }
    if (usuarioParaRemover != null) {
        listaDeUsuarios.remove(usuarioParaRemover);
        System.out.println("Banindo Usuario : " + nomeUsuario);
    } else {
        System.out.println("Usuário não encontrado: " + nomeUsuario);
    }
}
```

Assim, o usuário será removido corretamente e a mensagem será exibida conforme esperado.

*/
