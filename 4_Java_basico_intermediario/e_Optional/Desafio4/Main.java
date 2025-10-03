package e_Optional.Desafio4;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {

        SistemaLogin sistemaLogin = new SistemaLogin();

        Optional<Usuario>  login = sistemaLogin.fazerLogin("victor@email.com","1234");


        login.ifPresentOrElse(u -> System.out.println("Login bem sucedido : " + u.getEmail()),
                () -> System.out.println("Usuario ou senha Invalida.")
        );


    }
}
