package c_Exceptions;

// Exceptions - São erros que acontecem em tempos de execução

// Tipos de Exception :

// Checked exceptions -> Erros previstos que o compilador nós obriga a tratar -> Obrigatório tratar (com try/catch ou throws).
// Unchecked exceptions -> Erros inesperados, que podem acontecer em tempo de execução, e decidimos se tratamos ou  -> Exemplos: NullPointerException, ArithmeticException, IndexOutOfBoundsException.



public class Exceptions {
    public static void main(String[] args) {
        Conta conta = new Conta();

        try {
            //conta.ativarConta();
            conta.sacar(50);


        } catch (ContaException e) {

            System.out.println("Erro : " + e.getMessage());

        }

    }
}