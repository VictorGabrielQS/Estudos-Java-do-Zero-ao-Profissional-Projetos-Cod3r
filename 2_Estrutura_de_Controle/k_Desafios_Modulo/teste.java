package k_Desafios_Modulo;

public class teste {
    public static void main(String[] args) {

        int numero = 2;
        boolean ehPrimo = true;

        switch (numero) {

            case 0:
            case 1:
                ehPrimo = false;
                break;

            case 2:
                ehPrimo = true;
                System.out.println("Selcionado o Numero 2 ...");
                break;

            default:
                for (int i = 2; i < numero; i++) {
                    System.out.println(i);
                    if (numero % i == 0) {
                        ehPrimo = true;
                    } else {
                        ehPrimo = false;
                    }
                }

                break;
        }

        if (ehPrimo) {
            System.out.println("O Numero e Primo ... ");
        } else {
            System.out.println("O Numero não e Primo ... ");

        }

    }

}
