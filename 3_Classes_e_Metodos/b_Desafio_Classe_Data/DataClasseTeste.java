public class DataClasseTeste {
    public static void main(String[] args) {

        Data data1 = new Data();

        data1.dia = 25;
        data1.mes = 8;
        data1.ano = 2025;
        data1.exibirInformacoes();

        Data data2 = new Data();
        data2.dia = 10;
        data2.mes = 9;
        data2.ano = 2025;
        data2.exibirInformacoes();
    }
}
