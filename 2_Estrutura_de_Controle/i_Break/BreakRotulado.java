package i_Break;

public class BreakRotulado {


    /*
     * 
     * ➡️ Sem o rótulo, o break sairia apenas do laço interno (for j), e o externo
     * (for i) continuaria rodando.
     * 
     * ➡️ Com break busca;, saímos dos dois.
     * 
     */


    public static void main(String[] args) {
     
        int[][] matriz = {
          {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        
        };

        boolean encontrado = false ; 

          busca: // Rótulo
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] == 5) {
                    System.out.println("Número encontrado!");
                    encontrado = true;
                    break busca; // sai de TODOS os laços até o rotulado
                }
            }
        }

        if (!encontrado) {
            System.out.println("Número não encontrado.");
        }
        
    }
}
