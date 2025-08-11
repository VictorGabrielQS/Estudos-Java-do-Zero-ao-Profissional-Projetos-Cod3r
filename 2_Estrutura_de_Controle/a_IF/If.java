package a_IF;
import java.util.Scanner;

public class If {
    public static void main(String[] args) {
        /*

           if(condicação){
           executa o bloco de codigo se a condição for verdadeira}
           
         */
        Scanner scanner = new Scanner(System.in);

        System.out.print("Escreva a nota que você tirou : ");
        Double nota = scanner.nextDouble();


        if (nota > 7 ){
            System.out.println("Parabéns você foi aprovado");
        }
        




    }
}
