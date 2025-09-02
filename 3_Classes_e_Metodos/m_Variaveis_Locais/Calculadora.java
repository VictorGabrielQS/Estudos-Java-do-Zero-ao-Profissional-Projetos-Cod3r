package m_Variaveis_Locais;

public class Calculadora {


    // Método que soma dois números
    public int somar(int a, int b) {
        int resultado = a + b; // 'resultado' é uma variável local
        return resultado;
    }


    // Método que mostra uma mensagem
    public void mostrarMensagem(String nome) {
        String mensagem = "Olá, " + nome; // 'mensagem' é local
        System.out.println(mensagem);
    }

    
}