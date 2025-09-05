package br.com.cod3r.exercicios_sb.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/calculadora")
public class CalculadoraController {

    @GetMapping("/somar/{numero1}/{numero2}")
    public String somar(@PathVariable int numero1 , @PathVariable int numero2){
        int resultado = numero1 + numero2;
        return "Resultado da soma e : " + resultado;
    }


    @GetMapping("/subtrair")
    public String subtrair(@RequestParam int numero1 , @RequestParam int numero2){
        int resultado = numero1 - numero2;
        return "O resultado da subtração e : " + resultado;

    }





}
