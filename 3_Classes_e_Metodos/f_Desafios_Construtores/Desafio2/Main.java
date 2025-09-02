package f_Desafios_Construtores.Desafio2;

public class Main {
    public static void main(String[] args) {

        Produto produto1 = new Produto("Coca-Cola 2L" , 15.00 ,10);
        System.out.println("O valor total no estoque do Produto" + " ( "+ produto1.nome +" ) : R$"+ produto1.calcularEstoqueTotal());



        Produto produto2 = new Produto("Pepsi 2L Zero" , 8.00 , 10);
        System.out.println("O valor total no estoque do Produto" + " ( "+ produto2.nome +" ) : R$"+ produto2.calcularEstoqueTotal());


    }
}
