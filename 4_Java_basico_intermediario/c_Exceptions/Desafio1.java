package c_Exceptions;

/*🔹 Desafios para praticar

1. Sistema de login :

Crie uma classe Usuario com login e senha.

Se o usuário digitar a senha errada, lance uma exception personalizada (SenhaInvalidaException).

Trate no main com try/catch.

----------------------

2. Divisão segura :

Crie um método que divide dois números.

Se o divisor for 0, lance uma IllegalArgumentException (unchecked).

Trate no main e exiba uma mensagem amigável.

*/

class SenhaInvalidaException extends Exception {
    public SenhaInvalidaException(String msg){
        super(msg);
    }
}


class Usuario {
    private final String login;
    private final String senha;

    public Usuario(String login , String senha){
        this.login = login;
        this.senha = senha;
    }

    public void login(String senhaEntrada) throws SenhaInvalidaException{
        if (!senhaEntrada.equals(senha)){
            throw new SenhaInvalidaException("Senha invalida tente novamente ... ");
        }
        System.out.println("Bem vindo " + login );

    }

}

public class Desafio1 {
    public static void main(String[] args) {
        Usuario usuario = new Usuario("Victor","Victor123");
        try {
            usuario.login("Victor123");
        }catch (SenhaInvalidaException e){
            System.out.println("Erro : " + e.getMessage());
        }


    }
}
