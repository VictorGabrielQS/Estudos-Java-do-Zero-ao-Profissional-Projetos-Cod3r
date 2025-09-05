package br.com.cod3r.exercicios_sb.controller;

import br.com.cod3r.exercicios_sb.models.Cliente;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/clientes")
public class ClienteController {

    @GetMapping(path = "/qualquer")
    public Cliente obterCliente(){
        return new Cliente( 28 , "Pedro" , "23.23.23-4434");
    }

    // Passando parametro para controller - PathVariable
    // http://localhost:8080/clientes/25

    @GetMapping(path = "/{id}")
    public Cliente obterClientePorId1(@PathVariable int id ){
        return  new Cliente(id , "Maria" , "23.25.44-3845" );
    }


    // Passando Parâmetros para Web Service - RequestParam
    // http://localhost:8080/clientes?id=25

    @GetMapping()
    public Cliente obterClientePorId2(@RequestParam( name = "id" , defaultValue = "1"  ) int id ){
        return  new Cliente(id , "Maria" , "23.25.44-3845" );
    }


}
