package br.com.cod3r.exercicios_sb.controller;

import br.com.cod3r.exercicios_sb.models.Cliente;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClienteController {

    @GetMapping(path = "clientes/qualquer")
    public Cliente obterCliente(){
        Cliente cliente = new Cliente("23.23.23-4434", "Pedro" , 28);
        return  cliente;
    }

}
