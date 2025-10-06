package Projetos_Pratica.Desafio1_Crud_Usuarios;

public class User {
    private Integer id;
    private String nome;
    private String email;
    private int idade;


    public User(Integer id, String nome, String email, int idade) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.idade = idade;
    }

    public boolean isValido() {
        return  nome != null && !nome.isBlank() &&
                email != null && !email.isBlank() &&
                idade > 0;
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
