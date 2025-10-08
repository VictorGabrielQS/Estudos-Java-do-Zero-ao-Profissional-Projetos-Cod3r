package b_Polimorfismo.Polimorfismo_Estático;

//🔄 5. Polimorfismo Estático (Overloading)

//👉 Mesmo nome, mas assinaturas diferentes (quantidade ou tipo dos parâmetros).
//💡 Mesmo nome (somar), mas comportamento diferente dependendo dos parâmetros.

class Calculadora {
    public int somar(int a, int b) {
        return a + b;
    }

    public double somar(double a, double b) {
        return a + b;
    }

    public int somar(int a, int b, int c) {
        return a + b + c;
    }
}

public class Main {
    public static void main(String[] args) {
        Calculadora c = new Calculadora();
        System.out.println(c.somar(2, 3));      // 5
        System.out.println(c.somar(2.5, 4.5));  // 7.0
        System.out.println(c.somar(1, 2, 3));   // 6
    }
}
