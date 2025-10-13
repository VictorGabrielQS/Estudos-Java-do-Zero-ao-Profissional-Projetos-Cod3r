package c_heranca.Desafios.Desafio2;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Veiculo> veiculos = List.of(new Carro() , new Moto(), new Caminhao());

      veiculos.forEach(Veiculo::ligar);

    }
}
