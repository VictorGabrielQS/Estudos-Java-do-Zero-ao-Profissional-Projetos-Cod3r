package k_conversões;

public class ConversaoDeTiposPrimitivos {
    public static void main(String[] args) {

        /*
         * ✅ 1. Conversão implícita (automática)
         * Acontece automaticamente quando você converte de um tipo menor para um tipo
         * maior, sem risco de perda de dados.
         */

        // byte → short → int → long → float → double

        byte b = 100;
        short s = b;

        System.out.println("Agora Byte e um dado do tipo short : " + s);

        int num = 100;
        double resultado = num; // int → double (implícito)

        System.out.println(resultado); // 100.0

        /*
         * ✅ 2. Conversão explícita (casting manual)
         * Ocorre quando você força a conversão de um tipo maior para um menor, e pode
         * haver perda de dados.
         * Você usa o casting com parênteses:
         */

        double valor = 10.75;
        int inteiro = (int) valor; // double → int (explicito)

        System.out.println(inteiro); // 10 (perde os decimais)

        // Estouro de valores :

        int grande = 130;
        byte pequeno = (byte) grande; // int → byte

        System.out.println(pequeno); // -126 (estouro de valor)

        // Isso acontece porque o byte só vai de -128 a 127. O valor 130 "dá a volta"

        // ✅ Conversão entre tipos char e int

        char letra = 'A';
        int codigo = letra; // implícita (char → int)
        System.out.println(codigo); // 65

        int codigo2 = 66;
        char letra2 = (char) codigo2; // explícita (int → char)
        System.out.println(letra2); // B










        // ✅ Conversão entre boolean e outros tipos

        // ⚠️ boolean NÃO pode ser convertido para outros tipos, nem vice-versa.






        // ✅ Conversão com strings (extra útil)

        // Embora String não seja um tipo primitivo, é importante saber converter entre
        // primitivos e String.



        // 🔁 De primitivo para String:
        int idade = 21;
        String texto = String.valueOf(idade); // "21"




        // 🔁 De String para primitivo:
        String valorString = "123";
        int numero = Integer.parseInt(valorString); // 123
        double preco = Double.parseDouble("9.99");




        








        String senha = "ABl";
        for (int i = 0; i < senha.length(); i++) {
            char caracter = senha.charAt(i);
            int senhaCodigo = (int) caracter;

            System.out.println("Senha em String : " + caracter + " Senha convertida em int : " + senhaCodigo);
        }

    }
}
