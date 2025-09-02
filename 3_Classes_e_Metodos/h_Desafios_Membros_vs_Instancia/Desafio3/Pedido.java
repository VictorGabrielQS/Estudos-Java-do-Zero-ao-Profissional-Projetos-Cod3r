package h_Desafios_Membros_vs_Instancia.Desafio3;

public class Pedido {

    int valor;
    static int totalPedidos;

    Pedido(int valor){
        this.valor = valor;
        totalPedidos += valor;
    }

    void exibirDetalhePedidos(){
        System.out.println("Total acumulado : " + totalPedidos);
    }



}
