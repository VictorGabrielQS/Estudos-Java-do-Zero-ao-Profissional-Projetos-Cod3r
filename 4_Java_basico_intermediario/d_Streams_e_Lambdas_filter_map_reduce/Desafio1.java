package d_Streams_e_Lambdas_filter_map_reduce;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

class Produto{
    private String nome;
    private double preco;


    public Produto(String nome  , Double preco){
        this.nome = nome;
        this.preco = preco;
    }


    public Double getPreco(){
        return preco;
    }


    public String getNome(){
        return nome;
    }


    @Override
    public String toString(){
        return nome + " - R$ " + preco;
    }


}



public class Desafio1 {
    public static void main(String[] args) {


        List<Produto> listaProdutos = new ArrayList<>();

        listaProdutos.add(new Produto("Notebook", 3500.00));
        listaProdutos.add(new Produto("Mouse Gamer", 150.00));
        listaProdutos.add(new Produto("Teclado Mecânico", 80.00));
        listaProdutos.add(new Produto("Monitor 24", 1200.00));

        System.out.println("\nProdutos Filtrados : ");
        List<Produto> produtosFiltrados = filtrarProdutos(listaProdutos);
        produtosFiltrados.forEach(System.out::println);

        System.out.println("\nProdutos em uma unica String : ");
        String nomes = juntarNomes(listaProdutos);
        System.out.println(nomes);

        Long quantidadeDeProdutos = quantosProdutos(produtosFiltrados);
        System.out.println("\nQuantidade de produtos filtrados : " + quantidadeDeProdutos);

    }


    public static List<Produto> filtrarProdutos(List<Produto> listaDeProdutos) {
        return listaDeProdutos.stream()
                .filter(produto -> produto.getPreco() > 100)
                .toList();
    }


    public static String juntarNomes(List<Produto> listaDeprodutos){
        return listaDeprodutos.stream()
                .map(produto -> produto.getNome())
                .collect(Collectors.joining(" , "));
    }


    public static Long quantosProdutos(List<Produto> listaDeProdutos){
        return listaDeProdutos.stream().count();
    }

}


