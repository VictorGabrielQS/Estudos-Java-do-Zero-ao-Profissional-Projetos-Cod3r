package f_DoWhile;

public class DoWhile {

    /*
     * O laço do-while em Java é utilizado para executar um bloco de código pelo menos uma vez,
     * e depois continuar executando enquanto uma condição for verdadeira.
     * 
     * 
     * A principal diferença entre o while e o do-while é que no do-while o bloco de código
     * é executado pelo menos uma vez, mesmo que a condição seja falsa logo na primeira verificação.
     * 
     * Estrutura básica:
     * 
     * do {
     *     // bloco de código
     * } while (condição);
     * 
     */

     //Exemplo: Imprimir os números de 1 a 5 usando do-while

    public static void main(String[] args) {
        int contador = 6;

        do {
            System.out.println("Contador = " + contador);
            contador++;
        } while (contador <= 5);

        
        /*
         * Neste exemplo, o bloco dentro do do será executado enquanto a condição (contador <= 5) for verdadeira.
         * Mesmo que a condição fosse falsa no início, o bloco seria executado pelo menos uma vez.
         */


         int numero = 15;

         do{
            System.out.println("Numero : " +  numero);
            numero++;

         }while(numero <=10);

    }

}
