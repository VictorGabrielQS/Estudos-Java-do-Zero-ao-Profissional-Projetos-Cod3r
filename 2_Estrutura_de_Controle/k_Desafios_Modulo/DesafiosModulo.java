package k_Desafios_Modulo;

import java.util.Scanner;

public class DesafiosModulo {

    static class Desafio1 {
    public static void main(String[] args) {
     
        Scanner scanner = new Scanner(System.in);
        

        System.out.print("DIgite um numero : ");
        int numero = scanner.nextInt();

        if (numero <= 10) {
            System.out.println("O numero esta entre 10");
        }else{
        System.out.println("O numero não esta entre 10");
        }
    }
    }

}
