package c_heranca.Desafios.Desafio3;

public class ProdutoFisico extends Produto{
    double peso;

    public ProdutoFisico(String nome, double preco , double peso) {
        super(nome, preco);
        this.peso = peso;
    }

    @Override
    public void exibirInfo() {
        System.out.println("📦 Produto Físico: " + nome +
                           "| Preço : R$" + preco +
                           "| Peso : R$" + peso + "kg" +
                            "| Frete : R$" + calcularFrete());
    }

    public double calcularFrete(){
     return peso * 10; // exemplo simples: R$10 por kg
    }


}
