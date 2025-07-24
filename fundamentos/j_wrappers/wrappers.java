package j_wrappers;

import java.util.Scanner;

public class Wrappers {
    public static void main(String[] args) {
        

        Scanner entrada = new Scanner(System.in);

        //Byte 
        Byte b = 100;
        Short s = 10000;
        Integer i = 1000000000;  // int 
        Long l = 1000000L;
        




        System.out.println(b.byteValue());
        System.out.println(l.longValue());
        System.out.println(s.toString());
        System.out.println(Integer.parseInt(entrada.next()));
        System.out.println(i * 3);


        Boolean bo = Boolean.parseBoolean("true");
        System.out.println(bo);


        Character c = '#';
        System.out.println(c + "...");
        
        

    }
}
