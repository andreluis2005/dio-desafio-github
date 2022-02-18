package base;

public interface IConta {

    void sacar(double valor);

    void depositar(double depositar);

    void transferir(double valor, Conta contaDestino);

    void imprimirExtrato();

}