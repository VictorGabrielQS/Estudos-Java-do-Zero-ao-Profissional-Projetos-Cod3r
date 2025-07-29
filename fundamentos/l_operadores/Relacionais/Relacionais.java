package l_operadores.Relacionais;

public class Relacionais {
    public static void main(String[] args) {

        /*
         * |         Operador     |    Nome            |       O que faz     |
        
         * -----------------------------------------------
         
         * |          ==          |     Igual a             |   Retorna `true` se os valores forem iguais           |
         
         * |          !=          |     Diferente de        |   Retorna `true` se os valores forem diferentes       |
         
         * |           >          |     Maior que           |   Retorna `true` se o valor da esquerda for maior     |
         
         * |           <          |     Menor que           |   Retorna `true` se o valor da esquerda for menor     |
         
         * |           >=         |     Maior ou igual a    |   Retorna `true` se for maior ou igual                |
         
         * |           <=         |     Menor ou igual a    |   Retorna `true` se for menor ou igual                |
         
         * -----------------------------------------------
         
         * 
         */



     
        int a = 97; 
        int b = 'a';

        // o numero unicode de a e 97
        System.out.println(a <= b ); // true

        int n1 = 10 ;
        int n2 = 20 ;

        System.out.println(n1 == n2); // false
        System.out.println(n1 != n2); // true
        System.out.println(n1 > n2);  // false
        System.out.println(n1 < n2);  // true
        System.out.println(n1 >= n2); // false
        System.out.println(n1 <= n2); // true
        



    }
}
