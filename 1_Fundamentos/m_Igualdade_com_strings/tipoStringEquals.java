package m_Igualdade_com_strings;

import java.util.Scanner;

public class tipoStringEquals {
public static void main(String[] args) {
 
    
    // equals() - Compara o conteúdo de duas String
    
    String s = new String("2");

    System.out.println("2" == s); // comparação errada entre Strings 

    System.out.println("2".equals(s)); // forma correta de comparar Strings (e utilizando .equls() )

    Scanner entrada = new Scanner(System.in);

    System.out.println("Insira a String : ");
    String s2 = entrada.next();

    System.out.println("2".equals(s2.trim())); // trim remove os espaços de uma String

    entrada.close();

}
}
