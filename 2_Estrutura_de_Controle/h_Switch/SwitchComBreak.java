package h_Switch;

public class SwitchComBreak {

    public static void main(String[] args) {

        // Um switch sem break ele executa a verificação
        // no proximo item mesmo tendo encontrado o item desejado

        String diaSemana = "Quarta-feira";
        switch (diaSemana.toLowerCase()) {

            case "segunda-feira":
                System.out.println("O dia foi selecionado foi Segunda feira");
                break;
            case "terca-feira":
                System.out.println("O dia foi selecionado foi Terça feira");
                break;
            case "quarta-feira":
                System.out.println("O dia foi selecionado foi Quarta feira");
                break;
            case "quinta-feira":
                System.out.println("O dia foi selecionado foi Quinta feira");
                break;
            case "sexta-feira":
                System.out.println("O dia foi selecionado foi Sexta-feira");
                break;
            default:
                System.out.println("O dia inserido e incorreto");
                break;
        }

    }

}
