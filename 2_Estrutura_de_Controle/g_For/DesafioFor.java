package g_For;

public class DesafioFor {

    static class Desafio1 {
        public static void main(String[] args) {
     
            String valor = "#";
            System.out.println("Exemplo");
            for (int i = 0; i <= 5 ; i++) {
               System.out.println(valor);
               valor += "#";   
            }   
            
            // Versão do desafio 
            //Não pode usar valor numerico para controlar o laço 
       
            System.out.println("Resposta Desafio ...");
            for(String icon = "*"; !icon.equals("******"); icon += "*"){
               System.out.println(icon);
            }
       
       
           }
    }
}
   