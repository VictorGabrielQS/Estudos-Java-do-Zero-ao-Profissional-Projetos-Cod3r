package m_Igualdade_com_strings;

import java.util.Scanner;

public class DesafioTipoStringEquals {


    static class Desafio1 {
        public static void main(String[] args) {
        
            String nomePredefinido = "admin";

            Scanner entrada = new Scanner(System.in);

            System.out.print("Digite seu Usuario : ");
            String nome = entrada.nextLine();

            if (nomePredefinido.equals(nome.trim())) {
                System.out.println("Login bem-sucedido! ");
                
            } else {
                System.out.println("Nome Incorreto!");
                
            }
        
            entrada.close();
            
        }
    }


    static class Desafio2 {
        public static void main(String[] args) {
         
            Scanner entrada = new Scanner(System.in);

            System.out.print("Digite a primeira palavra : ");
            String palavra1 = entrada.nextLine().trim();

            System.out.print("Digite a segunda palavra : ");
            String palavra2 = entrada.nextLine().trim();





            System.out.println(palavra1.equals(palavra2));

            System.out.println(palavra1.equalsIgnoreCase(palavra2));
                
            entrada.close();
            
        }
    }

    
}
