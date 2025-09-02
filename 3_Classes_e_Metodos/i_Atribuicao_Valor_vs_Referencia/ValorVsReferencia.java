package i_Atribuicao_Valor_vs_Referencia;

class Carro {
    String modelo;
}

public class ValorVsReferencia {
    public static void main(String[] args) {
        double a = 2;
        double b = a;

        a ++ ;
        b -- ;

        System.out.println(a + " " + b);


        Carro carro1 = new Carro();
        carro1.modelo = "Civic";

        Carro carro2 = carro1; // carro2 aponta para o mesmo objeto que carro1

        carro2.modelo = "Corolla"; // altera o objeto

        System.out.println(carro1.modelo); // Corolla
        System.out.println(carro2.modelo); // Corolla

    }
}
