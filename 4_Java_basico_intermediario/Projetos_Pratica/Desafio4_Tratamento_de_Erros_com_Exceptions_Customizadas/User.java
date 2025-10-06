package Projetos_Pratica.Desafio4_Tratamento_de_Erros_com_Exceptions_Customizadas;

public class User {
    private String nome;
    private int idade;

    public User(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
