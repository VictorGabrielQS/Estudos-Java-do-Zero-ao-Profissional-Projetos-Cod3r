package g_Inferência_de_Tipos;

public class TipoString {
    public static void main(String[] args) {
        
        System.out.println("Olá pessoal".charAt(2));

        String s = "Boa tarde";
        System.out.println(s.concat("!!!"));
        System.out.println(s + "!!!");

        System.out.println(s.startsWith("Boa"));
        System.out.println(s.toLowerCase().startsWith("boa"));

        System.out.println(s.length());

        for(int i = 0; i < s.length(); i++) {
            System.out.println(s.charAt(i));
        }

        var nome = "Victor";
        var sobrenome = "Gabriel";
        var idade = 23;
        var salario = 12348.987;

        System.out.println("Nome: " + nome + "\nSobrenome: " + sobrenome + "\nIdade: " + idade + "\nSalario: " + salario + "\n\n");

        System.out.printf("Nome: %s %s tem %d anos e ganha R$ %.2f.",
        nome, sobrenome, idade, salario);


        String frase = "Qualquer coisa";
        System.out.println(frase.contains("Qualquer"));
        System.out.println(frase.substring(5, 10));
        System.out.println(frase.replace("Qualquer", "Outra coisa"));
        System.out.println(frase.toUpperCase());
        System.out.println(frase.toLowerCase());
        System.out.println(frase.trim());
        System.out.println(frase.substring(5, 10));
        System.out.println(frase.substring(5));
        System.out.println(frase.substring(5, 10));

    } 

}
