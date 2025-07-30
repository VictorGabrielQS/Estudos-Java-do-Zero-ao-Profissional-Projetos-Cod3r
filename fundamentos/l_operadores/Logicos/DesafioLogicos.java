package Logicos;

import java.util.Scanner;

public class DesafioLogicos {

    /*
     * 🎯 Desafio para praticar:
     * 
     * Crie um programa que:
     * 
     * Pergunte se o usuário tem mais de 18 anos (true/false).
     * 
     * Pergunte se o usuário tem autorização dos pais (true/false).
     * 
     * Use operadores lógicos para verificar:
     * 
     * Pode assistir a um filme para maiores? (18+ OU tem autorização)
     * 
     * Está sem permissão? (! de permitido)
     * 
     * É maior E tem autorização? (opcional extra)
     * 
     */


     static class desafio1 {
     public static void main(String[] args) {
         Scanner entrada = new Scanner(System.in);
   

         System.out.println("Você tem mais de 18 anos? (true/false)");
         boolean maiorDeIdade = entrada.nextBoolean();

         System.out.println("Você tem autorização dos pais? (true/false)");
         boolean temAutorizacao = entrada.nextBoolean();

         // Pode assistir a um filme para maiores? (18+ OU tem autorização)
         boolean pemitido = maiorDeIdade || temAutorizacao;

         boolean semPermissao = !pemitido;

         boolean temAutorizacaoIdade = maiorDeIdade && temAutorizacao;

         System.out.println("Tem mais de 18 anos? " + pemitido);
         System.out.println("Está sem permissão? " + semPermissao);
         System.out.println("É maior de idade E tem autorização? " + temAutorizacaoIdade);

     }
        
     }

     static class desafio2 {
        public static void main(String[] args) {

            Scanner entrada = new Scanner(System.in);

            System.out.println("Você tem mais de 18 anos ? digite a sua idade ");
            int idade = entrada.nextInt();

            System.out.println("Você tem ingresso VIP ? (true/false)");
            boolean temAutorizacaoVip = entrada.nextBoolean();

            System.out.println("Você e convidado especial ? (true/false)");
            boolean temAutorizacaoEspecial = entrada.nextBoolean();

           boolean maiorDeIdade = idade >= 18;
            
            boolean permitido = (maiorDeIdade && temAutorizacaoVip) || temAutorizacaoEspecial;

            if (maiorDeIdade && temAutorizacaoVip) {
                System.out.println("✅ Acesso liberado para a área VIP!");
                System.out.println("Motivo: Maior de idade com ingresso VIP.");
            } else if (temAutorizacaoEspecial) {
                System.out.println("✅ Acesso liberado para a área VIP!");
                System.out.println("Motivo: Convidado especial.");
            } else {
                System.out.println("🚫 Acesso negado à área VIP.");
            }

            entrada.close();

        }
     }

  
}
