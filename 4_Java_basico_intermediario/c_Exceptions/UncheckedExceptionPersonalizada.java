package c_Exceptions;

public class UncheckedExceptionPersonalizada {
}

class ContaException extends Exception {
    public ContaException(String msg){
        super(msg);
    }
}

class  Conta{
    private  double saldo = 100;
    private  boolean ativo = false;

    public void ativarConta(){
        ativo = true;
    }

    public void sacar(double valor) throws ContaException {

        if (valor > saldo){
            throw new ContaException("Erro ao sacar Saldo Insuficiente ...");
        }

        if (ativo != true){
            throw  new ContaException("Conta esta inativa tente novamente depois ...");
        }

        saldo -= valor;
    }
}