package br.com.cod3r.exercicios_sb.repository;

import br.com.cod3r.exercicios_sb.models.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;


//  - Repository e uma interface que extende
// JpaRepository, que e uma interface generica do Spring Data JPA.


// - JpaRepository recebe dois parametros, o primeiro e a entidade que sera gerenciada
// pelo repository, e o segundo e o tipo do id da entidade.


public interface ProdutoRepository
        extends JpaRepository<Produto , Integer> {

    public List<Produto> findByNomeContainingIgnoreCase(String nome);

    @Query("SELECT p FROM Produto p WHERE p.nome LIKE %:nome%")
    public List<Produto> searchByNameLike(@Param("nome") String nome);
}
