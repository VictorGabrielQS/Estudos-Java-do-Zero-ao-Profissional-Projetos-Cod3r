public class i_break {

    public static void main(String[] args) {

        int[] numeros = {10 , 20 ,30 ,40 ,50 , 60 , 70};


        for (int i = 0; i < numeros.length; i++) {
            
            if (numeros[i] == 30) {
                System.out.println("Achei o numero 30!");
                break;
            }
            System.out.println("Verificando número : " + numeros[i]);

        }
        
    }
}
