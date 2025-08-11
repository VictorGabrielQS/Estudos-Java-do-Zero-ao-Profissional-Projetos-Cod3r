package a_IF;

public class DesafioIF {
    public static void main(String[] args) {

        // corrijja um erro no codigo

        double nota = 1.3;

        if (nota >= 9.0)
            ;
        {
            System.out.println("Quadro de Honra!");
            System.out.println("Você e fera!!!");
        }

        // O erro esta aqui : if (nota >= 9.0); {, por possui ; isso faz o if finalizar
        // ali e emitir o System.out.println automaticamente.

    }

}
