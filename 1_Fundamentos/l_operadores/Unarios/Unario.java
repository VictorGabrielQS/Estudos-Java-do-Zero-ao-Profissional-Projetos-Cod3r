package l_operadores.Unarios;

public class Unario {
    public static void main(String[] args) {

        int a = 1;
        int b = 5;

        a++;
        b--;

        System.out.println(a);
        System.out.println(b);


        int x = 10;

        System.out.println(++x); // 11 (incrementa, depois usa)
        System.out.println(x++); // 11 (usa, depois incrementa)
        System.out.println(x); // 12 (valor atualizado)

    }

}
