package e_Optional;

// - Optional é uma classe do Java que envolve um valor que pode ou não existir .
//- Ajuda a evitar NullPointerException , que é um dos erros mais comuns.
//- Em vez de retornar null, você retorna um Optional<T> e força o tratamento do possível valor ausente.

import java.util.Optional;

public class ClasseOptional {
    public static void main(String[] args) {

        Optional<String> nome = Optional.of("Victor"); // contém valor
        Optional<String> nomeB = Optional.of("Pedro"); // contém valor
        Optional<String> vazio = Optional.empty();     // vazio (sem valor)
        Optional<String> podeSerNulo = Optional.ofNullable(null); // aceita null

        System.out.println(nome);
        System.out.println(vazio);
        System.out.println(podeSerNulo);


        // Verificar se o valor esta Presente
        if (nome.isPresent()){
            System.out.println(nome.get());

        }else{
            System.out.println("Nome Esta Vazio ...");
        }


        // IfPresent - Só executa se o valor estiver presente.
        vazio.ifPresent(n -> System.out.println("Valor esta presente : " + nome.get()));

        // orElse - Definindo valores padrão
        String resultadoA = vazio.orElse("Desconhecido A");
        System.out.println(resultadoA);


        // ou podemos utilizar :

        // orElseGet(() -> "Desconhecido") - Definindo valores padrão → recebe uma função lambda para gerar valor.
        String resultadoB = podeSerNulo.orElseGet(() -> "Desconhecido B");
        System.out.println(resultadoB);


        // orElseThrow(() -> new excepition()) -> Lançando exceções quando vazio
        String resultadoC = nome.orElseThrow(() -> new RuntimeException("Nome obrigatório ..."));


        // Transformando valores com map
        Optional<String> maiusculo = nome.map(String::toUpperCase);
        System.out.println(maiusculo.orElse("Vazio"));

        //Filtrando valores
        Optional<String> filtrado = nomeB.filter(n -> n.startsWith("V"));
        System.out.println(filtrado.orElse("O nome não começa com V ..."));

    }
}
