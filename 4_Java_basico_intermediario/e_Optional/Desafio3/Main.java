package e_Optional.Desafio3;

import java.util.*;

public class Main {
    public static void main(String[] args) {

    /*    Optional<String> nome = Optional.ofNullable("Victor");
        System.out.println(nome.orElse("Não Atribuido valor ... "));*/

        Produto produto = new Produto("Notebook" , 1000.00) ;

        System.out.println(produto);

    }


}
