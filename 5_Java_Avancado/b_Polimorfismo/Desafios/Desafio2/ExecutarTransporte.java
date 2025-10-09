package b_Polimorfismo.Desafios.Desafio2;

import java.util.List;

public class ExecutarTransporte {

    public void movimentar(List<Transporte> transportes){
        for (Transporte transporte : transportes){
            transporte.mover();
        }
    }

}
