package j_Desafio_Atribuição_Valor_vs_Referencia.Desafio2;

public class Main {
    public static void main(String[] args) {

        // Criando um objeto Produto
        Produto p1 = new Produto("Copo vidro 1", 5.00);

        // Criando outra referência apontando para o mesmo objeto
        Produto p2 = p1;

        // Alterando preço via p2
        p2.preco = 10.00;

        // Observando o efeito em p1
        System.out.println("Preço p1: " + p1.preco); // 10.0
        System.out.println("Preço p2: " + p2.preco); // 10.0

        // Agora criando um novo objeto independente
        Produto p3 = new Produto("Vinho Tipo 1", 5.00);
        p3.preco = 7.00;
        System.out.println("Preço p3: " + p3.preco); // 7.0

    }
}
