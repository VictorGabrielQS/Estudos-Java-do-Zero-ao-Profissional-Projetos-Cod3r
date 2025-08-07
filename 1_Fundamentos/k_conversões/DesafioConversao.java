package k_conversões;

import java.util.Scanner;

public class DesafioConversao {
    public static void main(String[] args) {
     
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Insira o primeiro salario : R$");
        String salario1 = entrada.nextLine().replace(",", ".");
        System.out.println(salario1);
        
        
        System.out.print("\nInsira o  segundo salario : R$");
        String salario2 = entrada.nextLine().replace(",", ".");
        System.out.println(salario2);
        
        System.out.print("\nInsira o terceiro salario : R$");
        String salario3 = entrada.nextLine().replace(",", ".");
        System.out.println(salario3);
        

        double salarioD1 = Double.parseDouble(salario1);
        double salarioD2 = Double.parseDouble(salario2);
        double salarioD3 = Double.parseDouble(salario3);
        
        double soma = salarioD1 + salarioD2 + salarioD3;

        double media = soma / 3;
        System.out.println("A Soma e : " + soma);
        System.out.println("A Media e : " + media );

        entrada.close();

    }
}
