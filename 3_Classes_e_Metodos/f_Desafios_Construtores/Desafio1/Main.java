package f_Desafios_Construtores.Desafio1;

public class Main {
    public static void main(String[] args) {

        //Chamada construtor padrão

        Data data1 = new Data();
        data1.obterDataFormatada();
        data1.imprimirDataFormatada();


        //Chamada construtor com parametro

        Data data2 = new Data(31 , 02 , 2025);
        data2.obterDataFormatada();
        data2.imprimirDataFormatada();

    }
}
