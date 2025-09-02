package n_Valores_Padrões;

public class Usuario {

    int id;            // int → valor padrão 0
    String nome;       // objeto → valor padrão null
    boolean ativo;     // boolean → valor padrão false
    double saldo;      // double → valor padrão 0.0

    void mostrarInfo() {
        System.out.println("ID: " + id);
        System.out.println("Nome: " + nome);
        System.out.println("Ativo: " + ativo);
        System.out.println("Saldo: " + saldo);
    }
    
}
