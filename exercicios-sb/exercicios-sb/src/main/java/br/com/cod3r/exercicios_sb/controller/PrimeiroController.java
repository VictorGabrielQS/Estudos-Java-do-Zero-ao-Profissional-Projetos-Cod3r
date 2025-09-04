package br.com.cod3r.exercicios_sb.controller;


import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class PrimeiroController {



    //  - GET com parâmetros na URL (Query Params)

    @GetMapping(path = "/ola"  )
    public String ola(){
        System.out.println("Executando Get");
        return "Ola Metodo GET aqui ...";
    }




    //  - POST com parâmetros na URL (Query Params)

    @PostMapping(path = "/saudacao" )
    public String saudacao(){
        System.out.println("Executando Post");
        return "Ola Metodo POST aqui ...";
    }





























    // - GET com caminho dinâmico (Path Variable)

    @GetMapping(path = "/soma/{a}/{b}")
    public String soma(@PathVariable int a , @PathVariable int b){
        return "O Resultado e : " + (a + b) ;
    }



    // - GET retornando JSON

    class Produto{

        public String nome;
        public double preco;

        public Produto(String nome , double preco){
            this.nome = nome;
            this.preco = preco;

        }
    }


    @GetMapping("/produto")
    public Produto getProduto(){
        return new Produto("Faca" , 20.00);
    }






}
