package br.com.cod3r.exercicios_sb.models;


import jakarta.persistence.*;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity // Indica que a classe e uma entidade JPA
@NoArgsConstructor // Cria um construtor padrao sem argumentos
@AllArgsConstructor // Cria um construtor com todos os atributos da classe
@Data // Cria os metodos getters, setters, toString, equals e hashCode
@Table(name = "produtos") // Define o nome da tabela no banco de dados
public class Produto {


    @Id  // A Propriedade e um id, e unica no banco de dados.
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Auto-incremento
    private int id;

    @Column(name = "nome", nullable = false, unique = true) // Nome nao pode ser nulo e deve ser unico
    private String nome;

    @Min(0) // O preco nao pode ser negativo
    private double preco;

    @Min(0) // O desconto nao pode ser negativo
    @Max(1) // O desconto nao pode ser maior que 1%
    private double desconto;



    public Produto(String nome, double preco, double desconto) {
        this.nome = nome;
        this.preco = preco;
        this.desconto = desconto;

    }



}
