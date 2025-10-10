package c_heranca;


class Veiculo{
    String modelo;
    int ano;

    void ligar(){
        System.out.println("Veículo Ligado!");
    }
}

// Classe filha (herda da classe pai)
class Carro extends Veiculo{
    int portas;

    void abrirPortaMala(){
        System.out.println("Porta Malas aberto!");
    }
}

// Sobrescrita de metodos @Overide
class Moto extends  Veiculo{
    int rodas;

    void darPartida(){
        System.out.println("Dando Partida!");
    }

    @Override
    void ligar() {
        System.out.println("Ligando Moto com Chave !");
    }

}



//🧩 Uso do super - Serve para acessar o método ou atributo da classe pai.
class Carro2 extends Veiculo {

    @Override
    void ligar() {
        super.ligar(); // chama o método da classe pai
        System.out.println("Carro pronto para dirigir!");
    }

}


public class Main {
    public static void main(String[] args) {

        Carro carro = new Carro();
        carro.modelo = "Tesla Model 3";
        carro.ano = 2024;
        carro.portas = 4;

        System.out.println("==== Carro 🚗 ====");
        carro.ligar();
        carro.abrirPortaMala();



        Moto moto = new Moto();
        moto.modelo = "Ducati Diavel";
        moto.ano = 2025;
        moto.rodas = 2;

        System.out.println("==== Moto 🏍️ ====");
        moto.ligar();
        moto.darPartida();


        System.out.println("==== Carro 2 🚗 ====");
        Carro2 carro2 = new Carro2();
        carro2.ligar();



    }
}
