package c_heranca.Desafios.Desafio3;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Produto> listaDeProdutos = new ArrayList<>();



        listaDeProdutos.add(new ProdutoFisico("Livro Java", 80, 1.2));
        listaDeProdutos.add(new ProdutoDigital("Curso Poo", 50, 500));
        listaDeProdutos.add(new ProdutoDigital("Curso Spring Boot", 199.0, 1500));
        listaDeProdutos.add(new ProdutoFisico("Mouse Gamer", 120.0, 0.3));
        listaDeProdutos.add(new ProdutoDigital("E-book Clean Code", 50.0, 500));




        for (Produto p : listaDeProdutos){
            p.exibirInfo();
        }




    }
}
