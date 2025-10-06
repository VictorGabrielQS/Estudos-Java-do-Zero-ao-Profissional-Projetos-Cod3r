package Projetos_Pratica.Desafio4_Tratamento_de_Erros_com_Exceptions_Customizadas;

public class InvalidUserException extends RuntimeException {
    public InvalidUserException(String message) {
        super(message);
    }
}
