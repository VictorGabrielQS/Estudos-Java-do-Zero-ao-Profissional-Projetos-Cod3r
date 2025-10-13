package c_heranca.Desafios.Desafio3;

public class ProdutoDigital extends Produto{
    double tamanhoEmMB;


    public ProdutoDigital(String nome, double preco , double tamanhoEmMB) {
        super(nome, preco);
        this.tamanhoEmMB = tamanhoEmMB;
    }

    @Override
    public void exibirInfo() {
        System.out.println("💾 Produto Digital: " + nome +
                " | Preço: R$" + preco +
                " | Tamanho: " + tamanhoEmMB + "MB");
    }

}
