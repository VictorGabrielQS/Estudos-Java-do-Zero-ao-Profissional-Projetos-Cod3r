package br.com.cod3r.exercicios_sb.models;

public class Cliente {

    private int id;
    private String nome;
    private String cpf;


    public Cliente(int id ,String nome , String cpf) {
        this.cpf = cpf;
        this.nome = nome;
        this.id = id;
    }


    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


}
