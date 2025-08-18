package h_Switch;

public class SwitchSemBreak {

    public static void main(String[] args) {

        //Um switch sem break ele executa a verificação 
        //no proximo item mesmo tendo encontrado o item desejado 

        
        String diaSemana = "Quarta-feira";
        
        switch (diaSemana.toLowerCase()) {

            case "segunda-feira":
                System.out.println("O dia foi selecionado foi Segunda feira");
                
                case "terca-feira":
                System.out.println("O dia foi selecionado foi Terça feira");
                
                case "quarta-feira":
                System.out.println("O dia foi selecionado foi Quarta feira");
                
                case "quinta-feira":
                System.out.println("O dia foi selecionado foi Quinta feira");
                
                case "sexta-feira":
                System.out.println("O dia foi selecionado foi Sexta-feira");
        
            default:
                break;
        }
        
    }

}
