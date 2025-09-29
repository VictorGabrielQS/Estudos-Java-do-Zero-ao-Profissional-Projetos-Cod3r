package c_Exceptions;

/*🔹 Desafios para praticar

1. Sistema de login :

Crie uma classe Usuario com login e senha.

Se o usuário digitar a senha errada, lance uma exception personalizada (SenhaInvalidaException).

Trate no main com try/catch.

----------------------

2. Divisão segura :

Crie um método que divide dois números.

Se o divisor for 0, lance uma IllegalArgumentException (unchecked).

Trate no main e exiba uma mensagem amigável.

*/

class Calculo{
    private double valor1;
    private double valor2;

    public Calculo(double valor1 , double valor2){
        this.valor1 = valor1;
        this.valor2 = valor2;
    }

    public double dividir(){
        if (valor2 == 0){
            throw new IllegalArgumentException("Divisor não pode ser Zero...");
        }
        return valor1 /valor2;
    }
}


public class Desafio2 {

    public static void main(String[] args) {

        Calculo calculo = new Calculo(5 , 0);
        System.out.println(calculo.dividir());
    }
}
