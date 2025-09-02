package l_operadores.Logicos;

public class Logicos {

    // && - Todas as codições precisam ser verdadeiras
    // || - Pelo menos uma condição precisa ser verdadeira
    // ! - Negação lógica

    public static void main(String[] args) {

        boolean condicao1 = true;
        boolean condicao2 = 3 > 7; // false 


        System.out.println(condicao1 && condicao2); // false 
        System.out.println(condicao1 || condicao2); // true
        System.out.println(!condicao1); //false
        System.out.println(!condicao2); // true


        // Tabela verdade E (AND) - && 
        System.out.println("\nTabela Verdade E (AND) :");
        System.out.println(true && true);
        System.out.println(true && false);
        System.out.println(false && true);
        System.out.println(false && false);


        // Tabela verdade OU (OR) - ||
        System.out.println("\nTabela Verdade OU (OR) :");
        System.out.println(true || true);
        System.out.println(true || false);
        System.out.println(false || true);
        System.out.println(false || false);


        // Tabela verdade OU Exclucivo (XOR) - !
        System.out.println("\nTabela Verdade OU Exclusiva (XOR) :");
        System.out.println(true ^ true);
        System.out.println(true ^ false);
        System.out.println(false ^ true);
        System.out.println(false ^ false);


        // Tabela verdade OU Exclucivo (XOR) - !
        System.out.println("\nTabela Verdade NOT :");
        System.out.println(!false);
        System.out.println(!true);


    }
}
