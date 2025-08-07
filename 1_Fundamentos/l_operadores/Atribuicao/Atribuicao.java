package Atribuicao;

public class Atribuicao {
    public static void main(String[] args) {
        
        int a = 10;
        int b = 5;
        String c = "Hello";
        String d = "Word";

        System.out.println(a = b);   // Atribui valor
        System.out.println(a += b);  // Soma e atribui
        System.out.println(a -= b);  // Subtrai e atribui
        System.out.println(a *= b);  // Multiplica e atribui
        System.out.println(a /= b);  // Divide e atribui
        System.out.println(a %= b);  // Calcula o resto da divisão e atribui

        System.out.println(c = d);
        System.out.println(c += d);
       

    }
}
