package b_Polimorfismo.Polimorfismo_Dinamico;

// 🧩 3. Exemplo simples de Polimorfismo dinâmico (Overriding)

//💡 Mesmo que f1 e f2 sejam do tipo Funcionário,
//cada um se comporta de forma diferente dependendo da classe concreta (Gerente ou Estagiário).

//Esse é o polimorfismo em ação!


class Funcionario {
    public  void trabalhar(){
        System.out.println("O funcionário está trabalhando.");
    }
}

class Gerente extends Funcionario{
    @Override
    public void trabalhar() {
        System.out.println("O gerente está gerenciando a equipe.");
    }
}

class Estagiario extends Funcionario{
    @Override
    public void trabalhar() {
        System.out.println("O estagiario esta trabalhando.");
    }
}


public class Main {
    public static void main(String[] args) {

        Funcionario func1 = new Funcionario();
        func1.trabalhar(); // Saída: O funcionário está trabalhando.

        Funcionario func2 = new Gerente();
        func2.trabalhar(); // Saída: O gerente está gerenciando a equipe.

        Funcionario func3 = new Estagiario();
        func3.trabalhar(); // Saida: O estagiário esta trabalhando.
    }
}



