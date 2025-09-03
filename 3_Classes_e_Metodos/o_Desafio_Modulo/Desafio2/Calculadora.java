package o_Desafio_Modulo.Desafio2;

public class Calculadora {


    void somar(int a, int b) {
        System.out.println("Resultado e : " + (a + b));
    }


    void subtrair(int a, int b) {
        System.out.println("Resultado e : " + (a - b));
    }


    void multiplicar(int a, int b) {
        System.out.println("Resultado e : " + (a * b));
    }


    void dividir(int a, int b) {
        if (b == 0) {
            System.out.println("Erro : divisão por zero não é permitida!");
        } else {
            System.out.println("Resultado e : " + (a / b));
        }
    }


}
