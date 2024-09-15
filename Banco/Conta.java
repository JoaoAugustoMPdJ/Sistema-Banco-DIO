package Banco;

abstract class Conta {
    protected String titular;
    protected double saldo;

    public Conta(String titular) {
        this.titular = titular;
        this.saldo = 0.0;
    }

    public double getSaldo() {
        return saldo;
    }

    public abstract void depositar(double valor);

    public abstract void sacar(double valor);

    public void transferir(Conta contaDestino, double valor) {
        this.sacar(valor);
        contaDestino.depositar(valor);
    }
}
