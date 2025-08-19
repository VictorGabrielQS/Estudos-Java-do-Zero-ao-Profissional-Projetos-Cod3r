package i_Break;
public class Break {

    public static void main(String[] args) {

        int[] numeros = {10 , 20 ,30 ,40 ,50 , 60 , 70};


        for (int i = 0; i < numeros.length; i++) {
            
            if (numeros[i] == 30) {
                System.out.println("Achei o numero 30!");
                break; // se não tivesse o break ele continuaria executando 
            }
            System.out.println("Verificando número : " + numeros[i]);
        }
        System.out.println("Fim");
        
    }
}
