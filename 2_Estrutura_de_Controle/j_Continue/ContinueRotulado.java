package j_Continue;

public class ContinueRotulado {

    public static void main(String[] args) {
     
    // Imagine que você quer imprimir apenas pares, mas de uma matriz inteira,
    // pulando linhas inteiras que contenham algum número ímpar.


          int[][] matriz = {
            {2, 4, 6},
            {8, 9, 10},
            {12, 14, 16}
        };

        linha: // Rótulo
        for (int i = 0; i < matriz.length; i++) {

            for (int j = 0; j < matriz[i].length; j++) {

                if (matriz[i][j] % 2 != 0) {

                    continue linha; // pula para a próxima linha

                }

                System.out.print(matriz[i][j] + " ");

            }

            System.out.println();

        }

        // ➡️ Aqui, quando encontra o 9 (ímpar), ele não apenas pula o resto da coluna,
        // mas pula a linha inteira e já vai para o próximo i.
    }
}
