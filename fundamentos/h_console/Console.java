package h_console;

import java.util.Scanner;

public class Console {
    public static void main(String[] args) {
        
        System.out.print("Bom ");
        System.out.print("dia! \n \n");


        System.out.println("Bom ");
        System.out.println("dia!");

        System.out.printf("MegaSena : %d %d %d %d %d %d  ", 
        1 ,2 , 3 ,4 ,5 , 6 );


        // Traz somente uma casa decimal do meu numero :
        
        // formula[  %.1f ] traz uma casa decimal somente  
        // formula[ %.12f ] traz duas casa decimal somente
        
        System.out.printf("Salario : %.2f ", 155.550);

        
        // Pegar os dados nome / sobrenome /  idade com  Scanner
        
        Scanner entrada = new Scanner(System.in);


        System.out.print("\nDigite sua idade : ");
        int idade = entrada.nextInt();
        entrada.nextLine();

        System.out.print("Digite seu nome : ");
        String nome = entrada.nextLine();

        // Formata o nome para a Primeira caracteria Maiuscula
        nome = nome.substring(0, 1)
        .toUpperCase() + nome.substring(1);


        System.out.print("Digite seu sobrenome : ");
        String sobrenome = entrada.nextLine();

        // Formata o sobrenome para a Primeira caracteria Maiuscula
        sobrenome = sobrenome.substring(0,1)
        .toUpperCase() + sobrenome.substring(1);

        
        // Resultado : 
        System.out.printf("Ola bem vindo(a) %s %s sua idade e %d ",
        nome , sobrenome ,idade);


        entrada.close();

        














        
        
    }

}
