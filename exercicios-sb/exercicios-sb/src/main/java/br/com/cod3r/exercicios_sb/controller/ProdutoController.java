package br.com.cod3r.exercicios_sb.controller;


import br.com.cod3r.exercicios_sb.models.Produto;
import br.com.cod3r.exercicios_sb.repository.ProdutoRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

// -- Controller responsavel por gerenciar produtos
// - A anotacao @RestController indica que esta classe e um controlador REST
// - A anotacao @RequestMapping("/api/produtos") define o endpoint base para
//   todas as requisicoes deste controlador

@RestController
@RequestMapping("/api/produtos")
public class ProdutoController {


    // @Autowired e usada para injetar a dependencia do ProdutoRepository
    // Isso permite que o controlador interaja com o banco de dados
    // para salvar, buscar, atualizar e deletar produtos
    // A instancia do ProdutoRepository e gerenciada pelo Spring
    // e e automaticamente injetada quando o ProdutoController e criado
    // Isso promove o principio de Inversao de Controle (IoC)
    // e facilita o teste e a manutencao do codigo

    @Autowired
    private ProdutoRepository produtoRepository;


    // - O metodo novoProduto recebe um parametro nome via query string
    // - O metodo cria um novo objeto Produto com o nome recebido
    // - O metodo retorna o objeto Produto criado

//    @PostMapping
//    public Produto novoProduto(@RequestParam String nome , @RequestParam double preco, @RequestParam double desconto){
//        Produto produto = new Produto(nome , preco, desconto);
//        produtoRepository.save(produto);
//        return  produto;
//    }


    //Simplificando o metodo acima usando @RequestBody para receber o objeto Produto diretamente no corpo da requisicao
    //@Valid para validar o objeto Produto com base nas anotacoes de validacao definidas na classe Produto
    @RequestMapping(method = {RequestMethod.POST , RequestMethod.PUT} )
    public @ResponseBody Produto salvarProduto(@Valid Produto produto) {
        produtoRepository.save(produto);
        return produto;
    }


    // - O metodo retorna todos os produtos cadastrados no banco de dados
    @GetMapping
    public  List<Produto> todosOsProdutos(){
        return produtoRepository.findAll();
    }



    // - O metodo Busca Utiliza paginação
    @GetMapping("pagina/{numeroPagina}/{qtdePagina}")
    public Page<Produto> obterProdutoPorPagina( @PathVariable int numeroPagina , @PathVariable int qtdePagina){
        Pageable page = PageRequest.of(numeroPagina, qtdePagina);
        return produtoRepository.findAll(page);
    }


    // - O metodo Busca itens por nome
    @GetMapping(path = "nome/{parteNome}")
    public List<Produto> obterProdutoPorNome(@PathVariable String parteNome){
        return  produtoRepository.findByNomeContainingIgnoreCase(parteNome);
    }



    // - Busca processos pelo ID
    @GetMapping(path = "/{id}")
    public Optional<Produto> buscarProdutoPorId(@PathVariable int id){
        return produtoRepository.findById(id);
    }


/*
    // - O metodo altera um produto no banco de dados
    @PutMapping
    public Produto atualizarProduto(Produto produto){
        produtoRepository.save(produto);
        return produto;
    }
*/


    // - O metodo deleta um processo pelo ID
    @DeleteMapping(path = "/{id}")
    public String removerProduto(@PathVariable int id) {
        produtoRepository.deleteById(id);
        return "Produto removido com Sucesso";
    }


}
