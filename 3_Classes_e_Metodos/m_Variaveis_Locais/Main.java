package m_Variaveis_Locais;

public class Main {
    public static void main(String[] args) {


        Calculadora calc1 = new Calculadora();
        System.out.println(calc1.somar(10, 10));


        int resultado = calc1.somar(20, 20); //Variavel Local
        calc1.mostrarMensagem(String.valueOf(resultado));


    }
}
