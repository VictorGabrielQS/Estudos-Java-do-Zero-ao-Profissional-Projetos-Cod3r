package br.com.cod3r.exercicios_sb.controller;


import br.com.cod3r.exercicios_sb.models.Produto;
import br.com.cod3r.exercicios_sb.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping
    public @ResponseBody Produto novoProduto( Produto produto ){
        produtoRepository.save(produto);
        return  produto;
    }




    @DeleteMapping
    public  Produto deletarProduto(@RequestParam int id){
        Produto produto = produtoRepository.findById(id).orElseThrow();
        produtoRepository.delete(produto);
        return produto;
    }

}
