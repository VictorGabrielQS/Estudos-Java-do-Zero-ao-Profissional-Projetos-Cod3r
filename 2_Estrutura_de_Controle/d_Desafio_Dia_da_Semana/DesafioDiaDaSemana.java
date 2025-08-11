package d_Desafio_Dia_da_Semana;

import java.util.Scanner;

public class DesafioDiaDaSemana {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o dia da semana que deseja saber seu respectivo dia : ");
        String diaDaSemana = scanner.next().trim().toLowerCase();


        if (diaDaSemana.equals("domingo")) {
        System.out.println("Dia dessa semana e 1!");
        }else if (diaDaSemana.equals( "segunda")){
            System.out.println("Dia dessa semana e 2!");
        } else if (diaDaSemana.equals( "terça") || diaDaSemana.equals("terca")) {
            System.out.println("Dia dessa semana e 3!");
        } else if (diaDaSemana.equals( "quarta") ){
            System.out.println("Dia dessa semana e 4!");
        } else if (diaDaSemana.equals( "quinta") ){
            System.out.println("Dia dessa semana e 5!");
        } else if (diaDaSemana.equals( "sexta")) {
            System.out.println("Dia dessa semana e 6!");
        } else if (diaDaSemana.equals( "sabado") ){
            System.out.println("Dia dessa semana e 7!");
        }else{
            System.out.println("Dia invalido!");
        }

        scanner.close();
    }

}
