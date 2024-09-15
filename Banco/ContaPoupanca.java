class ContaPoupanca extends Conta {
    public ContaPoupanca(String titular) {
        super(titular);
    }

    @Override
    public void depositar(double valor) {
        saldo += valor;
        System.out.println("Depósito de R$ " + valor + " realizado na conta poupança de " + titular);
    }

    @Override
    public void sacar(double valor) {
        if (saldo >= valor) {
            saldo -= valor;
            System.out.println("Saque de R$ " + valor + " realizado na conta poupança de " + titular);
        } else {
            System.out.println("Saldo insuficiente para o saque na conta poupança de " + titular);
        }
    }
}
