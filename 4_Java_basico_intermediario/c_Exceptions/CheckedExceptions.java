package c_Exceptions;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CheckedExceptions {
    public static void main(String[] args) {
        try {

            BufferedReader br = new BufferedReader(new FileReader("arquivo.txt"));
            String linha = br.readLine();
            System.out.println(linha);
            br.close();

        } catch (IOException e) {

            System.out.println("Erro ao ler o arquivo: " + e.getMessage());

        }
    }
}
