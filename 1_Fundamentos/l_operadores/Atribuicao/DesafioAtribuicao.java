package Atribuicao;

import java.util.Scanner;

public class DesafioAtribuicao {

    /*
     * 🔹 Desafio 1: Economias mensais
     * 
     * Crie um programa que:
     * 
     * Pergunte quanto dinheiro você tem no momento.
     * 
     * Adicione R$100 todo mês por 6 meses usando +=.
     * 
     * Mostre quanto você terá ao final do período.
     * 
     */
    //


    static class Desafio1 {
        public static void main(String[] args) {
         
            Scanner entrada = new Scanner(System.in);

            System.out.println("Quanto dinheiro você tem no momento ? ");
            double valorAtual = entrada.nextDouble();

            for (int i = 0 ; i < 6; i++) {

                valorAtual += 100;
                System.out.println("Mes " + i + " Valor atual : " + valorAtual);
                
            }

            System.out.println("Valor no final de 6 meses : " + valorAtual);

            entrada.close();
            
        }
    }


    static class Desafio2 {
        public static void main(String[] args) {
               
            int kilosSupino = 100;
            
            for (int i = 0; i < 5; i++) {
                
                System.out.println("Semana " + i + " Peso da semana : " + kilosSupino);
                kilosSupino *= (double) 1.05;

            }
            System.out.println("Você esta levantando no total : " + kilosSupino);
            
        }
        
    }

}
