package e_Optional.Desafio2;

import java.util.List;
import java.util.Optional;

public class Main {

    public static void main(String[] args) {
        Main main = new Main();
        Double main1 = main.dividirNumeros(12,10).orElse(-1.0);

        System.out.println("O resultado da divisão e : " + main1);


    }

    public Optional<Double> dividirNumeros(double numero1, double numero2) {
        return (numero2 == 0)
                ? Optional.empty()
                : Optional.of(numero1 / numero2);
    }

}