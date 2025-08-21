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
            } else {
                System.out.println("O numero não esta entre 10");
            }

            if (numero % 2 == 0) {
                System.out.println("E o numero e par ");

            } else {
                System.out.println("O numero e Impar");
            }

        }
    }

    static class Desafio2 {
        public static void main(String[] args) {

            int ano = 2100;

            if ((ano % 400 == 0) || (ano % 4 == 0 && ano % 100 != 0)) {
                System.out.println("O ano e bissexto ... ");

            } else {
                System.out.println("O ano não e bissexto...");
            }

        }
    }

    static class Desafio3 {
        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);

            System.out.print("Digite a primeira nota : ");
            double nota1 = scanner.nextInt();

            System.out.print("Digite a primeira nota : ");
            double nota2 = scanner.nextInt();

            double media = (nota1 + nota2) / 2;

            System.out.println("A media e : " + media);

            if (media >= 7) {
                System.out.println("Aprovado ... ");
            } else if (media < 7 && media > 4) {
                System.out.println("Recuperação ...");
            } else {
                System.out.println("Reprovado ...");
            }

        }
    }

    
    static class Desafio4 {
        public static void main(String[] args) {
        
            int numero = 21;
            boolean ehPrimo = true;

            if (numero <= 1) {
                ehPrimo = false;
            }else{
                for (int i = 2; i < numero; i++) {
                    if (numero % i == 0) {
                        ehPrimo = false;
                        break;
            }
          }
                
            }

            if (ehPrimo) {
                System.out.println("O Numero e primo ...");
            }else{
                System.out.println("O Numero não e primo ...");
            }
        
        
        }
    }


    static class Desafio5 {
    
        public static void main(String[] args) {

            int numero = 17;
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
                    for (int i = 2; i <= Math.sqrt(numero); i++) {
                        System.out.println("Testando divisor: " + i);
                        if (numero % i == 0) {
                            ehPrimo = false;
                            break;
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


    static class Desafio6 {
    public static void main(String[] args) {
     
        Scanner scanner = new Scanner(System.in);

        int numero = 41;
        int tentativas = 10;


        for (int i = 0; i < tentativas; i--) {
            
            System.out.print("Insira o numero que você acha que possa ser : ");
            int numeroChute = scanner.nextInt();

   
            if ( numeroChute != numero && numeroChute > numero && numeroChute != 0  ) {
                System.out.println("Numero chutado errado ...");
                System.out.println("Numero chutado e maior do que o resultado.");
                tentativas -= 1;
                System.out.println("Tentativas restantes : " + tentativas);

            }else if( numeroChute != numero && numeroChute < numero && numeroChute != 0 ) {
                System.out.println("Numero chutado errado ...");
                System.out.println("Numero chutado e menor do que o resultado.");
                tentativas -= 1;
                System.out.println("Tentativas restantes : " + tentativas);

            }else{
                System.out.println("Valor inserido não aceito...");
            }

            if (numeroChute == numero ) {
                    System.out.println("Parabens você acertou ... ");
                
            }

            if (tentativas <= 0) {
                System.out.println("Todas as Tentativas acabou ... ");
                break;
            }


        }

       
        
    }
    }


    static class Desafio7 {
    public static void main(String[] args) {
     
       Scanner scanner = new Scanner(System.in);
       boolean continua = true;
       int numeroTotal = 0;

        while (continua) {

            System.out.print("Insira o numero : ");
            int numeroEscolhido = scanner.nextInt();
            
            if (numeroEscolhido >= 0) {
                System.out.println("Soma dos numeros inseridos ate o momento : " + (numeroTotal += numeroEscolhido) );
                continua = true;

            }else{
                System.out.println("Inserido um numero negativo encerrando Loop ...");
                System.out.println("Soma Total dos numeros inseridos : " + (numeroTotal) );
                continua = false;

            }
        
        }

        
    }
    }



    static class Desafio8 {
        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
         
            int maior = Integer.MIN_VALUE;

            System.out.println("Insira 10 numeros ...");

            for (int i = 0; i <= 10; i++) {
                
                System.out.print("Numero " + i + " : ");

                int numero = scanner.nextInt();

                if (numero > maior) {
                    maior = numero;
                }

            }

            System.out.println("O Maior numero foi : " + maior);

            
        }
    }


    static class Desafio9 {
        public static void main(String[] args) {
         
            Scanner scanner = new Scanner(System.in);

            int menor = Integer.MAX_VALUE;

            System.out.println("Digite 10 numeros ...");
            for (int i = 1; i <= 10; i++) {
                
                System.out.print("Numero " + i + " : ");
                int numero = scanner.nextInt();

                if (numero <= menor) {
                    menor = numero;
                }
            }
        System.out.println("O menor numero e : " + menor);
        }
    }


}
