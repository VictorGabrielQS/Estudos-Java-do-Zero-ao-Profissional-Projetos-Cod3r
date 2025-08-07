package Ternarios;

public class Ternario {
    public static void main(String[] args) {
     
        boolean condicao = false ;
        String resultado = condicao ? "Sim" : "Não";

        System.out.println(resultado);

        double nota = 6.0;
        String resultadoNota = nota >= 7 ? "Aprovado" : "Reprovado";
        System.out.println(resultadoNota);
        

    }
}
