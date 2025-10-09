package b_Polimorfismo.Desafios.Desafio2;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Transporte> listaTransportes = List.of(
                new Carro(),
                new Bicicleta(),
                new Aviao()
        );

        ExecutarTransporte executarTransporte = new ExecutarTransporte();
        executarTransporte.movimentar(listaTransportes);
    }
}
